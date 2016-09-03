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
public class Ventas {

    private Vendedor vendedor;
    private List<Detalle> detalles;
    private double total;
   
    public void mostrarDetalle(List<Detalle> detalles) {

        for (Detalle detalle : detalles) {
            System.out.println("Codigo Producto " + detalle.getProducto().getCodArticulo());
            System.out.println("Nombre Producto " + detalle.getProducto().getNomArticulo());
            System.out.println("Precio Producto " + detalle.getProducto().getPrecio());
            System.out.println("Unidades Compradas " + detalle.getUnidad());
            System.out.println("SubTotal " + detalle.getTotalUnidad());
            System.out.println("");
        }
    }

    public void totalVenta(List<Detalle> detalles) {
        double venta = 0;
        for (Detalle detalle : detalles) {
            venta = venta + detalle.getTotalUnidad();
            total = venta;
        }

        comisionVentasSemana(venta);
    }

    public void comisionVentasSemana(double venta) {
        vendedor.setComision(venta * 0.09);
    }

    public void mostrarVendedor() {
        vendedor.mostrarVendedor();
    }

    public void mostrarFactura() {
        totalVenta(detalles);
        mostrarVendedor();
        System.out.println("");
        mostrarDetalle(detalles);
        System.out.println("Total Venta " + total);

    }

    public void mostrarVenta(boolean check1, boolean check2) {
        totalVenta(detalles);

        if (check1 == true) {
            mostrarVendedor();
            System.out.println("");
        }
        if (check2 == true) {
            System.out.println("Detalle Pedido");
            mostrarDetalle(detalles);
        }

        System.out.println("");
        
        
                
        System.out.println("Total Venta " + total);

    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double Total) {
        this.total = Total;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }


   

}
