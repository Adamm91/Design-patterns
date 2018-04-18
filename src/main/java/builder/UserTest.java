package builder;

public class UserTest {

    public static void main(String[] args) {
        User user = new User();

        user.setFirstName("Adam");
        user.setSecondName("Marcinkowski");
        user.setPhoneNumber("123456789");
        user.setEmail("adam.marcinkowski");


        User user1 = User.builder()
                .firstName("Adam")
                .secondName("Marcinkowski")
                .phoneNumber("123456789")
                .email("adam.marcinkowski")
                .build();

        UserLombok user3 = new UserLombok.UserLombokBuilder()
                .firstName("Adam")
                .secondName("Marcinkowski")
                .phoneNumber("123456789")
                .email("adam.marcinkowski")
                .build();

    }
}
