public class CalculatorController {

	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		
		this.theView=theView;
		this.theModel=theModel;
		
		this.theView.addCalculatorListener(new CalculateListener(theView, theModel));
	}

}
