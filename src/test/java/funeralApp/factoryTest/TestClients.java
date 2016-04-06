package funeralApp.factoryTest;

import funeralApp.domain.Clients;
import funeralApp.factory.ClientsFactory;
import funeralApp.factory.imp.ClientFactoryImpl;
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

    }

    @Test
    public void testCreateInvoice() throws Exception
    {


    }
}
