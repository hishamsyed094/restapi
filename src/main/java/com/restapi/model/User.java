package com.restapi.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Document
public class User implements Serializable {

	@Id
	String id;
	String firstname;
	String middlename;
	String lastname;
	String mobile;
	String landline;
	String address;
	
}
