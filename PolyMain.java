import java.io.IOException;

public class PolyMain {
    public static void main(String[] args) {
        Polynomial poly= new Polynomial();
        try {
            poly.questioner();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
