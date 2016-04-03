package funeralApp.domain;

/**
 * Created by student on 2016/04/03.
 */
public class Users
{
    private Long id;
    private String username;
    private String password;

    public Users(Builder builder)
    {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder
    {
        private Long id;
        private String username;
        private String password;

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }
        public Builder username(String username)
        {
            this.username = username;
            return this;
        }
        public Builder password(String password)
        {
            this.password = password;
            return this;
        }

        public Builder copy(Users user)
        {
            this.id = user.getId();
            this.username = user.getUsername();
            this.password = user.getPassword();
            return this;
        }
        public Users build()
        {
            return new Users(this);
        }

    }
}
