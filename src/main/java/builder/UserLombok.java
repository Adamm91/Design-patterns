package builder;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLombok {
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String email;
}
