package com.example.singleton;

public class FlowController {

    private static FlowController INSTANCE = null;


    private FlowController() {}

    /*private static void createInstance() {
        if (INSTANCE == null) {
            // Sólo se accede a la zona sincronizada
            // cuando la instancia no está creada
            synchronized (FlowController.class) {
                // En la zona sincronizada sería necesario volver
                // a comprobar que no se ha creado la instancia
                if (INSTANCE == null) {
                    INSTANCE = new FlowController();
                }
            }
        }
    }

    public static FlowController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }*/

    public /*synchronized*/ static FlowController getInstance(){
       if (INSTANCE == null){
           INSTANCE = new FlowController();
       }
       return INSTANCE;
    }
}