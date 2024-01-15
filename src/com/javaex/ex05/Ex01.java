package com.javaex.ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(6);
		Integer i03 = new Integer(9);

		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);

		iSet.add(iSet.size());

		System.out.println(iSet.size());
		System.out.println(iSet.toString());// 내부적으로 개발용으로 확인용 출력값 

		System.out.println("===============================");
		// for while
		// 향상된 for문

		for (Integer num : iSet) { // 방번호가 없어 이것밖에 못씀 -->배열식으로 사용도 가능
			System.out.println(num.toString());
		} // 하나씩 제어하기 위해서는 이 출력값을 사용

		System.out.println("===============================");
		Integer i04 = new Integer(100);
		iSet.add(i04);
		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		
		for(Integer num :iSet) {
			System.out.println(num.toString());
		}

	}
}
