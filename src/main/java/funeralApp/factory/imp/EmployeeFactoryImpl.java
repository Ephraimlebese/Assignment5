package funeralApp.factory.imp;

import funeralApp.domain.Employees;
import funeralApp.factory.EmployeesFactory;

/**
 * Created by student on 2016/04/06.
 */
public class EmployeeFactoryImpl implements EmployeesFactory
{
    private static EmployeeFactoryImpl employeeFactory = null;

    private EmployeeFactoryImpl()
    {
    }

    public static EmployeeFactoryImpl getEmployeeFactoryInstance()
    {
        if(employeeFactory == null)
            employeeFactory = new EmployeeFactoryImpl();
        return employeeFactory;
    }


    @Override
    public Employees createEmployees(String FirstName, String LastName, String Idnumber) {
        Employees employees = new Employees.Builder()
                .firstName(FirstName)
                .lastName(LastName)
                .idNumber(Idnumber)
                .build();
        return employees;
    }
}
