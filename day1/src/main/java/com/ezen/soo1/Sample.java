package com.ezen.soo1;

public class Sample { // Ŭ������ Ʋ�̴� �����Ͱ� ������ ������

	 int first,second;

	public Sample() {} //����Ʈ������

	public Sample(int first, int second) { //��ü�ʱ�ȭ������
		super();
		this.first = first;
		this.second = second;
	}

	public int getFirst() { 
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void out() {
		
		System.out.println(first+"+"+second+"="+(first+second));
		
	}
	 
	 
}
