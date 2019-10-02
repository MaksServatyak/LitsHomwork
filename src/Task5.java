import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        var i = new Random().nextInt(1000);
        var sum = 0;
        var k = 1;
        while (k <= 15) {
            sum = i + sum;
            k++;
        }
        var a = sum / 15;
        System.out.print("сума-");
        System.out.println(sum);
        System.out.print("середнє значення-");
        System.out.println(a);
    }
}
