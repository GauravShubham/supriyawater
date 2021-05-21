package com.supriya.repository;

import org.springframework.data.repository.CrudRepository;

import com.supriya.model.User;




public interface IUserRepository extends CrudRepository<User, Integer> {

	User findByName(String name);

}