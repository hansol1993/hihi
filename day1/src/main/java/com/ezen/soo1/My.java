package com.ezen.soo1;
// DTO
public class My {
	String name;
	int age;
	String phone;
	public My() {}
	public My(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void out() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("��ȭ��ȣ : "+phone);
	}
	
}
