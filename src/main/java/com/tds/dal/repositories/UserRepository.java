package com.tds.dal.repositories;

import com.tds.dal.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
