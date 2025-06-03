package com.api.backend.controller;

import com.api.backend.DTO.UserDTO;
import com.api.backend.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients/manage")
public class ClientsManageController {
    private final ClientService clientService;

    public ClientsManageController(ClientService clientService) {
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
}
