package com.lixin.ch0;

import java.lang.reflect.Method;
import java.util.Date;

import com.lixin.util.SendMail;


//lang���µ�ֱ�ӵ��࣬��Ϊ���Ƚ��ã����Բ�Ҫ���룬���Զ�����
//java�����е��඼�ڰ��£��϶��ġ�

//ͬ���µ��಻��Ҫ���룬��ͬ��������Ҫ�������ʹ��

//1.����java���е��඼���뽨������
//2.��������ȫ������Сд��
//3.���� ����Ҫ��:com.�������.������

public class Test
{
	
	public static void main(String[] args)
	{
		String s="123";
	    //ctrl+shirft+o
		Method  m = null;
		
		Stu s1  =new Stu();
		
		SendMail  sm = new SendMail();
		
		Date  d = new Date();
	}

}
