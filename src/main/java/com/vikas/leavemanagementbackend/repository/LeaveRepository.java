package com.vikas.leavemanagementbackend.repository;

import com.vikas.leavemanagementbackend.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long> {
}
