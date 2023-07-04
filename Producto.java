package supermarket;

import javax.swing.JOptionPane;

public class Producto {
    private String nombre;
    private double precio;
    private String marca;
    private boolean precioCuidado = false;
    private boolean primeraNecesidad = false;
    
    public Producto(String n, double p, String m, boolean pc, boolean ppn){
        this.nombre = m;
        this.precio = p;
        this.marca = m;
        this.precioCuidado = pc;
        this.primeraNecesidad = ppn;
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

    public boolean getPrecioCuidado() {
        return precioCuidado;
    }

    public void setPrecioCuidado(boolean precioCuidado) {
        this.precioCuidado = precioCuidado;
    }

    public boolean getPrimeraNecesidad() {
        return primeraNecesidad;
    }

    public void setPrimeraNecesidad(boolean primeraNecesidad) {
        this.primeraNecesidad = primeraNecesidad;
    }

    public String mostrarProducto() {
        return  "nombre:" + nombre + ", precio:" + precio + ", marca:" + marca + ", precioCuidado:" + precioCuidado + ", primeraNecesidad:" + primeraNecesidad;
    }

}

