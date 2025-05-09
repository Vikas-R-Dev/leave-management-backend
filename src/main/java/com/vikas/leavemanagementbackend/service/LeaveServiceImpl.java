package com.vikas.leavemanagementbackend.service;

import com.vikas.leavemanagementbackend.model.Leave;
import com.vikas.leavemanagementbackend.repository.LeaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {

    private final LeaveRepository leaveRepository;

    public LeaveServiceImpl(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    @Override
    public Leave saveLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    @Override
    public List<Leave> getAllLeaves() {
        return leaveRepository.findAll();
    }
}
