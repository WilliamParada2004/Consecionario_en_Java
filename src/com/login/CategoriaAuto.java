package com.login;
import java.util.ArrayList;
import java.util.List;

public class CategoriaAuto {
    //Atrib
    String nombre;
    private String codigo;
    private List<Carro> carros;
    
    //Metodos
    public CategoriaAuto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutos(int O) {
        return carros.get(O).Imprimir();
    }
    
    public void AgregarCarro(Carro nuevo){
        this.carros.add(nuevo);
    }
}