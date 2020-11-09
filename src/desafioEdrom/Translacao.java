package desafioEdrom;

public class Translacao {
	
	public static void algoritmoTranslacao () {
		
		if ((Math.abs(RotatePanel.x_0 - RotatePanel.x_f) > 10) && (Math.abs(RotatePanel.y_0 - RotatePanel.y_f) > 10)) {
        	
			RotatePanel.x_0 = RotatePanel.x_0 + (int) (Math.sin(RotatePanel.theta)*(RotatePanel.vel*25.0));
			RotatePanel.y_0 = RotatePanel.y_0 - (int) (Math.cos(RotatePanel.theta)*(RotatePanel.vel*25.0));
        	
        	// chamada do controlador de velocidade de translacao 
			RotatePanel.vel = RotatePanel.controleTranslacao.inputControle(RotatePanel.velocMax, calcularDistancia ());
        	
        } else {
        	
        	if ((Math.abs(RotatePanel.theta - RotatePanel.thetaFinal) <= 0.4) && ((Math.abs(RotatePanel.x_0 - RotatePanel.x_f) > 10) || (Math.abs(RotatePanel.y_0 - RotatePanel.y_f) > 10))) {
        		
        		if (Math.abs(RotatePanel.x_0 - RotatePanel.x_f) > 10) { RotatePanel.x_0 = RotatePanel.x_0 + (int)(Math.sin(RotatePanel.theta)*(RotatePanel.vel*25.0)); }
        		if (Math.abs(RotatePanel.y_0 - RotatePanel.y_f) > 10) { RotatePanel.y_0 = RotatePanel.y_0 - (int)(Math.cos(RotatePanel.theta)*(RotatePanel.vel*25.0)); }
        		
        		// chamada do controlador de velocidade de translacao 
        		RotatePanel.vel = RotatePanel.controleTranslacao.inputControle(RotatePanel.velocMax, calcularDistancia ());
        	
        	}
        	// chegou no ponto de destino
        	else if ((Math.abs(RotatePanel.theta - RotatePanel.thetaFinal) <= 0.2) && (Math.abs(RotatePanel.x_0 - RotatePanel.x_f) < 10) && (Math.abs(RotatePanel.y_0 - RotatePanel.y_f) < 10)) {
        		RotatePanel.vel = 0;
        		RotatePanel.controleTranslacao.U[0] = RotatePanel.controleTranslacao.U[1] = RotatePanel.controleTranslacao.E[0] = RotatePanel.controleTranslacao.E[1] = 0;
        	}
        	// melhor rotacionar mais um pouco antes de transladar
        	else if (Math.abs(RotatePanel.theta - RotatePanel.thetaFinal) > 0.1) {
        		RotatePanel.vel = 0;
        		RotatePanel.controleTranslacao.U[0] = RotatePanel.controleTranslacao.U[1] = RotatePanel.controleTranslacao.E[0] = RotatePanel.controleTranslacao.E[1] = 0;
        	}
        	
        }
		
	}
	
	private static double calcularDistancia () {
		
		int x, y;
		double d;
		x = (RotatePanel.x_f - RotatePanel.x_0)*(RotatePanel.x_f - RotatePanel.x_0);
		y= (RotatePanel.y_f - RotatePanel.y_0)*(RotatePanel.y_f - RotatePanel.y_0);
		d = Math.sqrt((double)x + (double)y);
		return d;
		
	}
	
}
