package metodos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //creo un objeto Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);

        //pido al usuario que ingrese el saldo inicial y la moneda
        System.out.print("Ingrese el saldo inicial: ");
        int saldo = sc.nextInt();
        System.out.print("Ingrese la moneda: ");
        String moneda = sc.next();


        //creo una caja de ahorro
        CajaDeAhorro caja1 = new CajaDeAhorro(saldo, moneda);

        //pido al usuario que ingrese un monto a depositar
        System.out.print("Ingrese el monto a depositar: ");
        int monto = sc.nextInt();
        caja1.depositar(monto);

        //pido al usuario que ingrese un monto a extraer
        System.out.print("Ingrese el monto a extraer: ");
        monto = sc.nextInt();
        String resultado = caja1.extraer(monto);
        System.out.println(resultado);

        //informo el saldo de la caja de ahorro
        caja1.informar();

        System.out.println("Mensaje personalizado:");
        caja1.mostrarMensaje("¡Operación realizada con éxito!");
        
        //cierro el scanner
        sc.close();
    }
}
