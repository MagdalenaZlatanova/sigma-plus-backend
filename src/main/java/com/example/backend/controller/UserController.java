package com.example.backend.controller;

import com.example.backend.model.dto.StatusMessageDto;
import com.example.backend.model.dto.UserCredentialsDto;
import com.example.backend.model.dto.UserDto;
import com.example.backend.model.exceptions.InvalidPasswordException;
import com.example.backend.model.exceptions.UserDoesntExistException;
import com.example.backend.model.exceptions.UserExistsException;
import com.example.backend.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://sigma-plus-frontend.herokuapp.com")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserCredentialsDto userCredentialsDto){
        try{
            UserDto userDto = userService.login(userCredentialsDto);
            return ResponseEntity.ok(userDto);
        } catch (InvalidPasswordException e) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("Incorrect password"));
        } catch (UserDoesntExistException e) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("User doesn't exist"));
        }
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody UserCredentialsDto userCredentialsDto){
        try{
            UserDto userDto = userService.register(userCredentialsDto);
            return ResponseEntity.ok(userDto);
        } catch (UserExistsException e) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(new StatusMessageDto("Username taken"));
        }
    }
}
