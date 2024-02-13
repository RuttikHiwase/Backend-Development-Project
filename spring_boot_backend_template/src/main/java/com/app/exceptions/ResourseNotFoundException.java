package com.app.exceptions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourseNotFoundException extends RuntimeException{

	String resourseName;
	String fieldName;
	String fieldValue;
	public ResourseNotFoundException(String resourseName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : %l",resourseName,fieldName,fieldValue));
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}
//To create Un checked Exceptions