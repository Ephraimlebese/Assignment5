package funeralApp.factoryTest;

import funeralApp.domain.Invoice;
import funeralApp.factory.InvoiceFactory;
import funeralApp.factory.imp.EmployeeFactoryImpl;
import funeralApp.factory.imp.InvoiceFactoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestInvoice
{
    private InvoiceFactory invoiceFactory;
    private Invoice invoice;

    @Before
    public void setUp() throws Exception
    {
        invoiceFactory = InvoiceFactoryImpl.getInvoiceFactoryImplInstance();
        invoice = invoiceFactory.createInvoice(1, 80.00, 100.00);
    }

    @Test
    public void testCreateInvoive() throws Exception
    {
        Assert.assertTrue(invoice.getInvoiceNum() == 1);
        Assert.assertTrue(invoice.getAmountPaid() == 80.00);
        Assert.assertTrue(invoice.getPremiums() == 100.00);
    }

    @Test
    public void testUpdateInvoice() throws Exception
    {
        Invoice updatedInvoice = new Invoice.Builder().copy(invoice).amountPaid(100.00).build();

        Assert.assertTrue(updatedInvoice.getAmountPaid() == 100.00);
    }
}
