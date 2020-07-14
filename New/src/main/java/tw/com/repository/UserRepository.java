package tw.com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tw.com.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User>findByEmail(String email);
	void deleteByEmail(String email);
}
