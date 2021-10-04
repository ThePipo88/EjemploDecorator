package com.adapter;

import com.adapter.modeloAdapter.DiscoDuroPortatilAdapter;

import javax.swing.*;

public class Main {
 private static DiscoDuro discoDuro;

 public static void usarDiscoDuro()
 {
     JOptionPane.showConfirmDialog(null,discoDuro.almacenar() + "\n" + discoDuro.borrar());
 }
    public static void main(String[] args) {
            int opcion = 0;
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n\n1.Disco Duro 1\n2.Disco Duro\n 3. Disco Duro Portatil\n 4.Salir"));
                switch (opcion){
                    case 1:
                        discoDuro = new DiscoDuro1();
                        usarDiscoDuro();
                        break;
                    case 2:
                        discoDuro = new DiscoDuro2();
                        usarDiscoDuro();
                        break;
                    case 3:
                        discoDuro = new DiscoDuroPortatilAdapter();
                        usarDiscoDuro();
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Fin del programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion invalida");
                }
            }while (opcion != 4);
    }
}
