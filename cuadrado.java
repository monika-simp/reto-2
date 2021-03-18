import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {
        System.out.println("Empezamos el programa");
        int n;
        int c = 0 ;
        int i = 1 ;
        System.out.println("digite un numero para calcular el cuadrado");
        Scanner m = new Scanner(System.in);
        n = Integer.parseInt(m.nextLine());
        for (int j=0; j < n; j++) {
            c=c+i ;
            i = i+2;
        }
        System.out.println(c);
    }
}
