package constructores;

public class App {
    public static void main(String[] args) throws Exception {
        //creo 3 objetos de la clase Persona utilizando los 3 constructores
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Juan");
        Persona persona3 = new Persona("Maria", 30);

        //inicilizo los atributos del objeto persona1 utilizando el constructor vacio
        persona1.nombre = "Pedro";
        persona1.edad = 25;

        //imprimo los objetos utilizando el metodo toString
        System.out.println(persona1.toString());
        System.out.println(persona2);
        System.out.println(persona3);

    }
}
