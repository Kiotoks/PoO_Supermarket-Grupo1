package supermarket;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Supermarket {

    public static void main(String[] args) {
        Producto p1 = new Producto( "Fideos Spaghetti", 250 , "Marolio", true, false);
        Producto p2 = new Producto( "Flin Paff", 25 , "Arcor", false, false);
        Producto p3 = new Producto( "Papas Fritas", 450 , "Lays", false, true);

        Feha fecha = new Fecha(20,10,2022);
        Venta v1 = new Venta(fecha);
        v1.agregarProd(p1);
        v1.agregarProd(p2);
        v1.agregarProd(p3);
        
        SuperMercado superM = new SuperMercado();
        superM.agregarVenta(v1)
        superM.mostrarSuper();
    }
    
}
