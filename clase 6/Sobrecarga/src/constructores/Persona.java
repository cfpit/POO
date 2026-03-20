package constructores;

public class Persona {
    //atributos
    public String nombre;
    public int edad;

    //constructores
    //constructor vacio
    public Persona() {
    }
    
    //constructor sobrecargado con 1 parametro
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //constructor sobrecargado con 2 parametros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    

    
}
