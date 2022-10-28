import java.util.scanner;
class lab6 {
public static void main(String args[]) {
while(treu) {
Scanner r=new Scanner(System.in);
int chicken=400,Mutton=1200,Beef=1500,Roll=150,Chips=100,Ice cream=50,Tea=70,choice; 
int quantity,total;
System.out.println("Welcome To Our Restaurant");
System.out.println("   ");
System.out.println("             1.CHICKEN       = 400");
System.out.println("             2.MUTTON        = 1200");
System.out.println("             3.BEEF          = 1500");
System.out.println("             4.ROLL          = 150");
System.out.println("             5.CHIPS         = 100");
System.out.println("             6.ICE CREAM     = 50");
System.out.println("             7.TEA           = 70");
System.out.println("     ");
System.out.println("Enter Your Choice:");
choice=r.nextInt();
switch(choice) {
case 1:
System.out.println("You Select Chicken :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Chicken;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 2:
System.out.println("You Select Mutton :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Mutton;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 3:
System.out.println("You Select Beef :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Beef;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 4:
System.out.println("You Select Roll :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Roll;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 5:
System.out.println("You Select Chips :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Chips;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 6:
System.out.println("You Select Ice cream:");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Ice cream;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
case 7:
System.out.println("You Select Tea :");
System.out.println("Enter Quantity:");
quantity=r.nextInt();
total=quantity*Tea;
System.out.println("#########YOUR BILL IS##########");
System.out.println(total);
break;
default:
System.out.println(" You Entered Invalid Choice");
}
}
}
