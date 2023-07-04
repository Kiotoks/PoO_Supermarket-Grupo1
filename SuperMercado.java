package supermarket;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SuperMercado {
    private ArrayList<Venta> ventas;
    private int cantCuidados;
    private int cantPrimeraN;
    private ArrayList<Fecha> fechas;

    public SuperMercado(){
        this.ventas = new Arraylist();
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
    
    public int calcularCantCui(Fecha f){
        for(Venta v: ventas){
            if (ventas.getFecha == f){
              for(Producto p: v.producto){ 
                if(p.getPrecioCuidado() == true){
                    cantCuidados ++;
                }  
            }
         }
     }  
     return cantCuidados;
    }
    
    
    public int calcularCantPri(Fecha f){
        for(Venta v: ventas){
            if (ventas.getFecha == f){
               for(Producto p: v.producto){ 
                    if(p.getPrimeraNecesidad() == true){
                        cantPrimeraN ++;
                    }
                }   
            }
        }
        return cantPrimeraN;
    }
    
    public void agregarVenta(Venta v){
        ventas.add(v);
    }
    
    public void mostrarSuper(){
        for(Fecha f: fechas){
            JOptionPane.showMessageDialog(null, f "La cantidad de productos de precios cuidados son: " + calcularCantCui());
            for(Venta v: ventas){
                if (ventas.getFecha == f){
                    JOptionPane.showMessageDialog(null, v.imprimirTicket());
                }
            }
        }

        

        
        JOptionPane.showMessageDialog(null, "La cantidad de productos de precios cuidados son: " + calcularCantCui());
        JOptionPane.showMessageDialog(null, "La cantidad de productos de primera necesidad son: " + calcularCantPri());
    }
}
