package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.pojo.Admin;
import com.demo.pojo.Bill;
import com.demo.pojo.Consumer;
import com.demo.repository.AdminRepository;
import com.demo.repository.BillRepository;
import com.demo.repository.ConsumerRepository;

@SpringBootApplication
public class SpringElectricityApplication implements CommandLineRunner {
	@Autowired
	BillRepository billRepository;
	
	@Autowired
	ConsumerRepository consumerRepository;
	
	@Autowired
	AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringElectricityApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Consumer c1 = new Consumer("Sita ramam", "anna nagar", "chennai",
				"domestic");
		Consumer c2 = new Consumer("Sunita", "anand vihar", "delhi",
				"domestic");
		consumerRepository.save(c1);
		consumerRepository.save(c2);
		
		billRepository.save(new Bill(c1,123,2022,"jan",200));
		billRepository.save(new Bill(c2,200,2022,"feb",300));
		
		Admin a1 = new Admin("admin","admin");
//		adminRepository.save(a1);
////		billRepository.save(new Bill(2,234,2022,"jun",2001));
////		billRepository.save(new Bill(9,12314,2022,"mar",200));
////		for(Bill emp:billRepository.findAllByYear(2022) ) {
////			System.out.println(emp);
////		}
//		for(Bill emp:billRepository.getBillsByMonth("jan", 2023, c1.getConsumerId()) ) {
//			System.out.println(emp);
//		}
		
	}

}
