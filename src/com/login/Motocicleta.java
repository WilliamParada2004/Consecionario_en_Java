package com.login;

import javax.swing.JOptionPane;

public class Motocicleta extends Vehiculo{
    //Atributos
    private int kilovatios;
    
    //Metodos
    public Motocicleta(int kilovatios, int Kilometraje, int precio, int estado, String codigo, String Marca, String Color, String Modelo) {
        super(Kilometraje, precio, estado, codigo, Marca, Color, Modelo);
        this.kilovatios = kilovatios;
    }

    public int getKilovatios() {
        return kilovatios;
    }
    
    @Override
    public void Reparar() {
        precioR=this.precio;
        
        switch(this.estado){
            case 1,2,3:
                this.estado = 10;
                this.precioR *= 0.2;
                JOptionPane.showMessageDialog(null,"Moto reparada, se cobra un 20% del valor del precio adicional.");
                break;
            case 4,5,6:
                this.estado = 10;
                this.precioR *= 0.1;
                JOptionPane.showMessageDialog(null,"Moto reparada, se cobra un 10% del valor del precio adicional.");
                break;
            case 7,8,9:
                this.estado = 10;
                this.precioR *= 0.03;
                JOptionPane.showMessageDialog(null,"Moto reparada, se cobra un 5% del valor del precio adicional.");
                break;
            default:
               JOptionPane.showMessageDialog(null,"La motocicleta esta en perfectas condiciones.");
                break;
        }
    }
}
