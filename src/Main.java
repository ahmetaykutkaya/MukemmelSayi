import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.print("Bir sayi giriniz: ");
        int number = scan.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                total += i;
            }
        }
        if(number == total) {
            System.out.println(number + " Mukemmel bir sayidir");
        }
        else {
            System.out.println(number + " Mukemmel bir sayi degildir.");
        }
    }
}