package funeralApp.factoryTest;

import funeralApp.domain.Employees;
import funeralApp.factory.EmployeesFactory;
import funeralApp.factory.imp.EmployeeFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestEmployees
{
    private EmployeesFactory employeesFactory;
    private Employees employees;

    @Before
    public void setUp() throws Exception
    {
        employeesFactory = EmployeeFactoryImpl.getEmployeeFactoryInstance();
        employees = employeesFactory.createEmployees("John","Doe","88075658086");
    }

    @Test
    public void testCreateEmployees() throws Exception
    {
        Assert.assertEquals(employees.getFirstName(),"John");
        Assert.assertEquals(employees.getLastName(),"Doe");
        Assert.assertEquals(employees.getIDNumber(),"88075658086");
    }

    @Test
    public void testUpdateEmployee() throws Exception
    {
        Employees updatedEmployee = new Employees.Builder().copy(employees).lastName("cena").build();
        Assert.assertEquals(updatedEmployee.getLastName(),"cena");
    }
}
