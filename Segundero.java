/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundero;

/**
 *
 * @author Papubonilla
 */
public class Segundero {

    public static void main(String[] args) {
        Thread segunderoThread = new Thread(new SegunderoThread());
        segunderoThread.start();
    }
}
