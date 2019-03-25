
public class intrestcalculation {
	public int calculateCompoundInterest(int Principle,int ratio,int time,int n) 
	{
		double compoundInterest=0;
		compoundInterest=Principle*Math.pow((1+(ratio/time)),n*time);
		return (int)compoundInterest;
	}
	public int calculateSimpleInterest(int principle, int rate, int time) 
	{
		float simpleInterest = (principle * rate * time) / 100;
		return (int)simpleInterest;
	}

}
