/**
 * 1.��Person�����Լ������Լ� 2.������һ����Managerȥ ����Person���е�����
 * 
 * 
 * @author lenovo
 * 
 */
public class Manager
{

	public static void main(String[] args)
	{
		// ��Manager����ȥ����Person���е�����

		Person p2 = new Person();
		p2.setAge(630);
		p2.setName("����");

		System.out.println("����Ϊ:" + p2.getName() + ",����Ϊ:" + p2.getAge());

		// ���ⲿ��ֱ�ӷ���һ�����ʵ��������ȱ����ȫ��
		// p2.name="����÷";
		// ֱ�Ӹ���������ֵ�����ݰ�ȫ��? ����ȫ.
		// ��ô���ܰ�ȫ???�� ͨ�������Ե�˽��[private]�����ã�����
		// ��������ݵķ��ʰ�ȫ�ԣ����ܹ�ֱ��ȥ���ʣ�ֱ������ֵ��
		//p2.age=600;

		// 2.������Ҫȥ����˽�е����ԣ���ô����?��ô��߰�ȫ��

	//	System.out.println("����Ϊ:"+p2.name+",����Ϊ:"+p2.age);

		// ��̬����cityName��Person��
		Person.cityName = "������";
	}

}
