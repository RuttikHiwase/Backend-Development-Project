package com.app.services;

import java.util.List;

import com.app.payloads.UserDTO;

public interface UserService {

   UserDTO createUser(UserDTO user);//Takes UserDTO     // returns User DTO  with new new user added-->for Creating User
   
   
   
   UserDTO updateUser(UserDTO user,Integer userid);// Takes UserDTO    and ID to be Updated    //returns UserDTO
   
   
   UserDTO getUserById(Integer userid);//Takes UserId to be get    //returns UserDTO
   
   
   
   List<UserDTO> getAllUsers();//Returns All DTO List 
   
   
   void delete(Integer userid);  //takes user id and delete that user
}
