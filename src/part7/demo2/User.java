package part7.demo2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public /*final*/  class User {
    private int id;
    private String name;
    private String surname;

    public User() {
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public /*final*/ void hello() {
        System.out.println("ashdghasgfd");
    }
}
