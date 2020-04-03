import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateListener implements ActionListener {
	
	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculateListener(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber = 0;

	try {
		firstNumber = theView.getFirstNumber();
		secondNumber = theView.getSecondNumber();
		
		theModel.addTwoNumbers(firstNumber, secondNumber);
		
		theView.setCalcSolution(theModel.getCalculationValue());
		
	} catch (NumberFormatException ex) {
		theView.displayErrorMessage("ntr");
			}
		}
	
}