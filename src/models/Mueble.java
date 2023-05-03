package models;

public abstract class Mueble extends Producto{

    public Mueble() {
    }

    public Mueble(String nombre, Double precio, Integer stock) {
        super(nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "Mueble{}"+super.toString();
    }
}
