/*
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
*/

public class URI1095{
    public static void main(String args[]){
        int I = 1, J = 60;
        while (J >= 0){
            System.out.println("I=" + I + " J=" + J);
            I = I+3;
            J = J-5;
        }
    }
}