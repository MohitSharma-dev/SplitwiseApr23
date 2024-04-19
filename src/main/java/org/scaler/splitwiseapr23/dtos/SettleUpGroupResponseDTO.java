package org.scaler.splitwiseapr23.dtos;

import lombok.Getter;
import lombok.Setter;
import org.scaler.splitwiseapr23.models.Transaction;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDTO {
    private ResponseStatus responseStatus;
    private String failureMessage;
    private List<Transaction> transactions;

}

// To show-cases those transactions : Expense
// UserFrom, UserTo, amount