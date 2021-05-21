package com.supriya.repository;

import org.springframework.data.repository.CrudRepository;

import com.supriya.model.Address;

public interface AddressReposiotry extends CrudRepository<Address, Integer> {

}
