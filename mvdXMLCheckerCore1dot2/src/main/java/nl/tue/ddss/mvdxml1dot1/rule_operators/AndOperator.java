package nl.tue.ddss.mvdxml1dot1.rule_operators;


public class AndOperator {
	// fields
	private Boolean leftOperand;
	private Boolean rightOperand;
		
	// constructors
	public AndOperator() {	
	}
	
	public AndOperator(Boolean leftOperand, Boolean rightOperand){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	// methods
	public Boolean getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Boolean leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Boolean getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Boolean rightOperand) {
		this.rightOperand = rightOperand;
	}
	
	public Boolean getResult() {
		return leftOperand && rightOperand;
	}
}