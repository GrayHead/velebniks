package part7.demo2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User {


    private String email;

    public Customer(int id, String name, String surname, String email) {
        super(id, name, surname);
        this.email = email;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
}
