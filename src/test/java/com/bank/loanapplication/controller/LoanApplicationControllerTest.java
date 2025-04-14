package com.bank.loanapplication.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class LoanApplicationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetLoanApplication() throws Exception {
        mockMvc.perform(get("/loanApplication"))
                .andExpect(status().isOk())
                .andExpect(content().string("Loan Application Service is running"));
    }
}