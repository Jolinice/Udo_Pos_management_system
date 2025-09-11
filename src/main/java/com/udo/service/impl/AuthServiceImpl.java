package com.udo.service.impl;

import com.udo.configuration.JwtProvider;
import com.udo.exceptions.UserException;
import com.udo.model.User;
import com.udo.payload.DTO.UserDTO;
import com.udo.payload.response.AuthResponse;
import com.udo.repository.UserRepository;
import com.udo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final CustomUserImplementation customUserImplementation;

    @Override
    public AuthResponse signup(UserDTO userDTO) throws UserException {
        User user = userRepository.findByEmail(userDTO.getEmail());
        if(user != null){
            throw new UserException("Email id already registered");
        }
        return null;
    }

    @Override
    public AuthResponse login(UserDTO userDTO) {
        return null;
    }
}
