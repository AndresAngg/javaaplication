public class ejercicio12 {
    public void main(){
        int a,b;
        float c=3;
        boolean r,s,t,u,v,w,x;

        a=3;
        b = 8;
        r = a == 0;
        s = a !=0;
        t= a <= b;
        u = b >= a;
        v = b > a;
        w = b < a;
        x = c == 3.0;

        System.out.println("r. "+r);
        System.out.println("s. "+s);
        System.out.println("t. "+t);
        System.out.println("u. "+u);
        System.out.println("v. "+v);
        System.out.println("w. "+w);
        System.out.println("x. "+x);
        /* El resultado son booleanos true y false porque al momento de declarar el valor 
        de cada variable tipo booleano se esta realizando unas condiciones y si está de cumple
        debe igualar un true o un false, por ejemplo en la variable (r = a ==0)
        aqui se valida si a es igual a cero que ceria falso, entonces la variablke r es igual a false*/
    }
}
