public class EmpTwo
{
	// Ա������
	String name;

	// Ա������
	double salary;

	// ������ͨ����������ҵ���ʵ��
	//ʵ�ּ�н
	void addSalary()
	{
		// ���ӵ�Ǯ�� �ֲ�����,������ֻ�������������
		double addsal = 100;

		// �ֲ���������ʱ�����û�и�ֵ�����ᱨ��
		// ��ʹ�þֲ��������ֲ�����һ��Ҫ��ֵ��
		salary = salary + addsal;

		System.out.println("���Ա������" + name + ",����" + addsal + ",���ڵĹ�����:"
				+ salary);

	}

	// void show()
	// {
	// addsal=100;
	// salary=100;
	//
	// }

	// ��ڷ���
	public static void main(String[] args)
	{
		EmpTwo  s1 = new EmpTwo();
		s1.name="Ԭ����";
		s1.salary=1000;
		
		//s1���ְ���������Ԭ�����н
		s1.addSalary();
		
		EmpTwo  s2 = new EmpTwo();
		s2.name="����÷";
		s2.salary=500;
		
		System.out.println(s2.name+",����Ϊ:"+s2.salary);
		s2.addSalary();
	}

}
