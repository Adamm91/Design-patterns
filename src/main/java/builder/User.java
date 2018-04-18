package builder;

public class User {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String email;

    public User () {
    }

    public static UserBuilder builder () {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String firstName;
        private String secondName;
        private String phoneNumber;
        private String email;

        public User build () {
            User user = new User();
            user.setFirstName(this.firstName);
            user.setSecondName(this.secondName);
            user.setPhoneNumber(this.phoneNumber);
            user.setEmail(this.email);
            return user;
        }

        public UserBuilder firstName (String value) {
            this.firstName = value;
            return this;
        }

        public UserBuilder secondName (String value) {
            this.secondName = value;
            return this;
        }

        public UserBuilder phoneNumber (String value) {
            this.phoneNumber = value;
            return this;
        }

        public UserBuilder email (String value) {
            this.email = value;
            return this;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
