/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Alcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
(até que seja válido). O programa será encerrado quando o código informado for o número 4.
Entrada
A entrada contém apenas valores inteiros e positivos.
Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de
combustível, conforme exemplo.
*/

import java.util.Scanner;
public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int alcool=0, gasolina=0, diesel=0;

        do{
            valor = teclado.nextInt();
            switch(valor){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }
        }while (valor != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}