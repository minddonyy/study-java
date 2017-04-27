import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class j0923_1 extends Frame implements ActionListener {
	Button b1,b2;
	Panel p1,p2;
	j0923_1(){
		setLayout(new BorderLayout());
		b1=new Button("Red");
		b2=new Button("Blue");
		
		p1=new Panel();
		p2=new Panel();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p1.add(b1);
		p1.add(b2);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		
		this.setSize(500,400);
		this.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new j0923_1();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			System.out.println("버튼이 눌러졌습니다");
			p2.setBackground(Color.red);
		}
		else if(e.getSource()==b2){
			p2.setBackground(Color.blue);
		}
		
	}

}
