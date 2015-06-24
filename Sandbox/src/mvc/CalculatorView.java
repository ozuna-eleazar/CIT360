package mvc;

import java.awt.event.*;

import javax.swing.*;

public class CalculatorView extends JFrame {

	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
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

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

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

		this.add(calcPanel);

	}

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

	public int getSeventhNumber() {

		return Integer.parseInt(seventhNumber.getText());
	}

	public int getEigthNumber() {

		return Integer.parseInt(eigthNumber.getText());
	}

	public int getDivisionSolution() {

		return Integer.parseInt(divisionSolution.getText());
	}

	public void setDivisionSolution(int solution) {

		divisionSolution.setText(Integer.toString(solution));
	}

	void divisionCalculateListener(ActionListener listenForCalcButton) {

		divisionButton.addActionListener(listenForCalcButton);
	}

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
