package com.ezen.kkk4;

import java.util.ArrayList;

public interface Service {
	
	 //������ �߰��ϴ� ���
		//controller���� ������ �Ѱܹ���
			//�޾ƿ��鼭 dao.xml�� �Ѱ���
	public void inserta(String name,int age,String tell);
	
	//������ȣ�� doa.xml���� ���� �޾ƿ�
	public ArrayList<MyDTO> out();
	
	
}
