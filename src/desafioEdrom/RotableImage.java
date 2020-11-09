package desafioEdrom;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.io.File;

public class RotableImage {

    public static Image getImage(int size) {
    	
    	try{
    		
    		if (RotatePanel.i == 0) {
    			BufferedImage bi = ImageIO.read(new File("duke.png"));
    			return bi;
    		} else if (RotatePanel.i == 1) {
    			BufferedImage bi = ImageIO.read(new File("dukeSelvagem.png"));
    			return bi;
    		} else if (RotatePanel.i == 2) {
    			BufferedImage bi = ImageIO.read(new File("dukeNinja.png"));
    			return bi;
    		}
    		
    	}catch (IOException ex) {
            Logger.getLogger(RotableImage.class.getName()).log(Level.SEVERE, null, ex);
        }
    	
        return null;
        
    }

}
