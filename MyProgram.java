import java.util.*;
class MyProgram{
public static void main (String[] args){
int x;
Scanner sc = new Scanner(System.in);
x = sc.nextInt();
if(x > 0){
System.out.println("number is a positive");
}
else if(x <0) {
System.out.println("number is a negative");
}
else{ 
System.out.println("number is a zero");
}
}
}