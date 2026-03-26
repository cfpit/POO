package encapsulamiento;

public class Auto {
    // Atributos
    private String marca;
    private String color;
    private int velocidad;

    //constructor vacio
    public Auto() {
    }

    //constructor con parametros
    public Auto(String marca, String color, int velocidad) {    
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        //regla de negocio: la velocidad debe estar entre 0 y 130
        if (velocidad >= 0 && velocidad <= 130) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Velocidad no válida.");
        }
        
    }

    //metodos
    public void acelerar() {
        velocidad += 10;
    }

    public void acelerar(int km) {
        velocidad += km;
    }

    public void frenar() {
        velocidad -= 5;
    }
    
    public void frenar(int km) {
        velocidad -= km;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
    }



}
