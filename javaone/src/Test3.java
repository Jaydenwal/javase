/**
 * Java��������������ص���������:
 * 1.��װ
 * 2.�̳�  ����͸���
 * 3.��̬  ���ֱ�����ʽ�����ľ��������2��:
 *   3.1 ��������  ���������Ƿ�����һ������ı���
 *   3.2 ������д����������
 *   
 *   
 *   ���أ���һ�����У���ͬ�ķ���������ͬ��ʵ�ֽ����Ҳ���Ǳ��ֽ����
 *        �������:���캯�����غͷ�������
 *        
 *        
 *        ���������ĸ����صķ���������˭������?
 *        ���ɲ����б������1.���� 2.����  ��ͬ
 *        
 *        �뷵��ֵ�����޹�
 *        
 *        ��̬����Ҳ�Ƿ�������
 *        
 *        ���������ؽ���������ʱ��̬
 *   
 * 4.����
 * 
 *
 * 
 * 
 * 
 * 
 * @author lenovo
 *
 */
public class Test3
{
           
	public  String  add(int a,String b)
	{
		return a+b;
	}
	public  int  add(int a,int  b)
	{
		return a+b;
	}
	public  void  add(int a,double  b)
	{
		System.out.println(a+b);
	}
	
	public  static  int  change()
	{
		return  10;
	}
	public static void  change(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Test3  t =  new Test3();
		int c=t.add(10,20);
		System.out.println(c);
		System.out.println("------------");
		t.add(10,"20");
		
		t.add(20,20.0);
		
		Test3.change();
		Test3.change(10);
	}
}
