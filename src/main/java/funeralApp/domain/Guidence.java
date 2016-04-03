package funeralApp.domain;

/**
 * Created by student on 2016/04/03.
 */
public class Guidence
{
    private Long id;
    private String instruction;

    public Guidence(Builder builder){
        id = builder.id;
        instruction = builder.instruction;
    }

    public Long getId() {
        return id;
    }

    public String getInstruction() {
        return instruction;
    }

    public static class Builder
    {
        private Long id;
        private String instruction;

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }

        public Builder instruction(String instruction)
        {
            this.instruction = instruction;
            return this;
        }

        public Builder copy(Guidence value){
            this.id = value.getId();
            this.instruction = value.getInstruction();
            return this;
        }
        public Guidence build(){
            return new Guidence(this);
        }
    }

}
