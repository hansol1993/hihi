package com.ezen.soo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//�Ϲ� Ŭ���� �����Ͱ� ���� ������ִ� Ʋ���־����
//�ʵ�+�޼ҵ尡 �־���� 
//SampleŬ������ Ʋ�� ����
@Configuration 
public class SampleConfig {
	@Bean 
	//��ü�� ������ �żҵ�
	public Sample koko() { //Sample ��ȯ�Ǵ� ��ü�� ss�� ��ȯ��ü���� Sample
		//koko�� �θ��� ��ü�� ��������
		Sample ss = new Sample();
		ss.setFirst(44);
		ss.setSecond(56);
		return ss;
	}

}
