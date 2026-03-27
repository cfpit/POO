package encapsulamiento;

public class App {
    public static void main(String[] args) throws Exception {
        //creo  un auto con el constructor vacio
        Auto auto1 = new Auto();
        //creo un auto con el constructor con parametros
        Auto auto2 = new Auto("Toyota", "Blanco", 8000);

        //seteo los atributos del auto
        auto1.setMarca("Honda");
        auto1.setColor("Rojo");
        auto1.setVelocidad(50);

        //comportamiento del auto
        auto1.acelerar();//50 -> 60
        auto1.acelerar(80);//60 -> 140 -> hay un problema

        //uso de getter
        System.out.println("La marca del auto1 es: " + auto1.getMarca());
        System.out.println("----------------------------");


        //muestro los datos del auto
        System.out.println(auto1);
        System.out.println("------------------");
        System.out.println(auto2);

    }
}
