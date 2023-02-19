package com.appempresarial.springfactura.models;

public class ItemFactura {
    //Atributos
    private Producto producto;
    private int cantidad;
    //Metodos
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double calcularImporte() {
        return cantidad * producto.getPrecio();
    }
    
}
