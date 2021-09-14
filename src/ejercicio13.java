public class ejercicio13 {
    public void main(){
        int a,b;
        boolean r,s,t;

        a = 3;
        b=8;

        r= a==0 | b>=a;
        s=a!=0 & b < a;
        t = a <= b ^ b > a;

        System.out.println("r. "+r);
        System.out.println("s. "+s);
        System.out.println("t. "+t);
        /* El resultado de falso y verdadero porque se estan realizando condiciones con
        operadores logicos,  en caso de ser un falso o verdadero la respuesta es verdadero, para vlidar resultados se pueden ver en la tabla de verdad*/
    }
}
