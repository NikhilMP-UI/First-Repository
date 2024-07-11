import java.util.*;
class ContinueDemo{
public static void main(String[] args) {
int a,n,sum=0;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(int i=0;i<n;i++){
a = sc.nextInt();
if(a<0){
continue;
}
sum=sum+a;
}
System.out.println("sum="+sum);
}
}