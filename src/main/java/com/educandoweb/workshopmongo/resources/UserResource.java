package com.educandoweb.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshopmongo.domain.User2;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User2>> findAll() {
		User2 maria = new User2("1", "Maria Brown", "maria@gmail.com");
		User2 alex = new User2("2", "Alex Green", "alex@gmail.com");
		List<User2> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);		
	}
}
