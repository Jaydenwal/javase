
//һ�������������

public class User
{

	static
	{
		System.out.println("��̬�����");
	}
	
	User()
	{
		System.out.println("���캯��");
	}
	public  void  show()
	{
		System.out.println("����ʵ������show()");
	}
	public  static  void  check()
	{
		System.out.println("���Ǿ�̬����check()");
	}
	
	{
		System.out.println("��������2--------");
	}
	{
		System.out.println("��������1***");
	}
	//��ں���
	public static void main(String[] args)
	{
		//main��������ڣ�����˳��ִ��
		
		//����һ������  1.����������ִ�У����캯����ִ�С�
		//2.������������Ŷ���Ĵ�������ִ�С�
		//User  u = new User();
		//System.out.println("------------------------");
		//User  u1 = new User();
		
		
		//��̬����������ִ��,����ִֻ��һ�Ρ�
		User  u = new User();
		User  u1 = new User();
		
	}
	
	

}
