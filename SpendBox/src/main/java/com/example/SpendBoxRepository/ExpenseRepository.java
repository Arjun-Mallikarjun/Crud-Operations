package com.example.SpendBoxRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpendBox.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

}
