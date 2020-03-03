package epamcom.newyeargift;

//using interface Chocolates
public class fivestar implements Chocolates{
	double weightOfChoc = 35;
	public double calculateWeight(int numOfChoc) {
		return numOfChoc * weightOfChoc;
	} 
}

