package org.scaler.splitwiseapr23.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private User userFrom;
    private User userTo;
    private int amount;
}
