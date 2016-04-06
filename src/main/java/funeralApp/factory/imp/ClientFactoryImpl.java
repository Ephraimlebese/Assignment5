package funeralApp.factory.imp;


import funeralApp.domain.Clients;
import funeralApp.factory.ClientsFactory;

/**
 * Created by student on 2016/04/06.
 */
public class ClientFactoryImpl implements ClientsFactory
{
    private static ClientFactoryImpl clientFactory = null;

    private ClientFactoryImpl()
    {
    }

    public static ClientFactoryImpl getClientFactoryInstance()
    {
        if(clientFactory == null)
            clientFactory = new ClientFactoryImpl();
        return clientFactory;
    }


    @Override
    public Clients createClient(String FirstName, String LastName, String Idnumber) {
        Clients clients = new Clients.Builder()
                .firstName(FirstName)
                .lastName(LastName)
                .idNumber(Idnumber)
                .build();
        return clients;
    }
}
