package projeto.laschicas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.laschicas.database.GerenciadorConexaoImpl;
import projeto.laschicas.domain.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private final String sqlInsert = "INSERT INTO Usuario (login, senha, ativo) VALUES (?,?,?)";
	private final String sqlFind = "SELECT idUsuario,login,ativo FROM Usuario WHERE login = ? and senha = ? ";

	/**
	 * Este metodo insere no banco de dados o Usuario passado
	 * � criada a conex�o com o banco de dados e fechada ao fim do uso.
	 * @return void
	 * @param Usuario user
	 */
	@Override
	public void insert(Usuario user) throws Exception {

		Connection conn = null;
		PreparedStatement statement = null;

		if (user != null) {
			try {
				conn = GerenciadorConexaoImpl.getInstancia().abrirConexao();
				statement = conn.prepareStatement(sqlInsert);

				statement.setString(1, user.getLogin());
				statement.setString(2, user.getSenha());
				statement.setBoolean(3, user.isAtivo());

				statement.executeUpdate();

			} catch (Exception e) {
				if (e.getMessage().startsWith("Duplicate entry")) {
					throw new SQLException(
							"J� existe um usuario com o login selecionado ("
									+ user.getLogin() + ").");
				}
				throw new SQLException(
						"Erro nao identificado ao inserir no banco "
								+ e.getMessage());

			} finally {

				if (statement != null) {
					statement.close();
				}

				if (conn != null) {
					conn.close();
				}
			}
		}
	}

	/**
	 * Este metodo procura no banco de dados o Usuario passado
	 * � criada a conex�o com o banco de dados e fechada ao fim do uso.
	 * @return void
	 * @param Usuario user
	 */
	@Override
	public List<Usuario> find(Usuario user) throws Exception {

		List<Usuario> retorno = null;

		Connection conn = null;
		PreparedStatement statement = null;

		if (user != null) {
			try {
				conn = GerenciadorConexaoImpl.getInstancia().abrirConexao();
				statement = conn.prepareStatement(sqlFind);

				statement.setString(1, user.getLogin());
				statement.setString(2, user.getSenha());

				ResultSet result = statement.executeQuery();

				retorno = new ArrayList<Usuario>();
				while (result.next()) {
					Usuario temp = new Usuario();
					temp.setId(result.getInt("idUsuario"));
					temp.setLogin(result.getString("login"));
					temp.setAtivo(result.getBoolean("ativo"));
					retorno.add(temp);
				}

			} catch (Exception e) {
				if (e.getMessage().startsWith("Duplicate entry")) {
					throw new SQLException(
							"J� existe um usuario com o login selecionado ("
									+ user.getLogin() + ").");
				}
				throw new SQLException(
						"Erro nao identificado ao inserir no banco "
								+ e.getMessage());

			} finally {

				if (statement != null) {
					statement.close();
				}

				if (conn != null) {
					conn.close();
				}
			}
		}
		return retorno;
	}
}
