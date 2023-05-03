package models;

public class Notebook extends Informatico{
    private Integer memoria;

    public Notebook() {
    }

    public Notebook(String nombre, Double precio, Integer stock, String fabricante, Integer memoria) {
        super(nombre, precio, stock, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" + super.toString()+
                "memoria=" + memoria +
                '}';
    }
}
