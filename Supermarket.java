package supermarket;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Supermarket {

    public static void main(String[] args) {
        Producto p1 = new Producto( "Fideos Spaghetti", 250 , "Marolio");
        Producto p2 = new Producto( "Flin Paff", 25 , "Arcor");
        Producto p3 = new Producto( "Papas Fritas", 450 , "Lays");

        p1.setPrecioCuidado(true);
        p3.setPrimeraNecesidad(true);

        ArrayList productos = new ArrayList<Producto>();

        productos.add(p1);
        productos.add(p2); 
        productos.add(p3);

        Venta v1 = new Venta(productos);
        
        ArrayList v = new ArrayList<Venta>();
        
        SuperMercado superM = new SuperMercado(v);
        superM.mostrarSuper();
    }
    
}
