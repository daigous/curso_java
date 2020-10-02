/*
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
*/

public class URI1098{
    public static void main(String args[]){
        double I = 0, J = 1;
        while (I <= 2){
            if (((Math.round(I*10)/10.0) == 0) || ((Math.round(I*10)/10.0) == 1) || ((Math.round(I*10)/10.0) == 2)){
                System.out.printf("I=%.0f J=%.0f\n", I, J);
                System.out.printf("I=%.0f J=%.0f\n", I, J+1);
                System.out.printf("I=%.0f J=%.0f\n", I, J+2);
            }
            else {
                System.out.printf("I=%.1f J=%.1f\n", I, J);
                System.out.printf("I=%.1f J=%.1f\n", I, J+1);
                System.out.printf("I=%.1f J=%.1f\n", I, J+2);               
            }
            I = (I + (1.0/5));
            J = (J + (1.0/5));
        }
    }
}