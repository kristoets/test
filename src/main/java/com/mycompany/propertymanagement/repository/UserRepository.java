
package com.mycompany.propertymanagement.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.propertymanagement.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	Optional<UserEntity> findByEmailAndPassword(String email, String password);
	Optional<UserEntity> findByEmail(String email);
	

}
