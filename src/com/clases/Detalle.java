package com.clases;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Detalle {
    private Producto producto;
    private int unidad;
    private double totalUnidad;
   

    public Detalle(Producto producto, int unidad) {
        this.producto = producto;
        this.unidad = unidad;
        calculoUnidad();
      }

    
    
    
   

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public double getTotalUnidad() {
        return totalUnidad;
    }

    public void setTotalUnidad(double totalUnidad) {
        this.totalUnidad = totalUnidad;
    }
    
    public void calculoUnidad(){
        totalUnidad=producto.getPrecio()*unidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
