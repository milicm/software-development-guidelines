package com.softdevguide.designstrategies.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softdevguide.common.model.User;
import com.softdevguide.designstrategies.repository.UserRepository;
import com.softdevguide.designstrategies.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		preconditions(user);
		User saved = userRepository.save(user);
		postconditions(saved);
		return saved;
	}

	private void preconditions(User user) throws RuntimeException {
		if (user == null || user.getUsername() == null || user.getPassword() == null) {
			throw new RuntimeException("Invalid user data!");
		}
	}

	private void postconditions(User user) throws RuntimeException {
		if (user == null || user.getId() == 0) {
			throw new RuntimeException("User not saved!");
		}
	}

}
