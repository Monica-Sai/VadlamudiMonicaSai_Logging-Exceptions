package epam.Log_HomeTask5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Interest_Calculator {
	private static final Logger LOGGER = LogManager . getLogger(Interest_Calculator. class);
	public double SimpleInterest(double p,int t,double r) {
		
		double amnt=p*t*r/100;
		LOGGER . debug("Simple_Interest"+ amnt);
		return amnt;
	}
	public double CompoundInterest(double p,int t,double r) {
		double amnt=p*Math.pow(1+(r/100), t);
		LOGGER . debug("Compound_Interest"+ amnt);
		return amnt;
	}
}
