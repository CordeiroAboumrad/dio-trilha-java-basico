package dio.webswagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.webswagger.model.Usuario;
import dio.webswagger.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping("users")
	public List<Usuario>getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("user/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	
	@GetMapping("user_id/{id}")
	public Usuario getOneById(@PathVariable("id") Integer id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("user/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PostMapping("users")
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	
}
