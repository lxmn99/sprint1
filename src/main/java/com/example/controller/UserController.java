package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.*;
import com.example.service.UserService;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/users")
@Api(value = "UsersController", description = "Description for Users Controller")
public class UserController {
	@Autowired(required=true)
	UserService usersService;
	@PostMapping("/saveusers")
	@ApiOperation(value = "Save users", httpMethod = "POST")
	public ResponseEntity<?> saveUsers(@RequestBody User users)
	{
		usersService.save(users);
	 return ResponseEntity.ok(users+" saved");
	}
}
