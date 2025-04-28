package com.aits.restapidemo;
 
import org.springframework.data.repository.CrudRepository;
 
public interface UserRepository extends CrudRepository<User,Long> {
}
 