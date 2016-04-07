package funeralApp.factoryTest;

import funeralApp.domain.Clients;
import funeralApp.factory.ClientsFactory;
import funeralApp.factory.imp.ClientFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestClients
{
    private ClientsFactory clientsFactory;
    private Clients clients;

    @Before
    public void setUp() throws Exception
    {
        clientsFactory = ClientFactoryImpl.getClientFactoryInstance();
        clients = clientsFactory.createClient("Ephraim","Lebese","8807155415086");
    }

    @Test
    public void testCreateClients() throws Exception
    {
        Assert.assertEquals(clients.getFirstName(),"Ephraim");
        Assert.assertEquals(clients.getLastName(),"Lebese");
        Assert.assertEquals(clients.getIDNumber(),"8807155415086");
    }

    @Test
    public void testUpdateClient() throws Exception
    {

        Clients updateClient = new Clients.Builder().copy(clients).firstName("Thabo").build();

        Assert.assertEquals(updateClient.getFirstName(),"Thabo");

    }
}
