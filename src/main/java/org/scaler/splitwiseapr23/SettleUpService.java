package org.scaler.splitwiseapr23;

import org.scaler.splitwiseapr23.models.Expense;
import org.scaler.splitwiseapr23.models.Group;
import org.scaler.splitwiseapr23.models.Transaction;
import org.scaler.splitwiseapr23.repositories.ExpenseRepository;
import org.scaler.splitwiseapr23.repositories.GroupRepository;
import org.scaler.splitwiseapr23.strategies.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {
    private GroupRepository groupRepository;
    private ExpenseRepository expenseRepository;
    private SettleUpStrategy settleUpStrategy;

    @Autowired
    SettleUpService(
            GroupRepository groupRepository,
            ExpenseRepository expenseRepository,
            SettleUpStrategy settleUpStrategy
    ) {
        this.groupRepository = groupRepository;
        this.expenseRepository = expenseRepository;
        this.settleUpStrategy = settleUpStrategy;
    }

    public List<Transaction> settleUpUser(
            Long userId
    ){
        // 1. check if user exists
        // 2. Corresponding to the user , get all the UserExpenses
        // 3. For all of these userExpenses get the expense detail
        // 4. use you algo on these expenses to settle your user
        // 5. once you get the transactions , you can filter out only those transactions which are associated to your user
        return null;
    }

    public List<Transaction> settleUpGroup(
            Long groupId
    ){
        // 1. check if group exists
        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if(groupOptional.isEmpty()){
            throw new RuntimeException("Group not found");
        }
        Group group = groupOptional.get();
        // 2. if it exists, get all the expenses of the group
        List<Expense> expenses =  expenseRepository.findAllByGroup(group);
        // 3. use the algo to find the transactions
        // 4. return the transactions
        return settleUpStrategy.settleUp(expenses);

    }
}


// A : 500 , C : 500 , B : -1000
// Expense 1
    // UserExpense 1 : User : A , amt : 500
    // UserExpense 2 : User : B , amt : -1000
    // UserExpense 3 : User : C , amt : 500


// B : 1500 , C : -500 , A : -1000
// Expense 2
    // UserExpense 1 : User : A , amt : -1000
    // UserExpense 2 : User : B , amt : 1500
    // UserExpense 3 : User : C , amt : -500