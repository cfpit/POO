package sobrecarga;

public class Test {
    public static void main(String[] args) {
        //creamos un objeto de la clase Auto
        Auto auto1 = new Auto("Toyota", 0);

        //comportamiento del metodo acelerar sin sobrecarga
        auto1.acelerar();//0 --> 10
        auto1.acelerar(35);//10 --> 45

        //imprimimos el estado del auto
        System.out.println(auto1);
    }
}
