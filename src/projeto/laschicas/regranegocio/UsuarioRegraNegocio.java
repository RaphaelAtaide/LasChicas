package projeto.laschicas.regranegocio;

import projeto.laschicas.domain.Usuario;

public class UsuarioRegraNegocio {

	public static void validate(Usuario user) {

		String validationExeptionMsg = "";

		if (user.getLogin() == null || "".equals(user.getLogin())) {
			validationExeptionMsg = validationExeptionMsg + "/n Erro no Login.";
		}
		if (user.getSenha() == null || "".equals(user.getSenha())) {
			validationExeptionMsg = validationExeptionMsg + "/n Erro na Senha.";
		}

		if (!validationExeptionMsg.isEmpty()) {
			throw new RuntimeException(validationExeptionMsg);
		}
	}

	public static void findValidate(Usuario user) {

		String validationExeptionMsg = "";

		if (user.getLogin() == null || "".equals(user.getLogin())) {
			validationExeptionMsg = validationExeptionMsg + "/n O campo Login nao pode ser vazio.";
		}
		if (user.getSenha() == null || "".equals(user.getSenha())) {
			validationExeptionMsg = validationExeptionMsg + "/n O campo Senha nao pode ser vazio.";
		}

		if (!validationExeptionMsg.isEmpty()) {
			throw new RuntimeException(validationExeptionMsg);
		}
	}
}
