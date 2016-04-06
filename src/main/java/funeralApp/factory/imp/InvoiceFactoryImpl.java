package funeralApp.factory.imp;


import funeralApp.domain.Invoice;
import funeralApp.factory.InvoiceFactory;

/**
 * Created by student on 2016/04/06.
 */
public class InvoiceFactoryImpl implements InvoiceFactory
{
    private static InvoiceFactoryImpl invoiceFactory = null;

    private InvoiceFactoryImpl()
    {
    }

    public static InvoiceFactoryImpl getInvoiceFactoryImplInstance()
    {
        if(invoiceFactory == null)
            invoiceFactory = new InvoiceFactoryImpl();
        return invoiceFactory;
    }


    @Override
    public Invoice createInvoice(int InvoiceNum, Double AmountPaid, Double Premiums) {
        Invoice invoice = new Invoice.Builder()
                .InvoiceNum(InvoiceNum)
                .amountPaid(AmountPaid)
                .Premiums(Premiums)
                .build();
        return invoice;
    }
}
