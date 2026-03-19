package objetos;

public class Auto {
    //atributos
    public String marca;
    public String color;
    public int velocidad;

    //metodo constructor vacio
    public Auto() {
    }

    //metodos
    public void acelerar() {
        this.velocidad += 10;
    }
    
    public void frenar() {
        this.velocidad -= 5;
    }
    
    public void informar() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Color: " + this.color);
        System.out.println("Velocidad: " + this.velocidad);
    }

}
