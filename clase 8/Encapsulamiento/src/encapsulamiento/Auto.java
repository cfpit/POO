package encapsulamiento;

public class Auto {
    // atributos
    private String marca;
    private String color;
    private int velocidad;

    // constructor vacio
    public Auto() {
    }

    // constructor con parametros
    public Auto(String marca, String color, int velocidad) {
        this.setMarca(marca);
        this.setColor(color);
        this.setVelocidad(velocidad);
    }


    // getters y setters
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
        
        //regla de negocio: el color puede ser blanco, rojo, negro o gris. Usar arrays de colores
        String[] coloresValidos = {"blanco", "rojo", "negro", "gris"};
        boolean colorValido = false;
        for (String c : coloresValidos) {
            if (c.equalsIgnoreCase(color)) {
                colorValido = true;
                break;
            }
        }
        if (colorValido) {
            this.color = color;
        } else {
            System.out.println("color incorrecto");
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        // regla de negocio: la velocidad no puede ser negativa ni mayor a 130
        if (velocidad >= 0 && velocidad <= 130) {
            this.velocidad = velocidad;
        } else {
            System.out.println("velocidad incorrecta");
        }
    }

    //metodo acelerar sin sobrecarga
    public void acelerar() {
        this.setVelocidad(velocidad + 10);
    }

    //metodo acelerar con sobrecarga
    public void acelerar(int incremento) {
        this.setVelocidad(this.velocidad + incremento);
    }
    
    //metodo frenar sin sobrecarga
    public void frenar() {
        this.setVelocidad(velocidad - 5);
    }

    //metodo frenar con sobrecarga
    public void frenar(int decremento) {
        this.setVelocidad(velocidad - decremento);
    }


    // metodo toString
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
    }

}
