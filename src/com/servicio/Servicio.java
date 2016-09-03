/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.clases.Detalle;
import com.clases.Vendedor;
import com.clases.Ventas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Servicio implements Serviciable{
   
   public void cargarFactura(Vendedor vendedor,List<Detalle> detalles,
           boolean check1,boolean check2){
        Ventas ventas = new Ventas();
        ventas.setVendedor(vendedor);
        ventas.setDetalles(detalles);
        ventas.mostrarVenta(check1,check2);
   } 
}
