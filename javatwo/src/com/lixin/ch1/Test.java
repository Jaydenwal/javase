package com.lixin.ch1;

import com.lixin.ch0.Stu;

/**
 * һ���ི����.
 * 
 * 2���࣬����͸��࣬�̳�
 * 
 * 1.java�����е��඼���ڰ��¡�
 * 
 * 2.java�����е��඼��ֱ�ӻ��Ӽ̳�Object�ࡣ
 * Object��java�еĶ����࣬Ҳ���������ࡣ
 * 
 * java�����е��඼�Ǽ̳еġ�
 * 
 * ��ʽ�̳�:û��дextends ,ֱ�Ӽ̳�Object
 * ��ʾ�̳�:д��extends ���ֱ࣬�ӵ��̳�   ֻ����һ��ֱ�ӵİְ�
 * 
 * Ϊʲô�̳�?
 * 
 *  �����ظ��������࣬[���ٷ�������������]
 * 
 * @author lenovo
 *
 */

public class Test   
{
	
	
	
	public static void main(String[] args)
	{
		Test  t = new  Test();
		System.out.println(t.hashCode());
		
		Test  t1 = new Test();
		//��������==��equals���ǱȽϵ��ǵ�ַ
		System.out.println(t.equals(t1));//false
		System.out.println(t==t1);
		
		System.out.println("-------------------------");
		//String�Ǹ��������ͣ�����:1.���Բ�new;2.String ���equals �Ƚϵ���ֵ
		String  s1 = new String("123");
		String  s2 = new String("123");
		//String ���equals �Ƚϵ���ֵ
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);
		System.out.println("-------------------------");

		
		StringBuffer  sb1 =  new StringBuffer("123");
		StringBuffer  sb2 =  new StringBuffer("123");
		System.out.println(sb1.equals(sb2));//false
		
		Stu  m1 = new Stu();
		Stu  m2= new Stu();
		System.out.println(m1.equals(m2));//
	}
	

}
