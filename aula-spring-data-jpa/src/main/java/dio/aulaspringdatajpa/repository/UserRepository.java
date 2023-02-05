package dio.aulaspringdatajpa.repository;

import java.util.List;
import dio.aulaspringdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//	Query Method
	List<User> findByNameContaining(String name);
	
	//	Query Method
	User findByUsername(String username);
	
	//	Query Override
	@Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
	List<User> filtrarPorNome(@Param("name") String name);
}
