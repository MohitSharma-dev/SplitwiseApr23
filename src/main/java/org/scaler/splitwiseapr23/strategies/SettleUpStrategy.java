package org.scaler.splitwiseapr23.strategies;

import org.scaler.splitwiseapr23.models.Expense;
import org.scaler.splitwiseapr23.models.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SettleUpStrategy {
    public List<Transaction> settleUp(List<Expense> expenses);
}
