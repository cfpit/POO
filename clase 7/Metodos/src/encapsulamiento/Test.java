package encapsulamiento;

public class Test {
    public static void main(String[] args) {
        //creo un auto con el constructor vacio
        Auto auto1 = new Auto();

        //seteo los atributos con los setters
        //auto1.marca = "Toyota";
        auto1.setMarca("Toyota");
        auto1.setColor("Rojo");
        auto1.setVelocidad(5000);

        //muestro el estado final del auto
        System.out.println(auto1);

    }
}
