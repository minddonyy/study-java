import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class j1025_3 extends JFrame implements ActionListener{
	JButton jbt1,jbt2,jbt3;
	Container cp=getContentPane();
	j1025_3(){
		setTitle("Jframe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		cp.setBackground(Color.orange);
		cp.setLayout(new FlowLayout());
		
		jbt1=new JButton("OK");
		jbt2=new JButton("CLOSE");
		jbt3=new JButton("IGNOER");
		cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);
		
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1025_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt1){
			cp.setBackground(Color.RED);
		}
		if(e.getSource()==jbt2){
			cp.setBackground(Color.BLUE);
		}
		if(e.getSource()==jbt3){
			cp.setBackground(Color.YELLOW);
		}
	}

}
