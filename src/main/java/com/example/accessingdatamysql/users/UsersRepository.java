package com.example.accessingdatamysql.users;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.users.Users;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UsersRepository extends CrudRepository<Users, Integer> {

}