package sobrecarga;

public class Auto {
    //atributos
    public String marca;
    public int velocidad;
    
    //constructores
    public Auto() {
    }

    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    //metodos
    //metodo acelerar sin sobrecarga
    public void acelerar() {
        this.velocidad += 10;
    }

    //metodo acelerar con sobrecarga
    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    //toString
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", velocidad=" + velocidad + '}';
    }
    

}
