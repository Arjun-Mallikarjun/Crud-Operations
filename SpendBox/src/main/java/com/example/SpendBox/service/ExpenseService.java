package com.example.SpendBox.service;
import java.security.PublicKey;
import java.util.List;
import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.SpendBoxRepository.ExpenseRepository;

 @Service
public class ExpenseService {
	 
	@Autowired 
  private ExpenseRepository expenserepo;
	
	  Public Expense saveExpense(Expense expense){
		  return expenserepo.save(expense);
	  }
	
	
	 
	  
	  
	  
  
}
