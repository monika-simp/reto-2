import java.util.Scanner;
public class retiro {
    public static void main(String[] args) {
        int cambio = 0;
        int billetes = 100000;
        int n;
        int c5 = 50000;
        System.out.println("empezemos");
        Scanner m = new Scanner(System.in);
        n = Integer.parseInt(m.nextLine());
        while (billetes >= 50){
            if (n>=billetes) {
                n = n - billetes;
                cambio = cambio + 1;
            } else {
                if (cambio > 0){
                    System.out.println("el cambio son " + cambio + " billestes de" + " " + billetes);
                }
                if (billetes == c5 ) {
                    billetes = billetes * 2;
                    billetes = billetes/5;
                    c5 = c5/10;
                    cambio = 0;
                } else{
                    billetes = billetes / 2;
                    cambio = 0;
                }
            }
        }
    }
}
