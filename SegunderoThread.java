/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundero;

import java.time.LocalTime; 

/**
 *
 * @author Papubonilla
 */
public class SegunderoThread implements Runnable{
    
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Segundo: " + LocalTime.now().getSecond());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
