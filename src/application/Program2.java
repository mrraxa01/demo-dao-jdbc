package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
				
		System.out.println("\n==== TEST 1 : seller insert ====\n");
		Department newDep = new Department(null, "Food");
		depDao.insert(newDep);
		System.out.println("Inserted!! New ID department = " + newDep.getId());

	}

}
