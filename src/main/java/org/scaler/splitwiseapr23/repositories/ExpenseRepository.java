package org.scaler.splitwiseapr23.repositories;

import org.scaler.splitwiseapr23.models.Expense;
import org.scaler.splitwiseapr23.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findAllByGroup(Group group);
}

// select * from expenses where group_id = ? ;