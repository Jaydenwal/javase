
public class Dog
{
	//������ɫ
	String  colorName;
	
	//��ϲ���Թ�ͷ ,���еĹ���ϲ���Թ�ͷ���������óɾ�̬
	//��̬����Ҳ�����෽��
	public static  void  eat()
	{
		System.out.println("��ϲ���Թ�ͷ");
	}
	
	//ʵ��������ʵ������һ������
	public void  setColorName(String colorName)
	{
	    //ÿ��������ɫ��ÿ��������һ��
		this.colorName=colorName;
	}
	
	public  String  getColorName()
	{
		return  this.colorName;
	}
	
	

}
