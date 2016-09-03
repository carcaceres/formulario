/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.clases.Detalle;
import com.clases.Detalle;
import com.clases.Vendedor;
import com.clases.Vendedor;
import java.util.List;

/**
 *
 * @author Carlos
 */
public interface Serviciable {
    public void cargarFactura(Vendedor vendedor,List<Detalle> detalles,
             boolean check1,boolean check2);
}
