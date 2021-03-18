import java.util.Scanner;
public class cubo {
    public static void main(String[] args) {
    int n;
    int c=0;
    int i;
    int p=0;
    System.out.println("empezemos");
    Scanner m = new Scanner(System.in);
    n = Integer.parseInt(m.nextLine());
    for (int j=0 ; j < n; j++) {
        p= p+j;

    }
    p=p+1;
    i = (2*p) - 1;
    for (int j = 1; j < n+1; j++) {
        c=c+i;
        i=i+2;

    }

    System.out.println(c);
   }
}
