package part4_while.demo2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String[] skills = new String[3];

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(
            int id,
            String name,
            String skill1,
            String skill2,
            String skill3) {
        this.id = id;
        this.name = name;
        this.skills[0] = skill1;
        this.skills[1] = skill2;
        this.skills[2] = skill3;
    }

    public User(
            int id,
            String name,
            String skill1,
            String skill2) {
        this.id = id;
        this.name = name;
        this.skills[0] = skill1;
        this.skills[1] = skill2;
    }

    public User(
            int id,
            String name,
            String skill1
    ) {
        this.id = id;
        this.name = name;
        this.skills[0] = skill1;
    }


    public User(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.skills = new String[size];
    }

    public void fillArrayItem(int index, String skill) {
        this.skills[index] = skill;
    }


}
