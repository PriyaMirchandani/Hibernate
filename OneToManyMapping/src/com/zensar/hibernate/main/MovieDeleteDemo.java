package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {
	public static void main(String[] args) {
		
	Configuration c=new Configuration().configure();
	SessionFactory f=c.buildSessionFactory();
	Session s=f.openSession();
	Transaction t=s.beginTransaction();
	Movie m=s.get(Movie.class, 1);
	 
	System.out.println(m.getTitle());
	System.out.println(m.getReleaseDate());
	List<Song>songs=m.getSongs();
	
	for(Song s5:songs)
	{
		System.out.println(s5);
	}
	
	if(m!=null)
	{
		s.delete(m);
	}
	else
	{
		System.out.println("record not found");
	}
	
	
	t.commit();
	s.close();
}
}