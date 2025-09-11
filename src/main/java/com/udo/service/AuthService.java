package com.udo.service;

import com.udo.payload.DTO.UserDTO;
import com.udo.payload.response.AuthResponse;

public interface AuthService {
    AuthResponse signup(UserDTO userDTO);

    AuthResponse login(UserDTO userDTO);
}
