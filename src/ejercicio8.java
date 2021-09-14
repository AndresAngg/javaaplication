public class ejercicio8 {
    
    public static void main() {
        long a = 5;
        long b;
        b = a++;

        System.out.println("Incremento delante " + b);
        
        long c = 5;
        long d;
        d = ++c;
        
        System.out.println("Incremento detras " + d);

        /* Si se poduce un cambio, porque cuando hacemos uso del autoincremento delante
        se esta haciendo un temporal con el valor actual  de la variable, luego es que 
        se añade el +1, para que se pueda regrefar el aumneto toca metener en un bloque o  
        repetir el autoincremento en varias lineas, en el caso de Autoincremento atras su proceso es 
        sumar un 1 a la variable sin tener que repetir */
    }
}
