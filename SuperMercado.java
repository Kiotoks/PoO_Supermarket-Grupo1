package supermarket;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SuperMercado {
    private ArrayList<Venta> ventas;
    private int cantCuidados;
    private int cantPrimeraN;
    
    public SuperMercado(ArrayList<Venta> v){
        this.ventas = v;
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
    
    public int calcularCantCui(){
     for(Venta v: ventas){
         for(Producto p: v.producto){ 
            if(p.getPrecioCuidado() == true){
                cantCuidados ++;
            }
         }
     }  
     return cantCuidados;
    }
    
    
    public int calcularCantPri(){
        for(Venta v: ventas){
            for(Producto p: v.producto){ 
                if(p.getPrimeraNecesidad() == true){
                    cantPrimeraN ++;
                }
            }
        }
        return cantPrimeraN;
    }
    
    public void agregarVenta(Venta v){
        ventas.add(v);
    }
    
    public void mostrarSuper(){
        for(Venta v: ventas){
            JOptionPane.showMessageDialog(null, v.imprimirTicket());
        }
        JOptionPane.showMessageDialog(null, "La cantidad de productos de precios cuidados son: " + calcularCantCui());
        JOptionPane.showMessageDialog(null, "La cantidad de productos de primera necesidad son: " + calcularCantPri());
    }
}
