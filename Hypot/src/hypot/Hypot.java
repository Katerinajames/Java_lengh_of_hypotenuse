/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hypot;

import javax.swing.JOptionPane;

/**
 *
 * @author katherine
 * Use the Pythagorean theorem to
find the length of the hypotenuse
given the lengths of the two opposing sides  c = √(a² + b²)

 * 
 * 
 */
public class Hypot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double  z;
        String s=JOptionPane.showInputDialog("Enter the length of the first side");
        int x=Integer.parseInt(s);
        String s1=JOptionPane.showInputDialog("Enter the length of the second side");
        int y=Integer.parseInt(s1);
        z = Math.sqrt(x*x + y*y);
        String message=String.format("Hypotenuse is "+z);
        JOptionPane.showMessageDialog(null,message);
        
               

        
    }
    
}
