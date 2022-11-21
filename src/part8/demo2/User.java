package part8.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Sing,Run{
    private String favSong = "acdc";
    private int distance;
    @Override
    public void singSong() {
        System.out.println("sing song " + this.favSong);
    }

    @Override
    public int runMarathon(int avgSpeed) {
        return this.distance/avgSpeed;
    }


}
