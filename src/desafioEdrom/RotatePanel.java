package desafioEdrom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RotatePanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static final int SIZE = 1024;
    private final Timer timer = new Timer(25, this);
    private Image image = RotableImage.getImage(SIZE);
    public static double theta = 0;
    public static int x_0 = (SIZE / 2);
    public static int y_0 = (SIZE / 2);
    public static int x_f = x_0;
    public static int y_f = y_0;
    public static int i = 0;
    public static double thetaFinal, aux;
    public static double velocMax = RotateApp.velMax[i];
    public static double velocAngMax = RotateApp.velAngMax;
    public static double vel = 0;
    public static double velAng = 0;
    public static Controle controleTranslacao = new Controle(0.000010, 0.250000, 0.000002);
    public static Controle controleRotacao = new Controle(0.000020, 0.800000, 0.000010);

    public RotatePanel() {
        
    	this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(image.getWidth(this), image.getHeight(this)));
        
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                // x_f = e.getX();
                // y_f = e.getY(); 
            	i += 1;
            	i = i % (RotateApp.velMax.length);
            	velocMax = RotateApp.velMax[i];
            	image = RotableImage.getImage(SIZE);
            }
        });
        
        this.addMouseMotionListener(new MouseAdapter() {
        	@Override
        	public void mouseMoved(MouseEvent e) {
        		x_f = e.getX();
        		y_f = e.getY();
        	}
        });
        
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(x_0, y_0);
        g2d.rotate(theta);
        g2d.translate((-image.getWidth(this) / 2), -image.getHeight(this) / 2);
        g2d.drawImage(image, 0, 0, null);
		        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	System.out.println("(" + x_f + ", " + y_f + ")" + ", " + "(" + x_0 + ", " + y_0 + ")");
    	System.out.println(theta + ", " + thetaFinal);
        System.out.println("velocidade rotacao imposta: " + velAng);
        System.out.println("velocidade translacao imposta: " + vel);
        System.out.println();
        
		Rotacao.algoritmoRotacao();
		Translacao.algoritmoTranslacao();
    	
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(SIZE, SIZE);
    }
	
}
