import java.util.Scanner;
public class Zadacha4 {
    public static void main(String[] args) {
        int myNumber1;
        int myNumber2;
        int myNumber3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете като цяло число една след друга дължините на всяка от страните на триъгълника");
        System.out.println("Въведете първото число: ");
        myNumber1 = scanner.nextInt();
        System.out.println("Въведете второто число: ");
        myNumber2 = scanner.nextInt();
        System.out.println("Въведете третото число: ");
        myNumber3 = scanner.nextInt();
        if ((myNumber1 == myNumber2) && (myNumber2 == myNumber3)) {
            System.out.print("Триъгълникът ви е равностранен");
        } else if ((myNumber1 == myNumber2) || (myNumber1 == myNumber3) || (myNumber2 == myNumber3)) {
            System.out.print("Триъгълникът ви е равнобедрен");
        } else {
            System.out.print("Триъгълникът ви е разностранен");
        }
    }
}
