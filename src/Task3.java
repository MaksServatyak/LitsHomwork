import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        var i = new Random().nextInt(1000);
        if (i % 3 == 0) {
            System.out.print("ділиться на 3");
            System.out.println(i);
        }else if (i%5==0){
            System.out.println(i);
            System.out.print("ділиться на 5");
        }else if (i%7==0) {
            System.out.println(i);
            System.out.print("ділиться на 7");
        }else {
            System.out.println("число не ділиться");
        }
    }

}
