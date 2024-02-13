package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.payloads.UserDTO;
import com.app.services.UserService;



@RestController
@RequestMapping("/apis/users")
public class UserController {

@Autowired // Injection
private UserService userService;
	
//----------------------------------
//Post -create user

@PostMapping("/")
public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO)
{
	UserDTO createUserDTO=this.userService.createUser(userDTO);
	return new ResponseEntity<>(createUserDTO,HttpStatus.CREATED);
}
//------------------------------------
	
//Delete - delete User
	
//Get -user get 
	
// Put - update user	


//@PutMapping("/{userId}")
//public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userdto,@PathVariable ("UserId")Integer userId)
//{
	
//}















}

// DTO is used for abstraction
//Eg. if we donot want to add password , so skip Entity and use DTO with no Password