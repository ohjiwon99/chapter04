package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {

		// add(), size(),get(),remove()
		ArrayList<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);

		System.out.println("====================================");

		// 변수도 y값
		System.out.println(p01.getY());

		System.out.println("==================================");

		// 리스트 통해서 y값
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());

		System.out.println("====================================");

		pList.remove(0);
		// 전체출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println("====================================");

		pList.remove(p02);
		// 전체출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		System.out.println(pList.toString());
		
		// pList.sAdd(); 인터페이스랑 섞어쓰기하면 인터페이스의 메소드만 사용가능

		//////////////////////////////////////////////////

		List<Integer> iList = new ArrayList<Integer>();

		Integer i01 = new Integer(3);
		Integer i02 = 6; // 자동박싱

		iList.add(i01);
		iList.add(i02);

		System.out.println(iList.toString());

	}

}
