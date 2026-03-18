package arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Ejercicio 1
         * Dado el vector {10,20,5,15,30,20}
         * Informar el vector de la forma: "Índice: X, Valor: Y"
         * Totalizar el vector e informar el total
         * Informar el contenido de las posiciones impares (por ejemplo, las posiciones
         * 1,3,5,etc)
         * Informar el mayor número
         * Informar cuántas veces aparece el número 20
         */
        // defino e inicializo el vector
        int[] vector = { 10, 20, 5, 15, 30, 20 };

        // recorro el vector con un for e imprimo el índice y el valor
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + vector[i]);
        }

        System.out.println("---------------------------------------");

        // {10,20,5,15,30,20}
        // totalizo el vector e imprimo el total
        System.out.println("inicio");

        int total = 0;

        for (int i = 0; i < vector.length; i++) {
            total = total + vector[i];// total += vector[i];
        }

        System.out.println("Total: " + total);

        System.out.println("fin");

        System.out.println("---------------------------------------");

        // informo el contenido de las posiciones impares
        for (int i = 1; i < vector.length; i += 2) {
            System.out.println("Índice: " + i + ", Valor: " + vector[i]);
        }

        System.out.println("---------------------------------------");

        // informo el mayor número
        // {10,20,5,15,30,20}
        // int mayor = vector[0];//valido si el vector tiene al menos un negativo
        int mayor = 0;// valido si todos los valores del vector son positivos
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        System.out.println("Mayor número: " + mayor);

        System.out.println("---------------------------------------");

        // informo cuántas veces aparece el número 20
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 20) {
                contador++;
            }
        }
        System.out.println("El número 20 aparece " + contador + " veces.");

        /*
         * Ejercicio 2
         * Dado el vector inflación {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3,
         * 0.2, 0.9}
         * Cada ítem del vector representa la inflación de un mes de tal manera que el
         * primer ítem del vector que es 0.8 representa la inflación de Enero, y el
         * último ítem del vector que es 0.9 representa la inflación de diciembre.
         * Se pide:
         * Informar la inflación anual
         * Informar la inflación más baja, junto con el número de mes. Por ejemplo: Mes
         * 2 = 0.1
         * Informar la inflación más alta, junto con el número de mes. Por ejemplo: Mes
         * 12 = 0.9
         * Informar el promedio de inflación (inflación total / 12)
         * 
         */

        double[] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};

        double totalInflacion = 0, inflacionMasBaja = inflacion[0], inflacionMasAlta = inflacion[0];

        int mesInflacionMasBaja = 1, mesInflacionMasAlta = 1;

        for (int i = 0; i < inflacion.length; i++) {
            totalInflacion += inflacion[i];// totalInflacion = totalInflacion + inflacion[i];

            //obtengo la inflación más baja y el número de mes
            if (inflacion[i] < inflacionMasBaja) {
                inflacionMasBaja = inflacion[i];
                mesInflacionMasBaja = i + 1;
            }

            //obtengo la inflación más alta y el número de mes
            if (inflacion[i] > inflacionMasAlta) {
                inflacionMasAlta = inflacion[i];
                mesInflacionMasAlta = i + 1;
            }
        }

        System.out.println("Inflación anual: " + totalInflacion);
        System.out.println("Inflación más baja: " + inflacionMasBaja + " (Mes " + mesInflacionMasBaja + ")");
        System.out.println("Inflación más alta: " + inflacionMasAlta + " (Mes " + mesInflacionMasAlta + ")");
        System.out.println("Promedio de inflación: " + (totalInflacion / inflacion.length));


    }
}
