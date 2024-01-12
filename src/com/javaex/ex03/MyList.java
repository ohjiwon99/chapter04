package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	//필드
	private T[] oArray;
	private int crtpos;
	
	//생성자
	public MyList() {
		 oArray =(T[]) new Object[3] ;
		 crtpos = 0;
		
	}
	
	public void add(T o) {
		oArray[crtpos]=o;
		crtpos+=1;
	}
	
	public int size() {
	
		return crtpos;
	}
	public T get(int index) {

		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtpos=" + crtpos + "]";
	}
		
	
//	


	
	
	
	












}
