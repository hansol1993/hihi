package com.ezen.soo1;

public class New {

	String name,phone;
	int age;
	public New() {	}
	public New(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public void out() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("��ȭ��ȣ : "+phone);
		
	}
	
}
