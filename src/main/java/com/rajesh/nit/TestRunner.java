package com.rajesh.nit;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rajesh.nit.model.Book;
@Component
public class TestRunner implements CommandLineRunner {
@Autowired
private BookRepository brepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("F:\\rajesh.jpg");
		byte[] by=new byte[fis.available()];
		fis.read(by);
		String str="Rajesh Kumar Das";
		char[] ch=str.toCharArray();
				brepo.save(new Book(10,"Rajesh Book","R143",by,ch));
				
				
	}

}
