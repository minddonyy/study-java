import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class j1101_5 extends JFrame implements ActionListener{
	JButton jbt1,jbt2,jbt3,jbt4;
	Container cp;
	GridLayout gl;
	
	j1101_5(){
		gl=new GridLayout(4,1);
		cp=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jbt1=new JButton("위치와 크기 정보");
		
		jbt2=new JButton("모양정보");

		jbt3=new JButton("작동하지 않는 버튼");
		
		jbt4=new JButton("숨기기/보이기");
		
		jbt2.setBackground(Color.YELLOW);
		jbt2.setForeground(Color.MAGENTA);
		jbt2.setFont(new Font("고딕체",Font.ITALIC,30));
		
		jbt3.setEnabled(false);
		
		jbt1.addActionListener(this);
		
		cp.add(jbt1);	cp.add(jbt2);	cp.add(jbt3);	cp.add(jbt4);
		
		
		this.setLayout(gl);
		this.setSize(500, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1101_5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt1){
			int x=jbt1.getX();
			int y=jbt1.getY();
			
			System.out.println(x+","+y);
			
			int w=jbt1.getWidth();
			int h=jbt1.getHeight();
				
			System.out.println(w+","+h);
			
			
		}
	}

}
