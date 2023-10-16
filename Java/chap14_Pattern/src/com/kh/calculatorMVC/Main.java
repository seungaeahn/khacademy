package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		//Model = CalculatorModel 가져오기
		CalculatorModel model = new CalculatorModel();
		//View  = CalculatorView 가져오기
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);

	}

}
