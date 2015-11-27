/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/*******************
 * To do:
 *  Menu bar
 *  Finish initialisation
 * ****************/

/**
 *
 * @author UP732011 <email UP732011@myport.ac.uk />
 */
public class StandardGUI extends JFrame {
    private JMenuBar mainMenuBar;
    Dimension userScreen;
    /**
     * 
     * @param name 
     */
    public StandardGUI(String name)
    {
        super();
        this.userScreen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setTitle(name);
        this.setSize((int)Math.floor(userScreen.width*0.5), 
                (int)Math.floor(userScreen.height*0.5));
        initGUI();
        
    }
    /**
     * 
     */
    public StandardGUI()
    {
        this("Standard GUI! =]");
    }
    /**
     * 
     * @param name The name of the frame
     * @param percentage The percentage to fill the screen with (x and y)
     */
    public StandardGUI(String name, double percentage)
    {
        this(name);
        this.setSize((int)Math.floor(userScreen.width*percentage), 
                (int)Math.floor(userScreen.height*percentage));
        
    }
    /**
     * Initiates the GUI components.
     */
    private void initGUI()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try 
        {
            //*INITMENUBAR* must be called before altering other GUI stuff
            initMenuBar();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) 
        {
            swallowError(ex);
        }
    }
    /**
     * Initiates the GUI menu bar
     */
    private void initMenuBar() throws Exception
    {
        this.mainMenuBar = new JMenuBar();
        //load file menu components from a file...
        this.setJMenuBar(mainMenuBar);
        throw new UnsupportedOperationException("Um.. main menu?");
        
    }
    /**
     * Handle system errors by outputting information to the user
     * @param ex the error exception
     */
    private void swallowError(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
}
