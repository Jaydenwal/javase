package com.lixin.ch3;

//java�еļ̳�ֻ��ֱ�Ӽ̳�һ���ְ֣����Լ�Ӽ̳ж���ְ�
public class Son extends Base
{
	static
	{
		System.out.println("-------------����ľ�̬��");
	}

	Son()
	{
		//super();//��ʽ���и�super()
		this("100"); //this()��super()�������ڵ�һ��
		
		System.out.println("���๹�캯��");
	  
	}
	Son(int a)
	{
		super(a);
	}
	Son(String s)
	{
	    super(10);
	}
	{
		System.out.println("-------------����Ĺ����");
	}

	public static void main(String[] args)
	{
		//ֱ��new ����
		//Base  b = new Base();
		
		//ֱ��new ����  ����Ĺ���һ����������Ĺ���
		Son   s   = new Son();
		
		//����Ĺ���һ����������Ĺ���
		//super(�����б�) ���ʸ��� �ṩ�Ĺ��캯�� �����ڵ�һ��
		//this(�����б�) ���ʱ���Ĺ��캯��

	}

}
