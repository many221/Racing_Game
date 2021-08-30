package com.UI.GUI;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private GamePanel panel;

     GameFrame(){

         panel = new GamePanel ();
         this.add ( panel );
         this.setTitle ( "Drag Racing" );
         this.setDefaultCloseOperation ( EXIT_ON_CLOSE );
         this.setResizable ( false );
         this.setBackground ( Color.LIGHT_GRAY );
         this.pack ();
         this.setVisible ( true );
         this.setLocationRelativeTo ( null );


    }

    public GamePanel getPanel() {
        return panel;
    }
    //    JFrame test = new JFrame ();
//        test.setName ( "DragRacing");
//        test.setVisible ( true );
//        test.setBounds ( 200,300,500,350 );
//        test.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
}
