/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont; 
       double x, acserie;
       acserie=0;
       DecimalFormat f= new DecimalFormat("0.0");
       x = Double.parseDouble(JOptionPane.showInputDialog("valor X:"));
       for(cont = 1; cont<=20; cont++){
           acserie += 1.0/Math.pow(x, cont);
       }
JOptionPane.showMessageDialog(null,"O resultado da serie é:"+f.format(acserie));
 }   
}
