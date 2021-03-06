package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

		this.theView = theView;
		this.theModel = theModel;

		this.theView.addCalculateListener(new CalculateListener());
		this.theView.subtractCalculateListener(new SubtractionListener());
		this.theView.multiplicationCalculateListener(new MultiplicationListener());
		this.theView.divisionCalculateListener(new DivisionListener());
	}

	class CalculateListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			// In case the user does not fill both blocks the try block will stop and errors
			// from being triggered.
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setCalcSolution(theModel.getCalculationValue());
			}
			// catches the error that will be triggered if users don't enter values into both blocks.
			catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

	class SubtractionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int thirdNumber, fourthNumber = 0;

			try {
				thirdNumber = theView.getThirdNumber();
				fourthNumber = theView.getFourthNumber();

				theModel.subtractTwoNumbers(thirdNumber, fourthNumber);

				theView.setSubtractionSolution(theModel.getSubtractionValue());
			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

	class MultiplicationListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int fifthNumber, sixthNumber = 0;

			try {
				fifthNumber = theView.getFifthNumber();
				sixthNumber = theView.getSixthNumber();

				theModel.multiplyTwoNumbers(fifthNumber, sixthNumber);

				theView.setMultiplicationSolution(theModel
						.getMultiplicationValue());
			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

	class DivisionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			float seventhNumber;
			float eigthNumber = 0;

			try {
				 seventhNumber = theView.getSeventhNumber();
				 eigthNumber = theView.getEigthNumber();

				theModel.divideTwoNumbers(seventhNumber, eigthNumber);

				theView.setDivisionSolution(theModel.getDivisionValue());
			}
			// Handles the exception if a user tries to divide a number by zero.
			catch (ArithmeticException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("Can't Divide by Zero!");

			}

		}

	}

}
