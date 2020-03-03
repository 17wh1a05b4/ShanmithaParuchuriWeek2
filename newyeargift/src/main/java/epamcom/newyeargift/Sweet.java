package epamcom.newyeargift;

public class Sweet extends Sweets {
@Override
void setWeight(double weight) {
	//"this" keyword for differentiating variables
	this.weight = weight;
}
double calculateWeight (int numOfSweets) {
	return numOfSweets * weight;
} 
}
