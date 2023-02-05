package dio.webswagger.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import dio.webswagger.handler.BusinessException;
import dio.webswagger.model.Usuario;


@Repository
public class UserRepository {
//	MOCK
	public void save(Usuario usuario) {
		if(usuario.getLogin() == null)
			throw new BusinessException("O campo login é obrigatório");
		if(usuario.getId() == null)
			System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		else
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
	}
	
	public void deleteById(Integer id) {
		System.out.println("DELETE/id - Recebendo o id: %d para excluir um usuário");
		System.out.println(id);
	}
	
	public List<Usuario> findAll() {
		System.out.println("LIST - Listando todos os usuários do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("jean", "1234"));
		usuarios.add(new Usuario("gleyson", "password"));
		return usuarios;
	}
	
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/ID - Recebendo o id: %d para localizar um usuário", id));
		return new Usuario("gleyson", "password");
	}
	
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/ID - Recebendo o username: %s para localizar um usuário", username));
		return new Usuario("gleyson", "password");
	}
	
	
}
