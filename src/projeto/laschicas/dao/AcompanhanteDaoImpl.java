/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.dao;
import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projeto.laschicas.database.GerenciadorConexaoImpl;
import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public class AcompanhanteDaoImpl implements AcompanhanteDAO {

    
    private final String listQuery = 
            "SELECT * FROM ACOMPANHANTE WHERE (NOME LIKE ? OR CPF LIKE ?)";

    
    public void inserir(Acompanhante acompanhante) throws Exception {
      
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "INSERT INTO ACOMPANHANTE (nome,idade,cpf,valorHora,descricao) VALUES (?,?,?,?,?)";
                         
            PreparedStatement statement = con.prepareStatement(query);
            
            statement.setString(1, acompanhante.getNome());
            statement.setInt(2, acompanhante.getIdade());
            statement.setString(3, acompanhante.getCpf());
            statement.setDouble(4, acompanhante.getValorHora());
            statement.setString(5, acompanhante.getDescricao());
            statement.executeUpdate();
            
        } catch (SQLException ex) {
                throw new Exception(ex.getMessage());
        }
    }

    
    public void deletar(Integer id) throws Exception {
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
        String query = "DELETE ACOMPANHANTE FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setInt(1,id);
        statement.executeUpdate();
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }

    }

    
    public void atualizar(Acompanhante acompanhante) throws Exception{
       
       try {
        
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
          String query = "UPDATE ACOMPANHANTE SET NOME = ? ,IDADE = ? , CPF = ? ,VALORHORA = ?, DESCRICAO = ? WHERE IDACOMPANHANTE = ?";
          PreparedStatement statement = con.prepareStatement(query);
      
          statement.setString(1, acompanhante.getNome());
          statement.setInt(2, acompanhante.getIdade());
          statement.setString(3, acompanhante.getCpf());
          statement.setDouble(4, acompanhante.getValorHora());
          statement.setString(5, acompanhante.getDescricao());
          statement.setInt(6, acompanhante.getId());
       
          statement.executeUpdate();
       
       }catch (SQLException ex) {
          throw new Exception(ex.getMessage());
        }
       
    }

    
    public Acompanhante getAcompanhanteById(Integer id) throws Exception{
                Acompanhante acompanhante = new Acompanhante();
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ? ";
            PreparedStatement statement = con.prepareStatement(query);            
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                acompanhante.setId(result.getInt(1));
                acompanhante.setNome(result.getString(2));
                acompanhante.setIdade(result.getInt(3));
                acompanhante.setCpf(result.getString(4));
                acompanhante.setValorHora(result.getDouble(5));
                acompanhante.setDescricao(result.getString(6)); 
            }
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhante;
    }

    
    public Acompanhante getAcompanhanteByName(String nome) throws Exception{
            Acompanhante acompanhante = new Acompanhante();
        try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE WHERE NOME like ?";
            PreparedStatement statement = con.prepareStatement(query);            
            statement.setString(1,'%'+nome+'%');
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                
                acompanhante.setId(result.getInt(1));
                acompanhante.setNome(result.getString(2));
                acompanhante.setIdade(result.getInt(3));
                acompanhante.setCpf(result.getString(4));
                acompanhante.setValorHora(result.getDouble(5));
                acompanhante.setDescricao(result.getString(6)); 

            }
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhante;
    }
    
    public ArrayList<Acompanhante> getAllAcompanhantes() throws Exception{
        ArrayList<Acompanhante> acompanhantesList = new ArrayList<Acompanhante>();
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE";
            PreparedStatement statement = con.prepareStatement(query);            
            ResultSet result = statement.executeQuery();
            
            while (result.next()){                
                Acompanhante acompanhante = new Acompanhante();
                acompanhante.setId(result.getInt(1));
                acompanhante.setNome(result.getString(2));
                acompanhante.setIdade(result.getInt(3));
                acompanhante.setCpf(result.getString(4));
                acompanhante.setValorHora(result.getDouble(5));
                acompanhante.setDescricao(result.getString(6));                
                acompanhantesList.add(acompanhante);
            }
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }        
        return acompanhantesList;
    }
    
    
    @Override
    public ArrayList<Acompanhante> findAcompanhantes(Acompanhante acompanhante) throws Exception {
                
        ArrayList<Acompanhante> retorno = new ArrayList<Acompanhante>();
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            
            conn = GerenciadorConexaoImpl.getInstancia().abrirConexao();
            statement = conn.prepareStatement(this.listQuery);
            
            String qualquerPrefix = "%";
            statement.setString(1, StringUtils.isNullOrEmpty(acompanhante.getNome()) ? qualquerPrefix : qualquerPrefix+acompanhante.getNome()+qualquerPrefix);
            statement.setString(2, StringUtils.isNullOrEmpty(acompanhante.getCpf()) ? qualquerPrefix : qualquerPrefix+acompanhante.getCpf()+qualquerPrefix);
                 
            ResultSet result = statement.executeQuery();
            
            while (result.next()){                
                Acompanhante temp = new Acompanhante();
                temp.setId(result.getInt(1));
                temp.setNome(result.getString(2));
                temp.setIdade(result.getInt(3));
                temp.setCpf(result.getString(4));
                temp.setValorHora(result.getDouble(5));
                temp.setDescricao(result.getString(6));                
                retorno.add(temp);
            }
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }        
        return retorno;
    }

    @Override
    public void insertOrUpdadte(Acompanhante acompanhante) throws Exception {
        if(acompanhante.getId() ==  null){
        
        
        
        
        
        
        }
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
        String query = "DELETE ACOMPANHANTE FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ?";
        PreparedStatement statement = con.prepareStatement(query);
        statement.setInt(1,id);
        statement.executeUpdate();
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public Acompanhante findById(Integer id) throws Exception {
          Acompanhante acompanhante = new Acompanhante();
        try {
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LasChicas", "root", "grupo4");
            String query = "SELECT * FROM ACOMPANHANTE WHERE IDACOMPANHANTE = ? ";
            PreparedStatement statement = con.prepareStatement(query);            
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            
            while (result.next()){
                acompanhante.setId(result.getInt(1));
                acompanhante.setNome(result.getString(2));
                acompanhante.setIdade(result.getInt(3));
                acompanhante.setCpf(result.getString(4));
                acompanhante.setValorHora(result.getDouble(5));
                acompanhante.setDescricao(result.getString(6)); 
            }
        
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
       return acompanhante;
    }
}
