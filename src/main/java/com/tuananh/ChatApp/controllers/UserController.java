package com.tuananh.ChatApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tuananh.ChatApp.enities.User;
import com.tuananh.ChatApp.helpers.ApiResponse;
import com.tuananh.ChatApp.services.ServiceImpl.UserService;

@RequestMapping("/user")
@Controller
@CrossOrigin(origins = {"*"})

public class UserController {

	@Autowired
    private UserService userService;
	@GetMapping("/getAlls")
	public ResponseEntity<ApiResponse> getAllUser(){
        ApiResponse object = new ApiResponse();
        List<User> data = userService.getAllUser();
        object.setCode(200);
        object.setData(data);
        object.setStatus(true);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
}
