package part7.demo1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private int id;
    private String title;
    private String body;
    private ArrayList<Comment> comments = new ArrayList<>();




}
