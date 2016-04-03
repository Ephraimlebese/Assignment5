package funeralApp.domain;

/**
 * Created by student on 2016/04/03.
 */
public class Address
{
    private String city;
    private String street;
    private String postalCode;

    private Address()
    {

    }

    public Address(Builder builder)
    {
        city = builder.city;
        street = builder.street;
        postalCode = builder.postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }


    public static class Builder
    {
        private String city;
        private String street;
        private String postalCode;

        public Builder city(String value)
        {
            this.city = value;
            return this;
        }
        public Builder street(String value)
        {
            this.street = value;
            return this;
        }
        public Builder postalCode(String value)
        {
            this.postalCode = value;
            return this;
        }

        public Builder copy(Address value) {
            this.city = value.getCity();
            this.street = value.getStreet();
            this.postalCode = value.getPostalCode();
            return this;
        }
        public Address build(){return new Address(this);}
    }
}
