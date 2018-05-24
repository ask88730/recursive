import java.util.Scanner;

public class Recursive {
    public static  void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(abc(a));}

static int abc (int a){
  if (a ==1)
      return 1;
  else
      return a*abc(a-1);

    }
}
