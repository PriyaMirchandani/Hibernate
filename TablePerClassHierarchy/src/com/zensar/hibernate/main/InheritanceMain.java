package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		Configuration c=new Configuration().configure();
		SessionFactory f=c.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setName("Priya Mirchandani");
		e.setJoiningDate(LocalDate.of(2019, 8, 26));
		e.setSalary(25000.00);
		s.save(e);
		
		WageEmp we=new WageEmp();
		we.setName("Suresh kumar");
		we.setSalary(40000.00);
		we.setHours(9);
		we.setRate(200f);
		we.setJoiningDate(LocalDate.of(2000, 1, 1));
		s.save(we);
		t.commit();
		s.close();

	}

}
