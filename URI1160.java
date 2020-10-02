import java.util.Scanner;
public class URI1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int T = teclado.nextInt();
        int cont = 1, anos = 0;
        int PA, PB, TA, TB;
        double G1, G2;

        while (cont <= T){
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextDouble();
            G2 = teclado.nextDouble();
            do{
                anos++;
                TA = (int)(PA * (G1/100));
                TB = (int)(PB * (G2/100));
                //System.out.println("TA = " + TA);
                //System.out.println("TB = " + TB);
                PA = PA + TA;
                PB = PB + TB;
            }while (PA <= PB && anos <= 100);
            if (anos <= 100){
                System.out.println(anos + " anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
            cont++;
            anos = 0;
        }
    }
}