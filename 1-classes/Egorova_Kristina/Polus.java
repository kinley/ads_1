\\Извините, Анвар Маратович, вместо 3 задания, я решила второе, так как с 3-им не разобралась.


public class Polus {
	private double I, R;
    public Polus(double I, double R) {
    	this.I = I;
    	this.R = R;
    	}
    public double voltage(){	//calculate the voltage
		Polus A=this;
		double U=A.I*A.R;
		return U;
        }
   public double power(){      //calculate the power
	    Polus A=this;
	    double W=I*A.voltage();
	    return W;
	    }
   public void parallel_connection(Polus B) {
	    Polus A = this;
	    double R=(A.R * B.R) / (A.R + B.R); 
	    double I= A.I + B.I;
	    System.out.println("Amperage "+ I +", Resistance "+ R);
	    }
   public void series_connection(Polus B) {
	   Polus A = this;
	   double U= A.voltage()+ B.voltage();
	   double R= A.R + B.R;
	   System.out.println("Voltage= "+ U + " resistance= " + R);
   }
}