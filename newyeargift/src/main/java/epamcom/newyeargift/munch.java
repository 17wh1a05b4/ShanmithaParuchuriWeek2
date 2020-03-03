package epamcom.newyeargift;

//using interface Chocolates
public class munch implements Chocolates{
	double weightOfChoc = 20;
	public double calculateWeight(int numOfChoc) {
		return numOfChoc * weightOfChoc;
	} 
}

