import java.util.Scanner;
public class Shoppingcart{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

String item; 
int quantity;
double price;
char currency = '$';
double total;

System.out.print("what item would you like to buy?: ");
item=scanner.nextLine();
System.out.print("what is the price for each?: ");
price=scanner.nextDouble();
System.out.print("how many did you buy : ");
quantity=scanner.nextInt();

total= price*quantity;
System.out.print("you bought "+ quantity +" "+item+ " /s and your bill is " +" "+ currency+total);
total=scanner.nextDouble();
scanner.close();

}
}