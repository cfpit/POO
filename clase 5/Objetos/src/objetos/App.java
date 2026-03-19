package objetos;

public class App {
    public static void main(String[] args) throws Exception {
        //creo un objeto de la clase Auto
        Auto a = new Auto();

        //asigno valores a los atributos del objeto
        //es decir, le doy un estado al objeto
        a.marca = "Toyota";
        a.color = "Rojo";
        a.velocidad = 0;

        //cambio el estado del objeto a traves de sus metodos
        //o sea, a traves de su comportamiento
        a.acelerar();//0 --> 10
        a.acelerar();//10 --> 20
        a.frenar();//20 --> 15

        //informo el estado final del objeto
        a.informar();
        
    }
}
