package com.udo.mapper;

import com.udo.model.User;
import com.udo.payload.DTO.UserDTO;

public class UserMapper {

    public static UserDTO toDTO(User savedUser){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(savedUser.getId());
        savedUser.setEmail(savedUser.getEmail());
        savedUser.setRole(savedUser.getRole());
        savedUser.setCreateAt(savedUser.getCreateAt());
        savedUser.setUpdateAt(savedUser.getUpdateAt());
        savedUser.setLastLoginAt(savedUser.getLastLoginAt());
        savedUser.setPhone(savedUser.getPhone());
        return userDTO;
    }
}
