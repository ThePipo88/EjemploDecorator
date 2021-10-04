package com.example.singleton;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

      FlowController monitor1 =  FlowController.getInstance();
      FlowController monitor2 =  FlowController.getInstance();

      System.out.println(monitor1.hashCode());
      System.out.println(monitor2.hashCode());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                FlowController monitor1 = FlowController.getInstance();

                System.out.println(monitor1.hashCode());
            }
        });

        /*Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                FlowController monitor2 = FlowController.getInstance();

                System.out.println(monitor2.hashCode());
            }
        });
        t1.start();
        t2.start();*/
    }
    public static void main(String[] args) {
        launch();
    }
}