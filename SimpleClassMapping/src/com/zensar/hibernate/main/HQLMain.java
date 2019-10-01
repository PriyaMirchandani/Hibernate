package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;


//hibernate query lang(object oriented query language)

public class HQLMain {
	public static void main(String[] args) {
      
		 Configuration c=new Configuration().configure();
		  SessionFactory f =c.buildSessionFactory();
		  Session s=f.openSession();
		  Transaction t=s.beginTransaction();
		  //JPA java persistence api query
		  
	   //Query q=s.createQuery("from Product");
		  
		  // Query q=s.createQuery("from Product p where p.price>1200 and p.price<3000" );
		 // Query q=s.createQuery("from Product p where p.price between 1200 and 3000" );
		//  Query q=s.createQuery("from Product p where p.brand like 'W%' " );
		 //Query q=s.createQuery("from Product p where p.name='Mobile' " );
		 // Query q=s.createQuery("select p.name,p.price from Product p");
		 // Query q=s.createQuery(" p.price from Product p");
		  
		 /* List<Product>products=q.getResultList();
			  for(Product product:products)
			  {
				  
			  System.out.println(product);
			  }
			  */
		/*
		 * Query q=s.createQuery("select p.name,p.price from Product p"); // 
		 * Query q=s.createQuery("select p.productId,p.name,p.brand, from Product p"); //
		 * Query q=s.createQuery("select p.price,p.brand,p.name from Product p ");
		 * List<Object[]>objects=q.getResultList(); 
		 * for(Object[]ob:objects)
		 *  { 
		 *  for(int i=0;i<ob.length;i++)
		 *   {
		 *    System.out.print(ob[i]+" ");
		 *     } 
		 *     System.out.println();
		 *      }
		 */
		  
		     Query q=s.createQuery("select max(p.price) from Product p");
		     Double maxPrice=(Double) q.getSingleResult();
		     System.out.println(maxPrice);
	 
		     Query q1=s.createQuery("select min(p.price) from Product p");
			 Double minPrice=(Double) q1.getSingleResult();
			 System.out.println(minPrice);
			 
			 Query q2=s.createQuery("select sum(p.price) from Product p");
			 Double sumPrice=(Double) q2.getSingleResult();
			 System.out.println(sumPrice);
		 	 
			 Query q3=s.createQuery("select avg(p.price) from Product p");
			 Double avgPrice=(Double) q3.getSingleResult();
			 System.out.println(avgPrice);
		 	 
		      
			 Query q4=s.createQuery("select count(p.price) from Product p");
			 Long countPrice=(Long) q4.getSingleResult();
			 System.out.println(countPrice);
		 	 
		 
			 Criteria cr=s.createCriteria(Product.class);
			 List<Product>products=cr.list();
			 for(Product product:products)
			 {
				 System.out.println(product);
			 }
			 
			 
			 
			 
		  t.commit();
		   s.close();
		
	}

	

}
