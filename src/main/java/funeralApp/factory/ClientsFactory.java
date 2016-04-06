package funeralApp.factory;

import funeralApp.domain.Clients;

/**
 * Created by student on 2016/04/03.
 */
public interface ClientsFactory
{
    public Clients createClient(String FirstName,String LastName,String Idnumber);
}
