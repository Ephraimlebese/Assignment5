package funeralApp.factory;

import funeralApp.domain.Invoice;

/**
 * Created by student on 2016/04/03.
 */
public interface InvoiceFactory
{
    public Invoice createInvoice(int InvoiceNum, Double AmountPaid, Double Premiums);
}
