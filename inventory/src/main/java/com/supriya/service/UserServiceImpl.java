package com.supriya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supriya.model.User;
import com.supriya.repository.IUserRepository;
import com.supriya.request.UserDetails;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	public String addUser(UserDetails users) {
		User n = new User();
		n.setName(users.getName());
		n.setEmail(users.getEmail());
		n.setDob(users.getDob());
		n.setMarriageAnniversary(users.getMarriageAnniversary());
		n.setRefrenceCustomers(users.getRefrenceCustomers());
		n.setSpouseDbo(users.getSpouseDbo());
		n.setSpouseName(users.getSpouseName());
		userRepository.save(n);
		return "Saved";
	}

	public Iterable<User> getAllUsers() {
	    return userRepository.findAll();
	  }

	@Override
	public User getUsersByName(String name) {
		return userRepository.findByName(name);
	}
	
}
