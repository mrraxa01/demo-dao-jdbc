package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("==== TEST 1 : seller findById ====\n");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2 : seller findByDepartment ====\n");
		Department department = new Department (2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3 : seller findByALL ====\n");
		
		 list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n==== TEST 4 : seller insert ====\n");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!! New ID = " + newSeller.getId());
		
		System.out.println("\n==== TEST 5 : seller update ====\n");
		seller = sellerDao.findById(1);
		seller.setBaseSalary(3500.00);
		sellerDao.update(seller);
		System.out.println("Update Complete!!");
		
		System.out.println("X!X!X!X!X!X!X!X!X!X!X _____X!X!!X!X!X!");
		System.out.println("\n==== TEST 6 : seller delete ====\n");
		System.out.println("Enter ID for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("DELETE COMPLETED!!!");
		
		sc.close();
	}

}
