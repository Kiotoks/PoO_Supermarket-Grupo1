package supermarket;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> producto;
    private double totalDescuento ;
    
    public Venta (ArrayList<Producto> p, double td){
        this.producto = p;
        this.totalDescuento = td;
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
    
    public double calcularDesc(){
        
     return totalDescuento; 
    }
    
    public void imprimirTicket(){
        
    }
    
}
