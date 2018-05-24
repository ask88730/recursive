import java.util.Scanner;

public class Turntophasedivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(abc(a,b));
    }
  static int abc(int x,int y){
if (x<y){
   int tmp=x;
   x=y;
   y=tmp;}
if (x%y==0)
    return y;
else
    return abc(y,x%y);
}
  }
