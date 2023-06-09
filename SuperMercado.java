package supermarket;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SuperMercado {
    private ArrayList<Venta> ventas;
    private ArrayList<Producto> productos;
    private int cantCuidados;
    private int cantPrimeraN;
    
    public SuperMercado(ArrayList<Venta> v, ArrayList<Producto> p){
        this.ventas = v;
        this.productos = p;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> v) {
        this.ventas = v;
    }

    public int getCantCuidados() {
        return cantCuidados;
    }

    public void setCantCuidados(int cantC) {
        this.cantCuidados = cantC;
    }

    public int getCantPrimeraN() {
        return cantPrimeraN;
    }

    public void setCantPrimeraN(int cantP) {
        this.cantPrimeraN = cantP;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public int calcularCantCui(){
     for(Producto p: productos){
         if(productos.getPrecioCuidado() == true){
             cantCuidados ++;
         }
     }  
     return cantCuidados;
    }
    
    public int calcularCantPri(){
        for(Producto p: productos){
            if(productos.getPrimeraNecesidad() == true){
                cantPrimeraN ++;
            }
        }
        return cantPrimeraN;
    }
    
    public void agregarVenta(){
        productos.add(Producto);
    }
    
    public void mostrarSuper(){
        for(Venta v: ventas){
            JOptionPane.showMessage(null, v);
        }
        JOptionPane.showMessageDialog(null, "La cantidad de productos de precios cuidados son: " + cantCuidados);
        JOptionPane.showMessageDialog(null, "La cantidad de productos de primera necesidad son: " + cantPrimeraN);
    }
}
