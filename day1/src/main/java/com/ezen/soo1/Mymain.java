package com.ezen.soo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//��ΰ�����ͼ� ����ϴ� ����
public class Mymain {

	public static void main(String[] args) {
		
//		String path="classpath:MyApp.xml";
//		AbstractApplicationContext aac=
//				new GenericXmlApplicationContext(path); //�̰� �����ؼ� acc��ü�� �����ض�
//		My mm= aac.getBean("my",My.class);
//		mm.out();
		
		AnnotationConfigApplicationContext acac
		=new AnnotationConfigApplicationContext(Myconfig.class);
		 My mm=	acac.getBean("bibi",My.class);
		 mm.out();
		
	}

}
