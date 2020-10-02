public class Continhas{
    public static void main(String args[]){
        int a, b, c;
        a = 10;
        b = 8;

        c = a + b;
        System.out.println("Valor da soma: c = " + c);
        c = a - b;
        System.out.println("Valor da subtracao: c = " + c);
        c = a * b;
        System.out.println("Valor da multiplicacao: c = " + c);
        c = a / b;
        System.out.println("Valor da divisao: c = " + c);
        c = a % b;
        System.out.println("Valor do resto: c = " + c);

        double x, y, z;
        x = 1.5;
        y = 2.5;
        z = x/y;
        System.out.println("Valor de Z = " + z);

        float m;
        // m = 1/2 (o resultado é 'inteiro');
        // m = 1.0/2.0 (o resultado é 'double');
        m = 1.0f/3.0f;
        System.out.println("Valor de m: " + m);
        // ou
        m = (float)1/3;
        System.out.println("Valor de m: " + m);
    }
}