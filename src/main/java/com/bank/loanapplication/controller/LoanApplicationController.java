package com.bank.loanapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApplicationController {

    @GetMapping("/loanApplication")
    public String getLoanApplication() {
        return "Loan Application Service is running";
    }
}