package com.login;
import javax.swing.JOptionPane;

public abstract class Vehiculo {
    //Atributos
    protected int Kilometraje, estado, precio;
    protected String codigo, Marca, Modelo;
    private String Color;
    float precioR=0;
    int precioP = 0;

    //Metodos
    public Vehiculo(int Kilometraje, int precio, int estado, String codigo, String Marca, String Color, String Modelo) {
        this.Kilometraje = Kilometraje;
        this.precio = precio;
        this.estado = estado;
        this.codigo = codigo;
        this.Marca = Marca;
        this.Color = Color;
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }
    
    public void setColor(String Color) {
        this.Color = Color;
        this.precioP += 100000;
    }
    
    public void movimiento(){
            if(this.estado>7&&this.estado<=10){
               JOptionPane.showMessageDialog(null,"El vehiculo funciona correctamente.");
            }else if(this.estado>=4&&this.estado<=7){
               JOptionPane.showMessageDialog(null, """
                                                   El vehiculo funciona con dificultades
                                                   Se recomienda reparaciones""");
            }else{
                JOptionPane.showMessageDialog(null, """
                                                    El vehiculo no logra arranca.
                                                    Se requiere reparacion""");
            }
    }
        
    public void vender(){
        if(precioR==this.precio || precioR==0){
            JOptionPane.showMessageDialog(null, "Precio inical: "+this.precio+"\nTotal en cambio de pintura: "+this.precioP
            + "\nTotal en reparaciones: 0"+"\nPrecio total: "+(this.precio+this.precioP));
        }else{
            JOptionPane.showMessageDialog(null, "Precio inical: "+this.precio+"\nTotal en cambio de pintura: "+this.precioP
            + "\nTotal en reparaciones: "+this.precioR+"\nPrecio total: "+(this.precio+this.precioP+this.precioR));
        }
    }
    
    public String Imprimir() {
        return "Marca: "+this.Marca+", Modelo: "+this.Modelo+", Kilometraje: "+this.Kilometraje+
                ",\n    Color: "+this.getColor()+", Estado: "+this.estado+", Codigo/placa: "+this.codigo;
    }
    
    public abstract void Reparar();
}