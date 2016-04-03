package funeralApp.domain;

/**
 * Created by student on 2016/04/03.
 */
public class MethodOfPayment
{

    private String paymentMethod;

    private MethodOfPayment(){}
    public MethodOfPayment(Builder builder)
    {
        paymentMethod = builder.paymentMethod;

    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static class Builder
    {
        private String paymentMethod;

        public Builder methodType(String value)
        {
            this.paymentMethod = value;
            return this;
        }

        public Builder copy(MethodOfPayment value)
        {
            this.paymentMethod = value.getPaymentMethod();
            return this;
        }
        public MethodOfPayment build(){return new MethodOfPayment(this);}
    }


}
