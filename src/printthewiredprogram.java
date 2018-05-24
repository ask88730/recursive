import java.util.Scanner;

public class printthewiredprogram {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.print(abc(a));
    }
static  int abc(int n){
    if (n==0 || n==1)
        return  n+1;
    else
        return abc(n-1)+abc(n/2);
    }
}

