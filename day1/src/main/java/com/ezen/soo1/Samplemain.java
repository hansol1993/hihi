package com.ezen.soo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Samplemain {

	public static void main(String[] args) {

//		Sample sam = new Sample();
//		sam.setFirst(33);
//		sam.setSecond(56);
//		sam.out();
//xml�����	
		//xml������ �����ϴ� ��ȣ classpath
//		String path="classpath:SamApp.xml";
//		AbstractApplicationContext aac=
//				new GenericXmlApplicationContext(path); //��ο����� bean�� �����Ͷ�
//		Sample ss=aac.getBean("sam",Sample.class);
//		ss.out();
			
//�ڹ�Ŭ�����̿���		
AnnotationConfigApplicationContext acac
=new AnnotationConfigApplicationContext(SampleConfig.class);
	Sample ss= acac.getBean("koko",Sample.class);
	ss.out();
	}

}
