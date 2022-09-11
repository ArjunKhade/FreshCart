package com.app.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UserDto extends BaseDto{
	
	//TODO:add validation rules 
		@Column(length = 20)
		@NotBlank(message = "first name is required")
		@Size(min = 4,message = "Username must be min of 4 characters")
		private String name;
		
		
		@NotBlank(message = "email is required")
		@Email(message = "invalid email format")
		@Column(length = 20, unique = true, nullable = false)
		private String email;
		
		@Column(length = 20)
		@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message = "Password must be min 3 chars and max 20 must contain 1 digit,1 alfabet,1 special symbol")
		private String password;
		
		@NotBlank(message = "phone must be supplied")
		@Column(length = 20, unique = true, nullable = false)
		@Size(min = 10,max = 12,message = "phone number must be min 10 to 12 digit")
		private String phone;
		
		@Column(length = 20)
		@NotBlank(message = "city is required")
		private String city;
		
		@NotBlank(message = "pin is required")
		@Column(length = 20)
		@Size(min = 6,message = "Invalid pin")
		private String pin;
		
		@NotBlank(message = "address is required")
		private String address;
}