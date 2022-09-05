package com.example.backend.service;

import com.example.backend.model.dto.UserCredentialsDto;
import com.example.backend.model.dto.UserDto;

public interface UserService {
    public UserDto login(UserCredentialsDto userCredentialsDto);
    public UserDto register(UserCredentialsDto userCredentialsDto);
}
