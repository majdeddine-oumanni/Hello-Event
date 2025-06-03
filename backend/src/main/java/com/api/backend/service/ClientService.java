package com.api.backend.service;

import com.api.backend.DTO.UserDTO;
import com.api.backend.mapper.UserMapper;
import com.api.backend.model.Role;
import com.api.backend.model.User;
import com.api.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public ClientService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> showAllClients(){
        List<UserDTO> clients = userMapper.toDTOs(userRepository.findByRole(Role.CLIENT));
        return clients;
    }

    public void deleteClient(Long id){
        userRepository.deleteById(id);
    }

    public UserDTO updateUser(UserDTO dto, Long id){
        User user = userRepository.findUserById(id);
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        return userMapper.toDTO(userRepository.save(user));
    }
}
