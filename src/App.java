import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        // represetam os ataques tentados
        double saqueT = 0;
        double bloqueioT = 0;
        double ataqueT = 0;

        // representam os ataques que foram bem sucedidos
        double saque = 0;
        double bloqueio = 0;
        double ataque = 0;

        for (int i = 0; i < entrada; i++) {
            String nome = sc.next();
            saqueT += sc.nextInt();
            bloqueioT += sc.nextInt();
            ataqueT += sc.nextInt();

            saque += sc.nextInt();
            bloqueio += sc.nextInt();
            ataque += sc.nextInt();
        }

        sc.close();
        saque = (saque * 100) / saqueT;
        bloqueio = (bloqueio * 100) / bloqueioT;
        ataque = (ataque * 100) / ataqueT;

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Pontos de Saque: " + decimal.format(saque) + " %.");
        System.out.println("Pontos de Bloqueio: " + decimal.format(bloqueio) + " %.");
        System.out.println("Pontos de Ataque: " + decimal.format(ataque) + " %.");
    }

}
