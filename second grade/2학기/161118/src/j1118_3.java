import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class j1118_3 extends JFrame implements ActionListener{

		
		JTable jtable;
		JScrollPane jsp;
		DefaultTableModel tablemodel;
		JPanel jp1,jp2;
		FlowLayout fl=new FlowLayout();
		JLabel j1,j2,j3;
		JTextField jtf1,jtf2,jtf3;
		JButton jbt1,jbt2;
		
		
	
		j1118_3(){
			tablemodel=new DefaultTableModel();
			tablemodel.setColumnIdentifiers(new String[]{"이름","나이","핸드폰"});
			//tablemodel.setColumnIdentifiers(new String[]{"이름","나이","핸드폰"});
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container cp=getContentPane();
		
		
			jtable = new JTable(tablemodel);
			jsp=new JScrollPane(jtable);
			
			j1=new JLabel("이름");
			j2=new JLabel("나이");
			j3=new JLabel("핸드폰");
			
			
			jtf1=new JTextField(10);
			jtf2=new JTextField(10);
			jtf3=new JTextField(10);
			
			jbt1=new JButton("추가");
			jbt2=new JButton("삭제");
			
			jbt1.addActionListener(this);
			
			
		
			
			jp1=new JPanel();
			jp2=new JPanel();
			
			jp1.add(jsp);
			
			jp2.add(j1);
			jp2.add(jtf1);
			
			jp2.add(j2);
		
			jp2.add(jtf2);		jp2.add(j3);
			jp2.add(jtf3);
			
			jp2.add(jbt1);
			jp2.add(jbt2);
		
			cp.add(jp1,"North");
			cp.add(jp2,"South");
			
		
							
		
		
			this.setSize(700,700);
			this.setVisible(true);
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1118_3();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt1){
		
		tablemodel.addRow(new String[]{jtf1.getText(),jtf2.getText(),jtf3.getText()});
		
		}
		if(e.getSource()==jbt2){
			tablemodel.removeRow(jtable.getSelectedRow());
		}
	}




}
