package com.app.services.Impl;

import java.util.List;

import com.app.payloads.UserDTO;
import com.app.repository.UserRepo;
import com.app.services.UserService;

public class UserServiceImpl  implements UserService{

	private UserRepo userRepo;   // instance of DTO  import hear
	
	
	
	@Override
	public UserDTO createUser(UserDTO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO updateUser(UserDTO user, Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserById(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer userid) {
		// TODO Auto-generated method stub
		
	}

}
