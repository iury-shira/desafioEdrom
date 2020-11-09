package desafioEdrom;

public class Rotacao {
	
	public static void algoritmoRotacao () {
		// Rotacao do Primeiro Quadrante
    	if ((RotatePanel.x_f > RotatePanel.x_0) && (RotatePanel.y_f < RotatePanel.y_0)) {
    		RotatePanel.thetaFinal = calcularThetaFinal();
        	if ((RotatePanel.theta < (RotatePanel.thetaFinal - Math.PI)) && (RotatePanel.theta >= -Math.PI)) {
        		// theta -= dt;
        		RotatePanel.theta -= RotatePanel.velAng*25.0;
        		RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		if (RotatePanel.theta < - Math.PI) {
        			RotatePanel.aux = Math.abs(RotatePanel.theta) - Math.PI;
        			RotatePanel.theta = Math.PI - RotatePanel.aux;
        		}
        	} else {
        		if (RotatePanel.theta < RotatePanel.thetaFinal) {
        			// theta += dt;
        			RotatePanel.theta += RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        		if (RotatePanel.theta > RotatePanel.thetaFinal) {
        			// theta -= dt;
        			RotatePanel.theta -= RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        	}
        }
        
        // Rotacao Segundo Quadrante
        if ((RotatePanel.x_f < RotatePanel.x_0) && (RotatePanel.y_f < RotatePanel.y_0)) {
        	RotatePanel.thetaFinal = calcularThetaFinal();
        	if ((RotatePanel.theta > (RotatePanel.thetaFinal + Math.PI)) && (RotatePanel.theta <= Math.PI)) {
        		// theta += dt;
        		RotatePanel.theta += RotatePanel.velAng*25.0;
        		RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		if (RotatePanel.theta > Math.PI) {
        			RotatePanel.aux = RotatePanel.theta - Math.PI;
        			RotatePanel.theta = -Math.PI + RotatePanel.aux;
        		}
        	} else {
        		if (RotatePanel.theta > RotatePanel.thetaFinal) {
        			// theta -= dt;
        			RotatePanel.theta -= RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        		if (RotatePanel.theta < RotatePanel.thetaFinal) {
        			// theta += dt;
        			RotatePanel.theta += RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        	}
        }
        
        // Rotacao Terceiro Quadrante
        if ((RotatePanel.x_f < RotatePanel.x_0) && (RotatePanel.y_f > RotatePanel.y_0)) {
        	RotatePanel.thetaFinal = calcularThetaFinal();
        	RotatePanel.thetaFinal = -Math.PI + RotatePanel.thetaFinal;
        	if ((RotatePanel.theta > (RotatePanel.thetaFinal + Math.PI)) && RotatePanel.theta <= Math.PI) {
        		// theta += dt;
        		RotatePanel.theta += RotatePanel.velAng*25.0;
        		RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		if (RotatePanel.theta > Math.PI) {
        			RotatePanel.aux = RotatePanel.theta - Math.PI;
        			RotatePanel.theta = -Math.PI + RotatePanel.aux;
        		}
        	} else {
        		if (RotatePanel.theta < RotatePanel.thetaFinal) {
        			// theta += dt;
        			RotatePanel.theta += RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        		if (RotatePanel.theta > RotatePanel.thetaFinal) {
        			// theta -= dt;
        			RotatePanel.theta -= RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        	}
        }
        
        // Rotacao Quarto Quadrante
        if ((RotatePanel.x_f > RotatePanel.x_0) && (RotatePanel.y_f > RotatePanel.y_0)) {
        	RotatePanel.thetaFinal = calcularThetaFinal();
        	RotatePanel.thetaFinal = Math.PI + RotatePanel.thetaFinal;
        	if ((RotatePanel.theta < (RotatePanel.thetaFinal - Math.PI)) && RotatePanel.theta >= -Math.PI) {
        		// theta -= dt;
        		RotatePanel.theta -= RotatePanel.velAng*25.0;
        		RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		if (RotatePanel.theta < -Math.PI) {
        			RotatePanel.aux = Math.abs(RotatePanel.theta) - Math.PI;
        			RotatePanel.theta = Math.PI - RotatePanel.aux;
        		}
        	} else {
        		if (RotatePanel.theta < RotatePanel.thetaFinal) {
        			// theta += dt;
        			RotatePanel.theta += RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        		if (RotatePanel.theta > RotatePanel.thetaFinal) {
        			// theta -= dt;
        			RotatePanel.theta -= RotatePanel.velAng*25.0;
        			RotatePanel.velAng = RotatePanel.controleRotacao.inputControle(RotatePanel.velocAngMax, Math.abs(RotatePanel.theta - RotatePanel.thetaFinal));
        		}
        	}
        }
        
        // zerando a velocidade angular em caso de ja ter atingido a orientacao necessaria
        if (Math.abs(RotatePanel.theta - RotatePanel.thetaFinal) < 0.2) {
        	RotatePanel.velAng = 0;
        	RotatePanel.controleRotacao.U[0] = RotatePanel.controleRotacao.U[1] = RotatePanel.controleRotacao.E[0] = RotatePanel.controleRotacao.E[1] = 0;
        }
	}
	
	public static double calcularThetaFinal() {
		
		int x, y;
    	double frac;
    	x = RotatePanel.x_f - RotatePanel.x_0;
    	y = -(RotatePanel.y_f - RotatePanel.y_0);
    	frac = (double)x / (double)y;
    	return Math.atan(frac);
		
	}

}
