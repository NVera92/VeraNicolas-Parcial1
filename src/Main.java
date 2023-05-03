import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /// Punto 3
        /// Instanciacion de los productos
        Silla s = new Silla("Oficina 3000",27500.50,20,true);
        Escritorio e = new Escritorio("Clasico",35000.25,15,1.10,2.25);
        Notebook n = new Notebook("Vostro",250000.0,5,"Dell",8);
        Impresora i = new Impresora("402",190050.0,10,"HP",250);

        /// Creacion del List
        List<Producto> listaProductos = new ArrayList<>();

        /// Agregado de los productos al List
        listaProductos.add(s);
        listaProductos.add(e);
        listaProductos.add(n);
        listaProductos.add(i);

        /// Recorre la lista y muestra a que instacia pertenecen los objetos
        System.out.println("Punto 3:");
        recorrerLista(listaProductos);

        /// Punto 4
        /// Recibe el decuento y un producto de la lista en particular.
        Double precioOferta = oferta(listaProductos.get(0),3.5);
        System.out.println("\nPunto 4:");
        System.out.println("El precio de Oferta es: "+precioOferta + ". El precio de lista es: "+listaProductos.get(0).getPrecio());


        /// Punto 5
        /// Se le pasa la lista y segun su tipo de instancia aplica los aumentos.
        System.out.println("\nPunto 5:");
        actualizacionPrecios(listaProductos);







    }

    public static void recorrerLista(List<Producto> lista){
        for(Producto p : lista){
            System.out.println(p.getClass().getSimpleName());
        }
    }

    /// Recibe el decuento y un producto de la lista en particular
    public static Double oferta(Producto p,Double porcentajeDescuento){
        Double n = null;
        if(p instanceof Silla || p instanceof Impresora){
            n = p.getPrecio()-((porcentajeDescuento/100)*p.getPrecio());
        }
        return n;
    }


    /// Arranque haciendo else-if, y el ide me tiro la sugerencia de hacerlo de esta manera, queda mucho mas prolijo.
    /// Se le pasa la lista y segun su tipo de instancia aplica los aumentos.
    public static void actualizacionPrecios(List<Producto> lista){
        if(!lista.isEmpty()){
            for(Producto p : lista){
                switch (p.getClass().getSimpleName()) {
                    case "Silla" -> {
                        Double d = 0.05;
                        System.out.println("Valor previo al aumento: " + p.getPrecio());
                        p.setPrecio(p.getPrecio() + (p.getPrecio() * d));
                        System.out.println("Valor luego del aumento: " + p.getPrecio());
                    }
                    case "Escritorio" -> {
                        Double d = 0.1;
                        System.out.println("Valor previo al aumento: " + p.getPrecio());
                        p.setPrecio(p.getPrecio() + (p.getPrecio() * d));
                        System.out.println("Valor luego del aumento: " + p.getPrecio());
                    }
                    case "Impresora" -> {
                        Double d = 0.15;
                        System.out.println("Valor previo al aumento: " + p.getPrecio());
                        p.setPrecio(p.getPrecio() + (p.getPrecio() * d));
                        System.out.println("Valor luego del aumento: " + p.getPrecio());
                    }
                    case "Notebook" -> {
                        Double d = 0.2;
                        System.out.println("Valor previo al aumento: " + p.getPrecio());
                        p.setPrecio(p.getPrecio() + (p.getPrecio() * d));
                        System.out.println("Valor luego del aumento: " + p.getPrecio());
                    }
                }
            }
        }
    }
}