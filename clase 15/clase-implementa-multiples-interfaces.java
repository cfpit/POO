// Interface 1
interface Volador {
    void volar();
}

// Interface 2
interface Nadador {
    void nadar();
}

// Clase padre
class Animal {
    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    void respirar() {
        System.out.println(nombre + " está respirando");
    }
}

// Clase hija: hereda de Animal e implementa Volador y Nadador
class Pato extends Animal implements Volador, Nadador {

    Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato("Donald");
        pato.respirar(); // heredado de Animal
        pato.volar();    // de Volador
        pato.nadar();    // de Nadador
    }
}