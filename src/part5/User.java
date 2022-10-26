package part5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;

    private Passport passport;

    public User(int id, String name,String passportSeries,String passportNumber) {
        this.id = id;
        this.name = name;
        this.passport = new Passport(passportSeries, passportNumber);
    }
}
