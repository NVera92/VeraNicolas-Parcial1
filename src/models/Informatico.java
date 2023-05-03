package models;

public abstract class Informatico extends Producto{
    private String fabricante;

    public Informatico() {
    }

    public Informatico(String nombre, Double precio, Integer stock, String fabricante) {
        super(nombre, precio, stock);
        this.fabricante = fabricante;
    }


}
