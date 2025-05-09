package com.vikas.leavemanagementbackend.service;

import com.vikas.leavemanagementbackend.model.Leave;
import java.util.List;

public interface LeaveService {
    Leave saveLeave(Leave leave);
    List<Leave> getAllLeaves();
}
