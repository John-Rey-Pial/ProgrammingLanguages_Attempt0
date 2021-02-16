/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MSI
 */
public class activity1 {
     public static void main(String[] args) throws InterruptedException {
         for (int i = 1; i <= 10; i++) {
             System.out.println(i+" ");
             Thread.sleep(1000);
         }
    }
}
