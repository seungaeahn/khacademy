package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		//Model = CalculatorModel ��������
		CalculatorModel model = new CalculatorModel();
		//View  = CalculatorView ��������
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);

	}

}
