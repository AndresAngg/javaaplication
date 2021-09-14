public class ejercicio11 {
    public static void main(){
        char a;
        int b;
        short c;
        long d;
        float e;
        double f;
        
        System.out.println("Asignamos variable char a enteros");

        a = '4';
        b=a;
        c=a;
        d=a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("Asignamos variable double a float");

        f = 1e200;
        e = f;

        System.out.println("f: "+f);
        System.out.println("e: "+e);
        System.out.println("Asignamos variables float a int");

        e=1234.5678;
        b=e;
        System.out.println("e: "+e);
        System.out.println("b: "+b);

        /* El resultado son multiples Exception, el primero es con la variable tipo short que no puede permtir almacenar valores tipo char, solo númericos */
        /* El segundo error es porque la variable tipo float no puede permitir almacenar demasiados puntos decimal como si puede el tipo de dato double*/
        /* El tercer error en el tipo de dato float no se debe indicar la ubicación del punto decimal en la declaración, y en el tipo de dato int no permite almacenar números flotantes */


    }
}
