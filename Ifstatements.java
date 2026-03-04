import java.util.Scanner;
public class Ifstatements{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

String name;
int age;
boolean isEligible;
boolean isStudent;

System.out.print("Enter your Name : ");
name=scanner.nextLine();
System.out.print("Enter your age : ");
age=scanner.nextInt();
System.out.print("Are you a Student(true/false): ");
isStudent=scanner.nextBoolean();

System.out.println("Your name is " + name);
//group1
if(age<0){
System.out.println("You have not born yet");
}
else if(age==0){
System.out.println("You are a baby");
}
else if(age>=18){
System.out.println("You are an adult");
}
else if(age<18){
System.out.println("You are a child");
}

//group2
if(age<18){
System.out.println("You are NOT Eligible for vote");
}
if(age>=18){
System.out.println("You are Eligible for vote");
}

//group3
if(isStudent==true){
System.out.println("You are Still Educating");
}
else{
System.out.println("You Stopped Education");
}
scanner.close();
}
}