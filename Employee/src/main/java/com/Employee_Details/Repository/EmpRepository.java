package com.Employee_Details.Repository;
import com.Employee_Details.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Integer>{

}
