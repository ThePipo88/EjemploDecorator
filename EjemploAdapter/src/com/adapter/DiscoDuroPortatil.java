package com.adapter;

public class DiscoDuroPortatil {

    private boolean conectado;

    public DiscoDuroPortatil(){
        this.conectado = false;
    }

    public String conectarPuertoUsb(){
        if(!conectado){
            conectado = true;
            return "Disco duro del portatil conectado";
        }
        else {
            return "Disco duro del portatil ya estaba conectado";
        }
    }

    public String desconectarUsb(){
        if(conectado){
            return "El disco duro desconectado";
        }
        else{
            return "El disco duro del portatil esta desconectado";
        }
    }

    public String almacenarInformacion()
    {
        return "Informacion almacenada correctamente dentro de la unidad de disco duro portatil";
    }

    public String eliminarInformacion()
    {
        return "Informacion eliminada con exito de la unidad de disco duro portatil";
    }
}
