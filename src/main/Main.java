package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args){

        //use class named JFrame we named it window(we created an instance of that class)
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);    

    //add gamepanel to window
       GamePanel gp = new GamePanel();
       window.add(gp);
       window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();


    }
}
