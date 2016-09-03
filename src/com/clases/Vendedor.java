package com.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Vendedor extends Persona{
    private String codVendedor;
    double PAGO_SEMANA=2000;
    private double comision;
    private double devengado;
    private String tipVend;
    private String calif;
    
    
    

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    public void ingresarVendedor(String codVendedor,String cedula,String nombres,
            String apellidos,String telefono,String tipoVend,String calif){
        this.codVendedor=codVendedor;
        super.setCedula(cedula);
        super.setNombres(nombres);
        super.setApellidos(apellidos);
        super.setTelefono(telefono);
        this.tipVend=tipoVend;
        this.calif=calif;
    }
    public void mostrarVendedor(){
       System.out.println("********** Datos del Vendedor ****************");
        System.out.println("Codigo Vendedor: "+this.codVendedor);       
        System.out.println("Cedula Vendedor: "+cedula);     
        System.out.println("Nombres Vendedor: "+nombres);
        System.out.println("Apellidos Vendedor: "+apellidos);
        System.out.println("Telefono Vendedor: "+telefono); 
        System.out.println("Tipo de Vendedor "+tipVend);
        System.out.println("Pago Semanal "+PAGO_SEMANA);
        System.out.println("Comisiones "+comision);
        totalDevengado();
        System.out.println("Total Devengado Semana "+devengado);
}
    public void totalDevengado(){
        devengado=PAGO_SEMANA+comision;
       }

    public double getDevengado() {
        return devengado;
    }

    public void setDevengado(double devengado) {
        this.devengado = devengado;
    }

    public String getTipVend() {
        return tipVend;
    }

    public void setTipVend(String tipVend) {
        this.tipVend = tipVend;
    }

    public String getCalif() {
        return calif;
    }

    public void setCalif(String calif) {
        this.calif = calif;
    }
    
}
