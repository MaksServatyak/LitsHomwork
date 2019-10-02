import java.util.Random;

public class Control {
    public static void main(String[] args) {
        var i = new Random().nextInt(1000);
        while (i % 2 != 0) {
            System.out.println(i);
            i = new Random().nextInt(1000);
        }
    }
}
