package com.javaex.ex03;

public class Circle {
	//필드
	private int redius;
	
	//생성자
	public Circle() {
		
	}
	
	

    public Circle(int redius) {
		this.redius = redius;
	}



	//메소드
	public int getRedius() {
		return redius;
	}


	public void setRedius(int redius) {
		this.redius = redius;
	}


	//일반메소드
	public String toString() {
		return "Circle [redius=" + redius + "]";
	}
	
	

}
