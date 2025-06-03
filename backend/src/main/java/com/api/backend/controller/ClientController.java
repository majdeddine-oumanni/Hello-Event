package com.api.backend.controller;

import com.api.backend.DTO.UserDTO;
import com.api.backend.model.User;
import com.api.backend.service.ClientService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/list")
    public List<UserDTO> getClientsList(){
        return clientService.showAllClients();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        clientService.deleteClient(id);
    }
    
    @PutMapping("/update/{id}")
    public UserDTO update(@RequestBody UserDTO dto, @PathVariable Long id){
        return clientService.updateUser(dto, id);
    }
}
