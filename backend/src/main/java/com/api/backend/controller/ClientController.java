package com.api.backend.controller;

import com.api.backend.DTO.UserDTO;
import com.api.backend.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PutMapping("/update/{id}")
    public UserDTO update(@RequestBody UserDTO dto, @PathVariable Long id){
        return clientService.updateUser(dto, id);
    }
}
