import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;


public class UserFrame  extends JFrame
{
	
	Panel  panel  = new Panel();

	UserFrame()
	{
		this.setTitle("�Ͼ��Ƽ�ְҵѧԺ");
		
		panel.setBackground(Color.BLACK);
		this.add(panel);
		this.setSize(300, 400);
		this.setVisible(true);
		
	}
	UserFrame(int  width ,int  height, int x,int y)
	{
       this.setTitle("�Ͼ���ѧ");
		
		panel.setBackground(Color.GREEN);
		this.add(panel);
		this.setSize(width, height);
		this.setLocation(x, y);
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		
	    UserFrame  u1  =new UserFrame();
		
		UserFrame  u2  =new UserFrame(1200,800,600,500);
	}
	
}
