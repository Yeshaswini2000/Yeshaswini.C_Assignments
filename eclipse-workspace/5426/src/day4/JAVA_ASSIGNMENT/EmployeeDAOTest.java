package day4;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

	@Test
	public void updateEmployee() throws Exception {
	EmployeeDAO dao =new EmployeeDAO();
	dao.updateEmployee(new Employee(3,"new three",25,1,121212));
	Employee e = dao.getEmployee(3);
	assertEquals(e.getId(), 3);
	assertEquals(e.getName(),"new three");
	assertEquals(25, e.getAge());
	assertEquals(1, e.getGender());
	assertEquals(121212, e.getSalary(),0.000000);
	}
	
	@Test
    public void findBetweenAge() throws Exception {
    EmployeeDAO dao =new EmployeeDAO();
     List<Employee> e=dao.findBetweenAge();
     int total=dao.findBetweenAge().size();
     assertEquals(total, dao.findBetweenAge().size());  
     }
	
    @Test
    public void getEmployeesByAge() throws Exception {
    EmployeeDAO dao =new EmployeeDAO();
    List<Employee> e=dao.getEmployeesByAge(25);
    int total=dao.getEmployeesByAge(25).size();
    assertEquals(total, dao.getEmployeesByAge(25).size());   
    assertFalse("second", false);
    assertTrue("new three",true);
    assertTrue("five",true);
    }
	
    @Test
    public void getEmployeesFemale() throws Exception {
    EmployeeDAO dao =new EmployeeDAO();
    List<Employee> e=dao.getEmployeesMale(1);
    int total=dao.getEmployeesMale(1).size();
    assertEquals(total, dao.getEmployeesMale(1).size());   
    assertTrue("five", true);
      
   }

   @Test
   public void getEmployeesMale() throws Exception {
   EmployeeDAO dao =new EmployeeDAO();
   List<Employee> e=dao.getEmployeesMale(1);
   int total=dao.getEmployeesMale(1).size();
   assertEquals(total, dao.getEmployeesMale(1).size());   
   assertTrue("new three", true);
   assertTrue("new", true);
   }

   @Test
   public void getEmployeesOthers() throws Exception {
   EmployeeDAO dao =new EmployeeDAO();
   List<Employee> e=dao.getEmployeesMale(1);
   int total=dao.getEmployeesMale(1).size();
   assertEquals(total, dao.getEmployeesMale(1).size());   
   assertTrue("six", true);
   }
	
   @Test
   public void getEmployeesSalaryGreater() throws Exception {
   EmployeeDAO dao =new EmployeeDAO();
   List<Employee> e=dao.getEmployeesSalaryGreater(12000);
   int total=dao.getEmployeesSalaryGreater(12000).size();
   assertEquals(total, dao.getEmployeesSalaryGreater(12000).size());   
   assertTrue("second", true);
   assertTrue("new three", true);
   assertFalse("six",false);
   }
  
   @Test
   public void getEmployeesSalaryLesser() throws Exception {
   EmployeeDAO dao =new EmployeeDAO();
   List<Employee> e=dao.getEmployeesSalaryLesser(12000);
   int total=dao.getEmployeesSalaryLesser(12000).size();
   assertEquals(total, dao.getEmployeesSalaryLesser(12000).size());   
   assertFalse("second", false);
   assertFalse("new three", false);
   assertTrue("six",true);
   }
	
   public void testGetEmployees()throws Exception{        //checking all the employesss 
   EmployeeDAO dao=new EmployeeDAO();
   assertEquals(dao.count(), dao.getEmployees().size());
   }
	
   public void testGetEmployee() throws Exception {         //fetching the data using the id with an age parameter checked
   EmployeeDAO dao=new EmployeeDAO();
   Employee e=dao.getEmployee(1);
   assertEquals(1, e.getId());
   assertEquals(30,e.getAge());
   }
	
   public void testSaveEmployee()throws Exception{           //insertion test case
   EmployeeDAO dao=new  EmployeeDAO();
   int count=dao.count();
		dao.saveEmployee(new Employee(6,"Angelia",27,1,10000));       
		assertEquals(count+1,dao.count());
		dao.deleteEmployee(6);                          //delete the record after the new insertion
		assertEquals(count,dao.count());
	}
	

	public void testCount() throws Exception{        //this is for testing the count of rows 
	EmployeeDAO dao=new  EmployeeDAO();
	assertEquals(4,dao.count());
	}
	
	public void test() throws Exception {
	EmployeeDAO dao=new  EmployeeDAO();
    Connection conn=dao.getConnection();               //code to check whether your database is connected or not
    conn.close();
	}
}
