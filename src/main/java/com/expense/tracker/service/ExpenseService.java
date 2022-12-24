package com.expense.tracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expense.tracker.dao.ExpenseRepository;
import com.expense.tracker.model.Expense;

@Service
public class ExpenseService {
	
	@Autowired
	ExpenseRepository repo;

	public List<Expense> findAll(){
		return repo.findAll();
	}
	
	public Expense save(Expense expense) {
		return repo.save(expense);
	}
	
	public Optional<Expense> findById(long id) {
		Optional<Expense> findById = repo.findById(id);
		return findById;
	}

}
