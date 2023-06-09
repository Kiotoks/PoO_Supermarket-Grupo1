package supermarket;

public class Producto {
    private String nombre;
    private double precio;
    private String marca;
    private boolean precioCuidado;
    private boolean primeraNecesidad;
    
    public Producto(String n, double p, String m){
        this.nombre = m;
        this.precio = p;
        this.marca = m;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isPrecioCuidado() {
        return precioCuidado;
    }

    public void setPrecioCuidado(boolean precioCuidado) {
        this.precioCuidado = precioCuidado;
    }

    public boolean isPrimeraNecesidad() {
        return primeraNecesidad;
    }

    public void setPrimeraNecesidad(boolean primeraNecesidad) {
        this.primeraNecesidad = primeraNecesidad;
    }

    public String mostrarProducto() {
        return  "nombre:" + nombre + ", precio:" + precio + ", marca:" + marca + ", precioCuidado:" + precioCuidado + ", primeraNecesidad:" + primeraNecesidad;
    }
    
    
    public double calcularPrecio(){
        double porcentaje;
        if(this.primeraNecesidad == true){
        
            porcentaje = precio/100*10;
            precio = precio - porcentaje;
        }
        return precio;
    }
   
    
}
