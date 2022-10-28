import java.util.Scanner;
class lab8 {
public static void main(String args[]) {
while(true) {
Scanner r=new Scanner(System.in);
int x;
int y;
int add,subtract,multiplication,choice;
float division;
System.out.println("Enter the first element:");
x=r.nextInt();
System.out.println("Enter the second element:");
y=r.nextInt();
System.out.println("   ");
System.out.println("      1.ADDITION");
System.out.println("      2.SUBTRACTION");
System.out.println("      3.MULTIPLICATION");
System.out.println("      4.DIVISION");
     choice=r.nextInt();
switch(choice) {
case 1:
System.out.println(" You select ADDITION");
add=x+y;
System.out.println(add);
break;
case 2:
System.out.println(" You select SUBTRACTION");
add=x-y;
System.out.println(subtract);
break;
case 3:
System.out.println(" You select MULTIPLICATION");
add=x*y;
System.out.println(multiplication);
break;
case 4:
System.out.println(" You select DIVISION");
add=x/y;
System.out.println(division);
break;
default:
System.out.println("You Entered Invalid Choice:");
}
}
}
}