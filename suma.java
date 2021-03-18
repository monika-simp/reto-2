import java.util.Scanner;  // Import the Scanner class


public class suma {
    public static void main(String[] args) {
        System.out.println ("Empezemos");
        int entrada_m;
        Scanner m = new Scanner(System.in);
        entrada_m = Integer.parseInt(m.nextLine());
        int mm;
        int entrada_n;
        Scanner n = new Scanner(System.in);
        entrada_n = Integer.parseInt(n.nextLine());

        for (int i=0; i <= entrada_m; i++) {
            System.out.println("vamos con la tabla del " + i );
            for (int j=0; j <= entrada_n; j++) {
                System.out.println( j + "*" + i + "=" + j*i);
                }

            }
        }



    }

