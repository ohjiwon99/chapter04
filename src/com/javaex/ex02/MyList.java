package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtpos;
	
	//생성자
	public MyList() {
		 oArray =new Object[3] ;
		 crtpos = 0;
		
	}
	
	public void add(Object o) {
		oArray[crtpos]=o;
		crtpos+=1;
	}
	
	public int size() {
	
		return crtpos;
	}
	public Object get(int index) {

		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtpos=" + crtpos + "]";
	}
	
	
	
	












}
