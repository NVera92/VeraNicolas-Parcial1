package models;

public class Impresora extends Informatico{
    private Integer impresionesPorMinuto;

    public Impresora() {
    }

    public Impresora(String nombre, Double precio, Integer stock, String fabricante, Integer impresionesPorMinuto) {
        super(nombre, precio, stock, fabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +super.toString()+
                "impresionesPorMinuto=" + impresionesPorMinuto +
                '}';
    }
}
