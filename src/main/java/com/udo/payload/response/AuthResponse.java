package com.udo.payload.response;

import com.udo.payload.DTO.UserDTO;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private UserDTO userDTO;
}
