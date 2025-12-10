package com.tcs.boot;

//import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TcsmsfirstwebApplication implements ApplicationRunner {
	@Autowired
	ProductRepository repository;
	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(TcsmsfirstwebApplication.class, args);
	String bean[]=context.getBeanDefinitionNames();
	for(String b:bean) {
		System.out.println(b);
	}
	System.out.println("==============================");
	System.out.println(bean.length);
	System.out.println("==============================");
	System.out.println(context.getBeanDefinitionCount());
	System.out.println("==============================");
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Product p1=new Product();
		p1.setPid(108);
		p1.setDescription("charger");
		//p1.setPurchasedon(new Date(0025,11,26));
		p1.setPurchasedon("2025,11,26");
		p1.setQty(12);
		p1.setPrice(300);
		repository.save(p1);
		System.out.println(p1);
		
		
		
		
	}

}
