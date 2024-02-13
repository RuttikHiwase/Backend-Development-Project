package com.app.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDTO {

	private int id;
	private String name;
	private String email;
	private String password;
	private String about;

}


//Used for Abstraction
//When we will requires the field we will not use the POJO or Entity fields.
//We will use the DTO