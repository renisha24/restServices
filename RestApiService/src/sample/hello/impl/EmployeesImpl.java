package sample.hello.impl;

import java.util.List;

import sample.hello.dao.EmployeesDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;



import sample.hello.model.Employees;

@Path("/employeesearch")
public class EmployeesImpl {
	 @Path("{id}")
	 @GET
	 @Produces({ MediaType.APPLICATION_JSON })
	  public Response employeeNameSearch(@PathParam("id") int id) throws JSONException {
		 List< Employees >                  matched;
		 GenericEntity< List< Employees > > entity;
		 EmployeesDAO daoObj=new EmployeesDAO();
		        
		        matched = daoObj.getEmployeesByEmpId(id);
		        entity  = new GenericEntity< List< Employees > >( matched ) { };

		        return Response.ok( entity ).build();
	  }
}
