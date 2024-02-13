package com.app.services.Impl;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.exceptions.*;
import com.app.entities.User;
import com.app.payloads.UserDTO;
import com.app.repository.UserRepo;
import com.app.services.UserService;

@Service
public class UserServiceImpl  implements UserService{

@Autowired
private UserRepo userRepo;   // instance of DTO  import hear
	
//-------------------------------------------------
	
	@Override
	public UserDTO createUser(UserDTO userDTO) {
		User user=this.dtoToUser(userDTO);
		User savedUser=this.userRepo.save(user);
		return this.userToUserDTO(savedUser);
		//UserRepo provides the save method
	}
	
	
//-------------------------------------------------	

	
	
	@Override
	public UserDTO updateUser(UserDTO userdto, Integer userid) {
		
		// After Implement
		
		return userdto;
	}
	
	
	
	
//------------------------------------------------
	@Override
	public UserDTO getUserById(Integer userid) {
		User user =this.userRepo.findById(userid).orElseThrow(() -> new ResourseNotFoundException("User","Id","userid"));
		return this.userToUserDTO(user);
	}
//--------------------------------------------------
	
	

	@Override
	public List<UserDTO> getAllUsers() {
		List <User> users= this.userRepo.findAll();
		List<UserDTO> userdtos=users.stream().map(user->userToUserDTO(user)).collect(Collectors.toList());
		return null;
	}
//------------------------------------------------------
	
	
	
	
	@Override
	public void delete(Integer userid) {
	User user=this.userRepo.findById(userid).orElseThrow(()-> new ResourseNotFoundException("User", "Id"," userId"));
   this.userRepo.delete(user);
// @formatter:on

		
	}
//----------------------------------------------------------------
//When We are Not Using Model Mapper
 // a.Convert user to userdto
	
	private User dtoToUser(UserDTO userDTO)
	{
		User user=new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setPassword(userDTO.getPassword());
		user.setAbout(userDTO.getAbout());
		return user;
	}
	
// b. Convert UserDTO to User
	
	private UserDTO userToUserDTO(User user) {
		UserDTO userDTO=new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setEmail(user.getEmail());
		userDTO.setPassword(user.getPassword());
		userDTO.setAbout(user.getAbout());
		return userDTO;
	}
	
//-------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
