package com.javaex.ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random random = new Random();

		// 랜덤번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			// 중복번호 제거
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		/*
		 * // 오름차순 정렬 for(int i = 0; i < lotto.length; i++) { for(int j = i + 1; j <
		 * lotto.length; j++) { if(lotto[i] > lotto[j]) { int temp = lotto[i]; lotto[i]
		 * = lotto[j]; lotto[j] = temp; } } }
		 */

		// 랜덤번호 출력
		System.out.println("* 로또번호 : " + Arrays.toString(lotto));

		System.out.println("====================================================");

		// 로또번호 중복체크
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			Random rnd = new Random();
			int number = rnd.nextInt(45); // 1~45까지 난수 발생
			set.add(new Integer(number));
		}
		List list = new ArrayList(set);
		Collections.sort(list);

		System.out.println("<<< 로또번호 보여주기 >>>");
		System.out.println(list);

		/*
		 * Set<Integer> iSet = new HashSet<Integer>(); Set lottoSet= new HashSet();
		 * 
		 * int num;
		 * 
		 * while (lottoSet.size()!=6) { num = (int)(Math.random()*45+1);
		 * lottoSet.add(num);
		 * 
		 * }
		 * 
		 * ArrayList<Integer> lottoArr = new ArrayList<Integer>(lottoSet);
		 * Collections.sort(lottoArr); System.out.println("금주의 로또번호: ");
		 * 
		 * for(Object list : lottoArr) System.out.print(list + " ");
		 * 
		 * 
		 * 
		 * }
		 */

		Set<Integer> iSet = new HashSet<Integer>();

		for (int c = 0; c < lotto.length; c++) {
			int no = (int) (Math.random() * 45 + 1);
			iSet.add(no);
		}
		
		int num1 = (int) (Math.random() * 45 + 1);
		int num2 = (int) (Math.random() * 45 + 1);
		int num3 = (int) (Math.random() * 45 + 1);
		int num4 = (int) (Math.random() * 45 + 1);
		int num5 = (int) (Math.random() * 45 + 1);
		int num6 = (int) (Math.random() * 45 + 1);

		iSet.add(num1);
		iSet.add(num2);
		iSet.add(num3);
		iSet.add(num4);
		iSet.add(num5);
		iSet.add(num6);

		for (int num : iSet) {
			System.out.println(num);
		}

	}

}
