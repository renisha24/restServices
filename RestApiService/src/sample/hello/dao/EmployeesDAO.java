package sample.hello.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sample.hello.model.Employees;
import sample.hello.util.DbUtil;

public class EmployeesDAO {
	private static Connection connection = null;
	
    public EmployeesDAO() {

        connection = DbUtil.getConnection();

    }
    
    public List<Employees> getEmployeesByEmpId(int empId) {

        List<Employees> employees = new ArrayList<Employees>();

        try {

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Employees where EMPLOYEE_ID="+empId);

            while (rs.next()) {

            	Employees employee = new Employees();
            	employee.setFirst_name(rs.getString("first_name"));
employee.setDepartment_id(rs.getInt("department_id"));
   	employee.setEmail(rs.getString("email"));
  	employee.setHire_date(rs.getDate("hire_date"));
	employee.setJob_id(rs.getString("job_id"));
	employee.setCommission_pct(rs.getInt("commission_pct"));
         	employee.setLast_name(rs.getString("last_name"));
employee.setManager_id(rs.getInt("manager_id"));
//employee.setPhone_number(rs.getp("phone_number"));
employee.setSalary(rs.getInt("salary"));
employee.setEmployee_id(rs.getInt("employee_id"));
            	employees.add(employee);

            }

        } catch (SQLException e) {

            e.printStackTrace();

        }



        return employees;

    }

}
