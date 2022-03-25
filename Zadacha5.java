import java.util.Scanner;
public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Въведете число от едно до дванадесет: ");
        byte mesec = scan.nextByte();

        switch (mesec) {
            case 1:
                System.out.println("Вашето число отговаря на месец Януари");
                break;
            case 2:
                System.out.println("Вашето число отговаря на месец Февруари");
                break;
            case 3:
                System.out.println("Вашето число отговаря на месец Март");
                break;
            case 4:
                System.out.println("Вашето число отговаря на месец Април");
                break;
            case 5:
                System.out.println("Вашето число отговаря на месец Май");
                break;
            case 6:
                System.out.println("Вашето число отговаря на месец Юни");
                break;
            case 7:
                System.out.println("Вашето число отговаря на месец Юли");
                break;
            case 8:
                System.out.println("Вашето число отговаря на месец Август");
                break;
            case 9:
                System.out.println("Вашето число отговаря на месец Септември");
                break;
            case 10:
                System.out.println("Вашето число отговаря на месец Октомври");
                break;
            case 11:
                System.out.println("Вашето число отговаря на месец Ноември");
                break;
            case 12:
                System.out.println("Вашето число отговаря на месец Декември");
                break;
            default:
                System.out.println("Погрешно въведена стойност!");


        }

    }

}
