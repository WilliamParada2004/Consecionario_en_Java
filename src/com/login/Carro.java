package com.login;

import javax.swing.JOptionPane;

public class Carro extends Vehiculo{
    //Atributos
    private String Traccion;
    
    //Metodos
    public Carro(String Traccion,int Kilometraje, int precio, int estado, String codigo, String Marca, String Color, String Modelo) {
        super(Kilometraje, precio, estado, codigo, Marca, Color, Modelo);
        this.Traccion = Traccion;
    }

    public String getTraccion() {
        return Traccion;
    }

    @Override
    public void Reparar(){
        precioR=this.precio;
        
        switch(this.estado){
            case 1,2,3:
                this.estado = 10;
                this.precioR *= 0.4;
                JOptionPane.showMessageDialog(null,"Auto reparado, se cobra un 40% del valor del precio adicional.");
                break;
            case 4,5,6:
                this.estado = 10;
                this.precioR *= 0.1;
                JOptionPane.showMessageDialog(null,"Auto reparado, se cobra un 10% del valor del precio adicional.");
                break;
            case 7,8,9:
                this.estado = 10;
                this.precioR *= 0.05;
                JOptionPane.showMessageDialog(null,"Auto reparado, se cobra un 5% del valor del precio adicional.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"El auto esta en perfectas condiciones.");
                break;
        }
    }
}
