import java.util.Scanner;

public class Zadacha2 { // Програма за изчисляване на BMI

    public static void main(String[] args) {
        System.out.println("Въведете ващият ръст в сантиметри: ");
        Scanner sc1 = new Scanner(System.in);
        float rast = sc1.nextFloat();
        System.out.println("Въведете вашето тегло в килограми: ");
        Scanner sc2 = new Scanner(System.in);
        float teglo = sc2.nextFloat();
        System.out.println("Вашият BMI e : " + ((teglo / rast / rast) * 10000));
        float bmi = (teglo / rast / rast) * 10000;
        if (bmi < 18.5){
            System.out.print("Трябва да похапваш повече");
        } else if ((bmi >= 18.5) && (bmi <=24.9)) {
        System.out.print("Супер си!!!");
    } else {
            System.out.print("Минаваш на диета");}
    }
}