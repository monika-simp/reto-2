import java.util.Scanner;
public class combinaciones {
    public static void main(String[] args) {
        int n;
        int mo;
        long re;

        int i=0;

        System.out.println("empezemos");
        System.out.println("digite n");
        Scanner m = new Scanner(System.in);
        n = Integer.parseInt(m.nextLine());
        System.out.println("digite m");
        mo = Integer.parseInt(m.nextLine());
        long nfac = n;
        long mfac = mo;
        long n_mfac = 1;
        i= n;
        while (i>1) {
            i = i - 1;
            nfac = nfac * i;
        }
        i=mo;
        while (i>1) {
            i = i - 1;
            mfac = mfac * i;
        }
        i= n-mo;
        while (i>1) {
            i = i - 1;
            n_mfac = n_mfac * i;
        }
        long nporm= mfac*n_mfac;
        re= nfac/nporm;
        System.out.println(re);
    }
}
