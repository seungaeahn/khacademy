package com.kh.goodExam.game;

public class GameView {
	private String StartMsg1 = "숫자 맞추기 게임을 시작합니다.";
	private String StartMsg2 = "1에서 100 사이의 숫자를 맞춰보세요!";
	public void displayMessage() {
		System.out.println(StartMsg1);
		System.out.println(StartMsg2);
	}
	// 숫자를 추측하는 값 입력하고 맞췄는지 틀렸는지 적는거랑 시도 횟수 게임종료 
	//1. 숫자 추측하는 값 입력하기
	private String GuessMsg1 = "추측한 숫자를 입력하세요.";
	private String GuessMsg2 = "숫자를 맞췄습니다.";
	private String GuessMsg3 =  "틀렸습니다. 다시 시도하세요.";
	public void displayGuessPromt() {
		System.out.println(GuessMsg1);
	}
	
	public void displayCorrectGuess() {
		System.out.println(GuessMsg2);
	}
	public void displayInCorrectGuess() {
		System.out.println(GuessMsg3);
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("시도횟수: " + attempts);
	}
	private String GameOverMsg = "게임종료";
	public void displayGameOver() {
		System.out.println(GameOverMsg);
	}
}
