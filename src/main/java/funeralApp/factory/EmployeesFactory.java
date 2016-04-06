package funeralApp.factory;

import funeralApp.domain.Employees;

/**
 * Created by student on 2016/04/03.
 */
public interface EmployeesFactory
{
    public Employees createEmployees(String FirstName,String LastName,String Idnumber);
}
