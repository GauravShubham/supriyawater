package com.supriya.repository;

import org.springframework.data.repository.CrudRepository;

import com.supriya.model.Orders;

public interface IOrdersRepository extends CrudRepository<Orders, Long> {

}
