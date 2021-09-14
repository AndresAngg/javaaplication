public class ejercicio14 {
    public void main(){
        int a=5,b=3;

        boolean r=true,s=false;

        a+=b+8*b;

        r&=s;
        System.out.println("a. "+a);
        System.out.println("b. "+b);
        System.out.println("r. "+r);
        System.out.println("s. "+s);
        /* El resultado de la variable ( a ) es 32 porque se esta realizando una operacion
        basica donde el (+=) quiere decir que sumes el valor actual de la variable con el resto de la operacion
        y en la operacion de booleano  con el aperador (&=) se est[a asiganando  el valor del boolean (s) */

    }
}
