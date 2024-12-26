package sys.tem.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    @NotEmpty
    @Size(min = 2, max = 15)
    private String name;
    @NotEmpty
    @Size(min = 4)
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }


}
