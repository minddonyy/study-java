import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class j1118_1 extends JFrame implements ActionListener{
	JTextField jtf1;
	JButton jbt1;
	JTextArea jta1;
	JPanel jp1,jp2,jp3;
	FlowLayout fl=new FlowLayout();
	Container cp;
	
	j1118_1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp1=new JPanel();jp2=new JPanel();
		jp3=new JPanel();
		
		jtf1=new JTextField(20);
		jta1=new JTextArea(7,25);
		jbt1=new JButton("�߰��ϱ�");
		
		jp1.add(jtf1);
		jp2.add(jbt1);
		jp3.add(jta1);
		
		jbt1.addActionListener(this);
		
		cp=getContentPane();
		
		cp.add(jp1,"North");
		cp.add(jp2,"Center");
		cp.add(jp3,"South");
		
		
		this.setSize(400,300);
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1118_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt1){
			String s=jtf1.getText();
			jta1.append(s);
		}
	}

}
