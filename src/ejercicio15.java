public class ejercicio15 {
    public void main(){
        int a =5,b=3,c=20,d=20;

        c=++a/b-3+a%b;
        d=++a/(b+3-4*a)%b;

        System.out.println("c. "+c);
        System.out.println("d. "+d);
        /* Los resultados son producto de las operaciones realizadas en la variable c y d
        donde se realiza un autoincremente se dvide, se realiza resta y el modulo % que es el restode la división*/
    }
}
