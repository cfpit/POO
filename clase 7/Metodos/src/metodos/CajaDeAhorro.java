package metodos;

public class CajaDeAhorro {
    //atributos
    public int saldo;
    public String moneda;
    
    //constructor vacio
    public CajaDeAhorro() {
    }

    //constructor con parametros
    public CajaDeAhorro(int saldo, String moneda) {
        this.saldo = saldo;
        this.moneda = moneda;
    }

    //metodos
    public void informar() {
        System.out.println("Saldo: " + saldo + " " + moneda);
    }

    public void depositar(int monto) {
        saldo += monto;
    }

    public String extraer(int monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return "Extracción realizada: " + monto + " " + moneda;
        } else {
            return "Saldo insuficiente";
        }
    }

    //metodo que reciba argumento pero no devuelva nada
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    } 


}
