package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	// 필드
	private Circle[] cArray;
	private int crtpos;

	// 생성자
	public void CircleList() {
		cArray = new Circle[3];
		crtpos = 0;
	}
	// 매소드 일반
	public void add(Circle c) {
		cArray[crtpos] = c;
		crtpos += 1;
	}

	public int size() {
		return crtpos;
	}

	public Circle get(int index) {
		return cArray[index];// index 방의 주소 안에있는 point 주소
	}
	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtpos=" + crtpos + "]";
	}

	// 일반메소드

}
