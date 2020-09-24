package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		/*		
		System.out.println("\n==== TEST 1 : department insert ====\n");
		Department newDep = new Department(null, "Food");
		depDao.insert(newDep);
		System.out.println("Inserted!! New ID department = " + newDep.getId());
		
		System.out.println("\n==== TEST 2 : department update ====\n");
		Department dep = new Department(6,"Tools");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n==== TEST 3 : department delete ====\n");
		//Department dep = new Department();
		depDao.deleteById(11);
		System.out.println("Delete OK!");

		System.out.println("\n==== TEST 4 : department findByID ====\n");
		Department dep = depDao.findById(6);
		System.out.println(dep);*/
		
		System.out.println("\n==== TEST 4 : department findByAll ====\n");	
		List <Department> list = depDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
	}

}
