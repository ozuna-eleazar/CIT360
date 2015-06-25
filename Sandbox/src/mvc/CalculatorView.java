package mvc;
// The view will display to the user. It does not perform any calculations or
// any other work like that.
import java.awt.event.*;

import javax.swing.*;

public class CalculatorView extends JFrame {
	//creates the first block where user can enter a value
	private JTextField firstNumber = new JTextField(10); 
	private JLabel additionLabel = new JLabel("+");
	//creates the second block where user can enter a value
	private JTextField secondNumber = new JTextField(10);
	//creates the button that is labeled with Calculate
	private JButton calculateButton = new JButton("Calculate");
	//creates the block where the solution will be displayed to
	private JTextField calcSolution = new JTextField(10);

	private JTextField thirdNumber = new JTextField(10);
	private JLabel subtractionLabel = new JLabel("-");
	private JTextField fourthNumber = new JTextField(10);
	private JButton subtractionButton = new JButton("Calculate");
	private JTextField subtractionSolution = new JTextField(10);

	private JTextField fifthNumber = new JTextField(10);
	private JLabel multiplicationLabel = new JLabel("*");
	private JTextField sixthNumber = new JTextField(10);
	private JButton multiplicationButton = new JButton("Calculate");
	private JTextField multiplicationSolution = new JTextField(10);

	private JTextField seventhNumber = new JTextField(10);
	private JLabel divisionLabel = new JLabel("/");
	private JTextField eigthNumber = new JTextField(10);
	private JButton divisionButton = new JButton("Calculate");
	private JTextField divisionSolution = new JTextField(10);

	CalculatorView() {
		// This will start to set up the view to display it properly.
		JPanel calcPanel = new JPanel();
		// Will make sure when the user presses the X to close that the application will actually terminate.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Setting the size of the display window
		this.setSize(600, 200);
		// adding the components that were made up above to the panel.
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		System.out.println();

		calcPanel.add(thirdNumber);
		calcPanel.add(subtractionLabel);
		calcPanel.add(fourthNumber);
		calcPanel.add(subtractionButton);
		calcPanel.add(subtractionSolution);
		System.out.println();

		calcPanel.add(fifthNumber);
		calcPanel.add(multiplicationLabel);
		calcPanel.add(sixthNumber);
		calcPanel.add(multiplicationButton);
		calcPanel.add(multiplicationSolution);
		System.out.println();

		calcPanel.add(seventhNumber);
		calcPanel.add(divisionLabel);
		calcPanel.add(eigthNumber);
		calcPanel.add(divisionButton);
		calcPanel.add(divisionSolution);
		System.out.println();
		
		//adding calcPanel to the JFrame.
		this.add(calcPanel);

	}
	// Getting access to the First Number
	public int getFirstNumber() {

		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber() {

		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalcSolution() {

		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution) {

		calcSolution.setText(Integer.toString(solution));
	}

	void addCalculateListener(ActionListener listenForCalcButton) {

		calculateButton.addActionListener(listenForCalcButton);
	}

	public int getThirdNumber() {

		return Integer.parseInt(thirdNumber.getText());
	}

	public int getFourthNumber() {

		return Integer.parseInt(fourthNumber.getText());
	}

	public int getSubtractionSolution() {

		return Integer.parseInt(subtractionSolution.getText());
	}

	public void setSubtractionSolution(int solution) {

		subtractionSolution.setText(Integer.toString(solution));
	}

	void subtractCalculateListener(ActionListener listenForCalcButton) {

		subtractionButton.addActionListener(listenForCalcButton);
	}

	public int getFifthNumber() {

		return Integer.parseInt(fifthNumber.getText());
	}

	public int getSixthNumber() {

		return Integer.parseInt(sixthNumber.getText());
	}

	public int getMultiplicationSolution() {

		return Integer.parseInt(multiplicationSolution.getText());
	}

	public void setMultiplicationSolution(int solution) {

		multiplicationSolution.setText(Integer.toString(solution));
	}

	void multiplicationCalculateListener(ActionListener listenForCalcButton) {

		multiplicationButton.addActionListener(listenForCalcButton);
	}

	public float getSeventhNumber() {

		return Float.parseFloat(seventhNumber.getText());
	}

	public float getEigthNumber() {
		
		return Float.parseFloat(eigthNumber.getText());
	}

	public float getDivisionSolution() {

		return Float.parseFloat(divisionSolution.getText());
	}

	public void setDivisionSolution(float solution) {

		divisionSolution.setText(Float.toString(solution));
	}

	void divisionCalculateListener(ActionListener listenForCalcButton) {

		divisionButton.addActionListener(listenForCalcButton);
	}

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
