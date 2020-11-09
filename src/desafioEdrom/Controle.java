package desafioEdrom;

public class Controle {
	
	public double U[] = {0, 0, 0};
	public double E[] = {0, 0, 0};
	private final int K = 2;
	private double alpha, beta, gama;	 // parametros do controlador PID trapezoidal
	
	public Controle(double k_p, double k_d, double k_i) {		
		alpha = k_p + (k_d/25.0) + ((k_i*25.0)/2.0);
		beta = -k_p - ((2.0*k_d)/25.0) + ((k_i*25.0)/2.0);
		gama = (k_d/25.0);
	}
	
	public double inputLinear(double velMax, double velAtual) {
		
		 E[K] = velMax - velAtual;
		 
		 // variar parametros do controlador PID trapezoidal
		 U[K] = U[K-1] + alpha*E[K] + beta*E[K-1] + gama*E[K-2];
		 System.out.println("U[K] = " + U[K]);
		 
		 // variar parametros do controlador Z-N		
		 // U[K] = 1.41*U[K-1] - 0.4096*U[K-2] + 0.0245*E[K] + 0.005237*E[K-1] - 0.01926*E[K-2];
		 
		 // U[K-2] = U[K-1];	// comentar caso for aplicado o controlador PID trapezoidal
         U[K-1] = U[K];
  
         E[K-2] = E[K-1];
         E[K-1] = E[K];
		 
		 if( U[K] >= 0){
	          
	            if(U[K] < velMax) { 
	            	return U[K];
	            } else {
	            	return velMax;
	            }
	            
	     } else {
	          return 0;
	     }
		 
	}
	
	

}
