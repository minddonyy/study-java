import java.awt.*;
import java.awt.event.*;
public class j0920_1 extends Frame implements ActionListener {
	Button b1,b2;
	Panel p;
	j0920_1(){
		b1=new Button("버튼");
		b2=new Button("종료");
		p=new Panel();
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		this.add(p);
		//this.pack();//크기에 맞춰놓는것
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0920_1();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
		System.out.println("버튼이 눌러졌습니다");
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
		}else if(e.getSource()==b2){
			System.out.println("종료합니다");
			System.exit(0);
		}
	}
	

}
