
//����Ա����
public class EmpOne
{  
	
	//Ա������ ��ʽ �������� ȫ��
	//ʵ��������ʵ����������ܷ��ʵı���
	String  name;
	
	boolean  flag;
	
	double  money;
	
	//��Щ��������ɾ�̬��������Щ���������ʵ������
	//��̬����
	//�����ж��ٸ�ְ��
	static  int  count;
	
	//��λ����
	static String  dname;
	
	//����(�ؼ���  void��û�з���ֵ;��������  �з���ֵ)
	  void  empEat()
	{
		name="�����";
	}
	//main�����Ǹ�����ķ�����static�ؼ��֣���̬���η���

	public static void main(String[] args)
	{
		//static�����ǲ��ܹ�ֱ��ʹ�����ȫ��ʵ������
		// name="����Т";
		System.out.println("1-->"+count);
		
		//��main�����У���ʵ�������ķ��ʣ��������ȴ�������
		
		 //ʵ��������
		 EmpOne  o1 = new EmpOne();
		//String��Ĭ��ֵ��:null
		System.out.println(o1.name+","+o1.flag);
		
		o1.name="����÷";
		o1.money=20.008;
		o1.dname="��˹��";
		
		count++;
		
		
		EmpOne  d1 = new EmpOne();
		//String��Ĭ��ֵ��:null
		System.out.println(d1.name+","+o1.flag);
		d1.name="Ԭ����";
		d1.money=5000.99;

		
		count++;
		
		System.out.println("����Ա����������:"+count);
		
		o1.dname="���Ӱ�˹��";
		System.out.println(o1.name+"-->"+o1.dname);
		System.out.println(d1.name+"-->"+d1.dname);
		
		
	}
	
	
	

}
