package com.bank.loanapplication.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanApplicationServiceTest {

    private LoanApplicationService loanApplicationService = new LoanApplicationService();

    @Test
    public void testProcessLoanApplication() {
        String result = loanApplicationService.processLoanApplication();
        assertEquals("Processing Loan Application", result);
    }
}