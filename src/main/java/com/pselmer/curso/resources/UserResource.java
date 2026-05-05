package com.pselmer.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pselmer.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Paulo Selmer", "pauloselmer@gmail.com", "43 98402-4660", "123456");
		return ResponseEntity.ok().body(u);
	}
}
