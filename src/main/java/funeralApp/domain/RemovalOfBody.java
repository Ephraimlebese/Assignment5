package funeralApp.domain;

/**
 * Created by student on 2016/04/03.
 */
public class RemovalOfBody
{

    private String location;

    private RemovalOfBody(){}
    public RemovalOfBody(Builder builder)
    {
        location = builder.location;

    }

    public String getLocation() {
        return location;
    }

    public static class Builder
    {
        private String location;

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder copy(RemovalOfBody value)
        {
            this.location = value.getLocation();
            return this;
        }
        public RemovalOfBody build(){return new RemovalOfBody(this);}
    }

}
