package prj.entity;

import java.awt.Graphics;

public class MyCard {

	private int width;
	private int height;
	
	private MyCardListener myCardListener;
	
	public MyCard() {
	}
	
	public MyCard(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void paint(Graphics g) {
		
	}
	
	// MyCard의 보석 개수를 업데이트하는 메서드가 필요할 것 같아서 추가
	public void update() {
		
		// 보석 개수를 업뎃하면서 미션카드와 보석 개수가 일치하면 onWin 실행하기
		myCardListener.onWin();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// [인터페이스] 꽂아넣기 위한 setters 메서드
	public void setMyCardListener(MyCardListener myCardListener) {
		this.myCardListener = myCardListener;
	}
	
	
	
	
}