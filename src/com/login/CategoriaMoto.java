package com.login;
import java.util.ArrayList;
import java.util.List;

public class CategoriaMoto {
     //Atrib
    int nombre;
    private String codigo;
    private List<Motocicleta> motos;
    
    //Metodos
    public CategoriaMoto(int nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.motos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMotos(int O) {
        return motos.get(O).Imprimir();
    }
    
    public void AgregarMoto(Motocicleta nuevo){
        this.motos.add(nuevo);
    }
}
