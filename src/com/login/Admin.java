package com.login;
import java.util.ArrayList;
import java.util.List;

public class Admin {    
    int A=0,M=0,T1=0,T2=0,T3=0,T4=0,K1=0,K2=0,K3=0;
    String reporte="";
    CategoriaAuto TRACCIO4x4 = new CategoriaAuto("4X4","01");
    CategoriaAuto TRACCIODEL = new CategoriaAuto("DELANTERA","02");
    CategoriaAuto TRACCIOTRAS = new CategoriaAuto("TRASERA","03");
    CategoriaAuto TRACCIOOTRAS = new CategoriaAuto("OTRAS","04");
    CategoriaMoto KILO15 = new CategoriaMoto(15,"05");
    CategoriaMoto KILO35 = new CategoriaMoto(35,"06");
    CategoriaMoto KILON= new CategoriaMoto(99,"07");
    List<Carro> listaAutos = new ArrayList<>();
    List<Motocicleta> listaMotos = new ArrayList<>();
    
    //Añadir vehiculo 
    public void AñadirAuto(Carro CarroN){
        listaAutos.add(CarroN);
        A++;
        
        if(CarroN.getTraccion().equals(TRACCIO4x4.nombre)){
            TRACCIO4x4.AgregarCarro(CarroN);
            T1++;
        }else if(CarroN.getTraccion().equals(TRACCIODEL.nombre)){
            TRACCIODEL.AgregarCarro(CarroN);
            T2++;
        }else if(CarroN.getTraccion().equals(TRACCIOTRAS.nombre)){
            TRACCIOTRAS.AgregarCarro(CarroN);
            T3++;
        }else{
            TRACCIOOTRAS.AgregarCarro(CarroN);
            T4++;
        }
    }
    public void AñadirMoto(Motocicleta MotoN){
        listaMotos.add(MotoN);
        M++;
        
        if(MotoN.getKilovatios() == KILO15.nombre){
            KILO15.AgregarMoto(MotoN);
            K1++;
        }else if(MotoN.getKilovatios() == KILO35.nombre){
            KILO35.AgregarMoto(MotoN);
            K2++;
        }else{
            KILON.AgregarMoto(MotoN);
            K3++;
        }
    }
    
    //Busqueda de vehiculos (Modelo)
    public String busquedaAutos(String modelito){
        reporte="";
        if(A!=0){
            for(int i=0;i<A;i++){
                if((listaAutos.get(i).Modelo).equals(modelito)){
                    reporte+=(i+1)+". "+listaAutos.get(i).Imprimir()+"\n";
                }
            }
        }
        return reporte;
    }
    public String busquedaMotos(String modelito){
        reporte="";
        if(M!=0){
            for(int i=0;i<M;i++){
                if((listaMotos.get(i).Modelo).equals(modelito)){
                    reporte+=(i+1)+". "+listaMotos.get(i).Imprimir()+"\n";
                }
            }
        }
        return reporte;
    }
    
    //Busqueda de auto por traccion
    public String busquedaAutos2(String traccion){
        reporte="";
        if(traccion.equals(TRACCIO4x4.nombre)){
            if(T1!=0){
                for(int i=0;i<T1;i++){
                    reporte+=(i+1)+". "+TRACCIO4x4.getAutos(i)+"\n";
                }
            }
        }else if(traccion.equals(TRACCIODEL.nombre)){
            if(T2!=0){
                for(int i=0;i<T2;i++){
                    reporte+=(i+1)+". "+TRACCIODEL.getAutos(i)+"\n";
                }
            }
        }else if(traccion.equals(TRACCIOTRAS.nombre)){
            if(T3!=0){
                for(int i=0;i<T3;i++){
                    reporte+=(i+1)+". "+TRACCIOTRAS.getAutos(i)+"\n";
                }
            }
        }
        return reporte;
    }
    //Busqueda en motos por kilovatios
    public String busquedaMotos2(int kv){
        reporte="";
        if(kv == KILO15.nombre){
            if(K1!=0){
                for(int i=0;i<K1;i++){
                    reporte+=(i+1)+". "+KILO15.getMotos(i)+"\n";
                }
            }
        }else if(kv == KILO35.nombre){
            if(K2!=0){
                for(int i=0;i<K2;i++){
                    reporte+=(i+1)+". "+KILO35.getMotos(i)+"\n";
                }
            }
        }
        return reporte;
    }
    
    //Pintar
    public void pintarAuto(int opc,String nuevoC){
        listaAutos.get(opc).setColor(nuevoC);
    }
    public void pintarMoto(int opc,String nuevoC){
        listaMotos.get(opc).setColor(nuevoC);
    }
    
    //Reparar
    public void RepararAuto(int opc){
        listaAutos.get(opc).Reparar();
    }
    public void RepararMoto(int opc){
        listaMotos.get(opc).Reparar();
    }
    
    //Probar
    public void ProbarAuto(int opc){
        listaAutos.get(opc).movimiento();
    }
    public void ProbarMoto(int opc){
        listaMotos.get(opc).movimiento();
    }
    
    //Vender 
    public void DineroAuto(int opc){
        listaAutos.get(opc).vender();
    }
    public void DineroMoto(int opc){
        listaMotos.get(opc).vender();
    }
    
    //Remover
    public void QuitarAuto(int opc){
        listaAutos.remove(opc);
        A--;
    }
    public void QuitarMoto(int opc){
        listaMotos.remove(opc);
        M--;
    }
}
