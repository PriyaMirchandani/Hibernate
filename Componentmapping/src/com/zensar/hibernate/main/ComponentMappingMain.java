package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.Proxy;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;


public class ComponentMappingMain {
public static void main(String[] args) {
	Configuration c=new Configuration().configure() ;
	SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t= s.beginTransaction();
	Name name=new Name();
	name.setFirst("suresh");
	name.setMiddle("kumar");
	name.setLastName("mirchandani");
	
	
	Customer cu=new Customer();
	cu.setCustomerId(103);
	cu.setCustomername(name);
	cu.setGender("male");
	cu.setAge(50);
	cu.setAddress("bhopal");
	cu.setBirthday(LocalDate.of(1968, 8, 9));
	try {
		File photo=new File("./resources/download.jfif");
		FileInputStream fis=new FileInputStream(photo);
		Blob customerPhoto=BlobProxy.generateProxy(fis, photo.length());
		cu.setProfilePhoto(customerPhoto);
		File file=new File("./resources/CustomerInfo.txt");
		FileReader fr=new FileReader(file);
		Clob description=ClobProxy.generateProxy(fr, file.length());
		cu.setDescription(description);
		s.save(cu);
		t.commit();
		s.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
