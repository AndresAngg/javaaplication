public class ejercicio9 {
    public static void main() {
        char v1 = 'A';

        System.out.println(v1+1);
        /* Ocurre que imprime un entero, ya que se esta realizandoo la suma del valor del caracter en este caso 'A' que su valor es 65 y
        si le colocamos +1 el resultado esperado seria 66 */


        System.out.println(v1++);
        /* En este caso no ocurren cambios, permanece con el caracter 'A' */
    }
}
