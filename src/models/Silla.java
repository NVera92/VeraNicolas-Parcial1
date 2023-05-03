package models;

public class Silla extends Mueble{
    private Boolean poseeRuedas;

    public Silla() {
    }

    public Silla(String nombre, Double precio, Integer stock, Boolean poseeRuedas) {
        super(nombre, precio, stock);
        this.poseeRuedas = poseeRuedas;
    }

    public Boolean getPoseeRuedas() {
        return poseeRuedas;
    }

    public void setPoseeRuedas(Boolean poseeRuedas) {
        this.poseeRuedas = poseeRuedas;
    }

    @Override
    public String toString() {
        return "Silla{" +super.toString()+
                "poseeRuedas=" + poseeRuedas +
                '}';
    }
}
