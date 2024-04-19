package org.scaler.splitwiseapr23.dtos;

import lombok.Getter;
import lombok.Setter;
import org.scaler.splitwiseapr23.models.Transaction;

import java.util.List;

@Getter
@Setter
public class SettleUpUserResponseDTO {
    private ResponseStatus responseStatus;
    private List<Transaction> transactions;
}
