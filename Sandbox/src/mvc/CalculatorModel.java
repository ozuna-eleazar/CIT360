package mvc;

import javax.swing.JOptionPane;
// This model contains the data which is calculationValue and also provides access to the data. 
public class CalculatorModel {

	private int calculationValue;
	//Methods needed to perform the calculations of addition, subtraction, multiplication, and division.
	public void addTwoNumbers(int firstNumber, int secondNumber) {

		calculationValue = firstNumber + secondNumber;

	}

	public int getCalculationValue() {

		return calculationValue;
	}

	private int subtractionValue;

	public void subtractTwoNumbers(int thirdNumber, int fourthNumber) {

		subtractionValue = thirdNumber - fourthNumber;
	}

	public int getSubtractionValue() {

		return subtractionValue;
	}

	private int multiplicationValue;

	public void multiplyTwoNumbers(int fifthNumber, int sixthNumber) {

		multiplicationValue = fifthNumber * sixthNumber;
	}

	public int getMultiplicationValue() {

		return multiplicationValue;
	}

	private float divisionValue;

	public void divideTwoNumbers(float seventhNumber, float eigthNumber) {
		
		divisionValue = seventhNumber / eigthNumber;

	}

	public float getDivisionValue() {

		return divisionValue;
	}

}
