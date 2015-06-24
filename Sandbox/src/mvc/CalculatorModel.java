package mvc;

import javax.swing.JOptionPane;

public class CalculatorModel {

	private int calculationValue;

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

	private int divisionValue;

	public void divideTwoNumbers(int seventhNumber, int eigthNumber) {

		if (eigthNumber == 0) {
			JOptionPane.showMessageDialog(null, "Can't divide by 0!");
		} else {
			divisionValue = seventhNumber / eigthNumber;
		}
	}

	public int getDivisionValue() {

		return divisionValue;
	}

}
