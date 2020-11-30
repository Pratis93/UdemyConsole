/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole;
import java.awt.Rectangle;
import javax.swing.JFrame;
/**
 *
 * @author Luck
 */
public class JavaConsole extends JFrame{
    
        JavaConsole()
        {
            initialization();
        }
    
    void initialization()
    {
        System.out.println("aa2");
        setBounds(200, 200, 100, 100);
        setTitle("Bounds");
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       new JavaConsole();
        // TODO code application logic here
    }
}
