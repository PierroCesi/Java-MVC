import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("calculate");
	private JTextField calcSolution = new JTextField(10);

	public CalculatorView(){
		
		JPanel calcPanel = new JPanel();
		this.setSize(600,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);		
		calcPanel.add(secondNumber);		
		calcPanel.add(calculateButton);		
		calcPanel.add(calcSolution);		
		this.setVisible(true);
		this.add(calcPanel);
	}

	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolutionNumber() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	/*-----------------------------------------------*/
	
	public void addCalculatorListener(ActionListener listenForCalcButton) {
		// TODO Auto-generated method stub
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
