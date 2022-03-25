import java.util.Scanner;
public class Zadacha3 {
    public static void main(String[] args) {
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете число: ");
        myNumber = scanner.nextInt();
       if (myNumber % 2 == 0) {
           System.out.println("Четно");
       } else {
           System.out.println("Нечетно");
       }
    }
}