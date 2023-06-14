package supermarket;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Venta {
    ArrayList<Producto> productos;
    private static int cantTickets = 1;
    private int numeroTicket;
    private double totalDescuento;
    
    public Venta (//ArrayList<Producto> p){
        this.productos =new ArrayList();
        this.numeroTicket = Venta.cantTickets++;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> p) {
        this.producto = p;
    }

    public double getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(double td) {
        this.totalDescuento = td;
    }

    public void agregarProd(Producto p){
        producto.add(p);
    }
    
    public double calcularDesc(){
        double desc = 0;
        for(Producto p: producto){ 
            // NO usan Herencia
            if(p.getPrimeraNecesidad() == true){
                totalDescuento = p.getPrecio()*10/100;
                desc = totalDescuento - p.getPrecio();
            }
        }
     return totalDescuento; 
    }
    
    public String imprimirTicket(){
        String prod = "numero ticket: " + numeroTicket + "\n";
        for(Producto p: producto){
            prod +=  p.mostrarProducto();
        }
        return prod + calcularDesc();
    }
    
}

