
public class Cat
{
	//è������
	private String  name;
	
	//è����ɫ
	private String color;
	
	public  void  showCatInfo()
	{
		//this��ʾ��ǰ���󣬱�ʾ��˭����this�ʹ���˭
		System.out.println(this.name+",��ɫΪ:"+this.color);
	}
	
	public static  void  show()
	{
		System.out.println(this.name+",��ɫΪ:"+this.color);
	}
	
	public static void main(String[] args)
	{
		Cat  c1 = new Cat();
		c1.name="С��";
		c1.color="��ɫ";
		
		c1.showCatInfo();
		System.out.println("-------------------------");
		
		Cat  c2 = new Cat();
		c2.name="���";
		c2.color="��ɫ";
		c2.showCatInfo();
		
		//this�ǲ������ھ�̬������
	
		
	}

}
