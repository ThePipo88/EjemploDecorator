package com.adapter.modeloAdapter;

import com.adapter.DiscoDuro;
import com.adapter.DiscoDuroPortatil;

import javax.swing.*;

public class DiscoDuroPortatilAdapter extends DiscoDuro {

    private DiscoDuroPortatil discoDuroPortatil;

    public DiscoDuroPortatilAdapter()
    {
        this.discoDuroPortatil = new DiscoDuroPortatil();
    }

    @Override
    public String almacenar() {
       return discoDuroPortatil.conectarPuertoUsb() + "\n" + discoDuroPortatil.almacenarInformacion();
    }

    @Override
    public String borrar() {
        if(JOptionPane.showConfirmDialog(null, "Desea desconectar el disco duro ?") == 0){
            return discoDuroPortatil.eliminarInformacion() + "\n" + discoDuroPortatil.desconectarUsb();
        }
        return discoDuroPortatil.eliminarInformacion();
    }
}
