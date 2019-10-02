import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        var i = 1;
        while (i <= 10) {
            Random rnd = new Random();
            char c = (char) (rnd.nextInt(26) + 'a');
            i++;
            System.out.print(c);
        }


    }
}
