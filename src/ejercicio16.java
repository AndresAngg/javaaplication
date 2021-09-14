public class ejercicio16 {
    public void main(){
      { 
        int va1=9;
        System.out.println(va1);
      } 
        //No se puede duplicar las variables almenos de manera local no es posible
        //Pasa lo mismo si es el mismo nombre con distinto tipo de dato, no se pueden duplicar

        {
            int va1=1;
            System.out.println(va1);
            
        }
        
       /* Cuando lo colocamos entre llaves si esta permitiendo crear la variable con el mismo nombre
       pero este solo funcionario estando dentro de la llave, cuando se declara dentro de las llaves
       la estamos declarando de manera intrna en el modulo, no de manera glogal o local que seria fuera de las llaves
       entonces si intentamos imprimir una variable que esta dentro de llaves se debe
       hacer dentro delas dichas llaves, fuera de la llave no se podria poeque esa variable solo exoste dentro de las llaves o del modulo */ 
    }
}
