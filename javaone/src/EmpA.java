
public class EmpA
{
	
	double  salary=1000;
	
	String  name;
	
	String  show()
	{
		String name="123";
		
		return name;
		
	}
	String  show1()
	{
		String name="123";
		return this.name;
	}
	public static void main(String[] args)
	{
		EmpA a1 = new EmpA();
		System.out.println(a1.salary+","+a1.name);
		EmpA a2 = new EmpA();
		System.out.println(a2.salary+","+a2.name);
		//�ֲ���������Ҫ���ʵ�ֵ,����Ҫ���ʷ���
		String  str1=a1.show();
		System.out.println(str1);
		a1.name="Ԭ����";
		String  str2=a1.show1();
		System.out.println(str2);
		System.out.println("-----------------");
		String  str3=a2.show1();
		System.out.println(str3);
	}

}
