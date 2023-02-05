package dio.aulaspringdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
	@Autowired
	private UserRepository repository;
	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("Cordeiro Aboumrad");
//		user.setUsername("jean.aboumrad");
//		user.setPassword("4321");
//		
//		repository.save(user);
		
		List<User> users = repository.filtrarPorNome("Jean");
		for(User u: users) {
			System.out.println(u);
		}
		
		List<User> users2 = repository.findByNameContaining("Aboumrad");
		for(User u: users2) {
			System.out.println(u);
		}
				
//		for(User u: repository.findAll()) {
//			System.out.println(u);
//		}
	}
	
}
