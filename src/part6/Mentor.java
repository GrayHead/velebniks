package part6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
class Mentor {
    private int id;
    private String name;
    private ArrayList<Skill> skills = new ArrayList<>();


}
