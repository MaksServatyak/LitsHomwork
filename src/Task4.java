import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        var i = new Random().nextInt(1000);
        var k = 1;
        var s = 0;
        while (k <= 50) {
            k++;
            if (i % 7 == 0) {
                System.out.println(i);
                s = s + i;
            }
            i = new Random().nextInt(1000);
        }
        System.out.print(s);
        System.out.print("-сума");

    }
}