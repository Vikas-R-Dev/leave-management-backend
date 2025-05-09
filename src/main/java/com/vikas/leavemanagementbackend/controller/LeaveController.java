package com.vikas.leavemanagementbackend.controller;

import com.vikas.leavemanagementbackend.model.Leave;
import com.vikas.leavemanagementbackend.service.LeaveService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leave")
public class LeaveController {

    private final LeaveService leaveService;

    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @PostMapping
    public Leave createLeave(@RequestBody Leave leave) {
        return leaveService.saveLeave(leave);
    }
}