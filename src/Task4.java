import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        var k = 1;
        var s = 0;
        while (k <= 50) {
            var i = new Random().nextInt(1000);
            k++;
            if (i % 7 == 0) {
                System.out.println(i);
                s = s + i;
            }
        }
        System.out.print(s);
        System.out.print("-сума");

    }
}