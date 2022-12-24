package com.expense.tracker.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expense.tracker.model.Expense;
import com.expense.tracker.service.ExpenseService;

@CrossOrigin("*")
@RestController
public class ExpenseController {
	
	@Autowired
	private ExpenseService service;
	
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> findAllExpenses(){
		
		List<Expense> expensesList = service.findAll();
		
		return new ResponseEntity<List<Expense>>(expensesList,HttpStatus.OK);
		
	}

	@PostMapping("/expenses")
	public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense){
		Expense e=service.save(expense);
		return new ResponseEntity<Expense>(e,HttpStatus.CREATED);
	}
	
	@GetMapping("/expenses/{id}")
	public Optional<Expense> findExpenseById(@PathVariable int id) {
		
		Optional<Expense> expense = service.findById(id);
		//List<Expense> e= expense.ifPresent(Collectors.toList());
		return expense;
	
	}
}
