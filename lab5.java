package Lab 2 Tasks;
import java.util.reflect.Array;
import java.util.*;
class lab5 {
public static void main(String args[]) {
String username,password;
String[][] arr={{"Aqeel","Nasir","Yasir","Tufail","Raheel"},{"Jamali","Shaikh","Baloch","Channa","Sangrasi"}};
Scanner r=new Scanner(System.in);
System.out.println("Enter Username:");
Username=r.nextLine();
System.out.println("Enter password:");
password=r.nextLine();
if(username.equals(arr[0][0]&&password.equals(arr[1][0]))
{
System.out.println("Login successful \nWelcome Mr.Aqeel"); 
}
else if(username.equals(arr[0][1]&&password.equals(arr[1][1]))
{
System.out.println("Login successful \nWelcome Mr.Nasir"); 
}
else if(username.equals(arr[0][2]&&password.equals(arr[1][2]))
{
System.out.println("Login successful \nWelcome Mr.Yasir"); 
}
else if(username.equals(arr[0][3]&&password.equals(arr[1][3]))
{
System.out.println("Login successful \nWelcome Mr.Tufail"); 
}
else if(username.equals(arr[0][4]&&password.equals(arr[1][4]))
{
System.out.println("Login successful \nWelcome Mr.Raheel"); 
}
else 
{
System.out.println("Login Failed\nYour Login Details Not Matched:");
}
}
}



