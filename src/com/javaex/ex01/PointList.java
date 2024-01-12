package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드

	private Point[] pArray;
	private int crtpos;

	// 생성자
	public PointList() {
		//원래 만들지 않으나 편의상 가정
		pArray = new Point[3]; 
		crtpos = 0;
	}

	// 메소드
	
	
	
	// 일반메소드
	public void add(Point p) {
		//현재배열개수+1 배열을 새로 만든다.
		//이전배열의 값을 새배열에 옮긴다.
		//마지막방에 새주고를 추가한다.
		
		pArray[crtpos]=p;
		crtpos+=1;
		
	}

	public int size() {
		return crtpos;
	}
	
	public Point get(int index) {
		return pArray[index];//index 방의 주소 안에있는 point 주소
	}

	//일반메소드
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtpos=" + crtpos + "]";
	}
	
	
}
