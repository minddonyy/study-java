import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
public class j1118_2 extends JFrame{
	String columnNames[]={"번호","이름","가격","설명"};
	
	Object rowData[][]={{1,"aa",100,"aaa"},
			{2,"BB",100,"BBB"},
			{3,"CC",100,"CCC"}};
	JTable jtable;
	JScrollPane jsp;
	DefaultTableModel tablemodel;
	
	j1118_2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		
		tablemodel=new DefaultTableModel(rowData,columnNames);
		jtable = new JTable(tablemodel);
		jsp=new JScrollPane(jtable);
		cp.add(jsp);
		//추가하기
				Object [] temp={4,"하리보",200,"맛있음"};
				tablemodel.addRow(temp);
				
		
		System.out.println(tablemodel.getRowCount());
		System.out.println(tablemodel.getColumnCount());
		System.out.println(tablemodel.getColumnName(0));
		System.out.println(tablemodel.getValueAt(2,2));
		tablemodel.setValueAt(23456, 1, 3);
				
		this.setSize(400,300);
		this.setVisible(true);
		
	}
	
	
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j1118_2();

	}

}
