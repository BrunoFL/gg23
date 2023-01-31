package com.fapguys.studio.ggj23.model;


import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepository extends ListCrudRepository<User, Long> {

    List<User> findByLastName(String lastName);

    User findById(long id);

    List<User> findAll();
}
