package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {
public static void main(String[] args) {
	   Configuration c=new Configuration().configure();
	  SessionFactory f =c.buildSessionFactory();
	  Session s=f.openSession();
	   Transaction t=s.beginTransaction();
	   //fetching record using load method
	//  Product p=s.load(Product.class, 1000);
	 //  System.out.println(p);
	   //get a record
	  
	  // Product p=s.get(Product.class, 1001);
	  // System.out.println(p);
	  // if(p!=null)
		//   System.out.println("record found"+"\n"+p);
	  // else
	  // {
	//	   System.out.println("record not found");
	  // }
	   //insert new record
	   //Product p=new Product(1003,"AC","LG",22000.00);
	  // s.save(p);
	   
	   /*updating a record
	   
	   Product p=s.get(Product.class, 1001);
		 
		   if(p!=null)
		   {
			   s.update(p);
			
		     p.setPrice(2300.98);
		   }
		   else
		   {
			   System.out.println("record not found");
		   }
		*/
	   //deleting a record
       
	   Product p=s.get(Product.class, 1001);
	   if(p!=null)
	   {
		   s.delete(p);
	   }
	   
	   else
	   {
		   System.out.println("record not found");
	   }
	   
	   t.commit();
	   s.close();
	   
	   
}
}