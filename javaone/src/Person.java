//������������1.��װ
//1.��װ  �����е�����˽�е�����private���������ܹ�ֱ�ӷ������е�
//˽�еı�����������ݷ��ʵİ�ȫ�ԣ���ô��
//���ܷ������е�˽�е�������?
//�����е�˽�е����Խ��з���������(set/get|������������ĸ��д)
//ͨ�����������ж����ݵķ��ʣ�ͨ���������Ƕ������ߣ����ݽ��а�ȫ���ơ�
public class Person
{

	// ���� ʵ������ �Ǿ�̬����
	private  String name;

	// ���� ʵ������ �Ǿ�̬����
	 private int age;

	// �������� �����������ĸ�����ģ������������ж����һ������
	// ��������Person���
	// ��̬���� �����
	static String cityName;

	// ��java����ͨ��set��get�������������ݷ��ʣ�
	// ������ݷ��ʵİ�ȫ��,
	// �����ķ������η�������Ϊpublic ���� ��
	// ����ֵ
	public void setAge(int age)
	{
		if (age > 0 && age <= 450)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			this.age = age;
		}
		else
		{
			System.out.println("�Բ���������䲻�Ϸ�");
		}

	}

	// ��ȡֵ
	public int getAge()
	{
		if (this.age > 0 && this.age <= 450)
		{
			// this��ʾ���ǵ�ǰ����,˭�������������this����˭
			return this.age;
		}
		else
		{
			return 0;

		}
	}

	public void setName(String name)
	{

		this.name = name;
	}

	public String getName()
	{

		return this.name;
	}

	// //��ں���
	// public static void main(String[] args)
	// {
	// //��ʵ�������ķ��ʣ����Ƿ���ֵ��������ֵ
	// //�������ȴ��������Ķ���
	// //Person��������������ģ��
	// Person p1 = new Person();
	// System.out.println(p1.name+","+p1.age);
	//
	// //��ֵ������ֵ
	// p1.name="Ԭ����";
	// p1.age=18;
	// System.out.println(p1.name+","+p1.age);
	//
	// p1.cityName="�Ͼ���";
	// //��̬����Ҳ����������������ҽ���������.��̬������
	// Person.cityName="ʯͷ��";
	//
	// cityName="������";
	//
	// //ctrl+m ���
	// System.out.println(p1.name+","+p1.age+",������Ϊ:"+p1.cityName);
	//
	// Person p2 = new Person();
	// System.out.println(p2.name+","+p2.age+",������Ϊ:"+p2.cityName);
	//
	// //�������͸�ֵ��ʵ���ǰ��������ĵ�ַ��ֵ
	// p2 = p1;
	// System.out.println(p2.name+","+p2.age+",������Ϊ:"+
	// p2.cityName);
	//
	//
	//
	// }

}
