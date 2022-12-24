package com.expense.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.tracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
