public class StuOne
{
	// ѧ������
	String name;

	// ѧ������
	byte age;

	// ѧУ����
	static String schoolName;

	// ѧ������
	static int stuCount;

	public static void main(String[] args)
	{
		//��̬��������ֱ��ʹ�þ�̬����
		schoolName="�Ͼ��Ƽ�ְҵѧԺ";
		
		//Ҫ����������ʵ������������Ҫ����������ʵ������
		StuOne  one  = new StuOne();
		one.name="������";
		one.age=20;
		System.out.println(one.schoolName);
		
		StuOne  two  = new StuOne();
		two.name="�ⱦ��";
		two.age=19;
		System.out.println(two.schoolName);
		
		one.schoolName="�Ͼ��Ƽ���ѧ";
		System.out.println(two.schoolName);
		
		
		

	}

}
