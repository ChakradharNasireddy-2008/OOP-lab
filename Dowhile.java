import java.util.Scanner;
public class Dowhile {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int number;
do {
System.out.print("Enter a number between 1 - 10: ");
number = scanner.nextInt();
} while(number < 1 || number > 10);
System.out.println("You picked " + number);
scanner.close();
}
}
