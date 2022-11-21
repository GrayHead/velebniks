package part7.demo2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser extends User {

    private String login;
    private String password;

    public SystemUser(int id, String name, String surname, String login, String password) {
        super(id, name, surname);
        this.login = login;
        this.password = password;
    }


    @Override
    public String toString() {
        return "SystemUser{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }

    @Override
    public void hello() {
        System.out.println("qywfdyqfdhasvdhasfdhgvahdsv");
    }
}
