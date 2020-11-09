package desafioEdrom;

import java.awt.*;
import javax.swing.*;

public class RotateApp {
	
	public static double velMax[] = {10.0/25.0, 20.0/25.0, 35.0/25.0};
	public static final double velAngMax = (Math.PI / 10)/25.0;

    public static void main(String[] args) {
    	
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new RotatePanel());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
