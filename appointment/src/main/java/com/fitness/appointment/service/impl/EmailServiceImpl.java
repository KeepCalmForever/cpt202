package com.fitness.appointment.service.impl;

import com.fitness.appointment.service.EmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendUpgradeConfirmationEmail(String recipientEmail, String membershipLevel) {
        // Implement logic to send confirmation email using SMTP
    }
}