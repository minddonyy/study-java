import java.awt.*;
public class j0830_6 extends Frame {
	Panel p;
	Label l1,l2,l3;
	j0830_6(){
		p=new Panel();
		l1=new Label("��ħ",Label.LEFT);
		l2=new Label("����",Label.CENTER);
		l3=new Label("����",Label.RIGHT);
		
		l1.setBackground(Color.RED);
		l2.setBackground(Color.RED);
		l3.setBackground(Color.RED);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		
		this.add(p);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_6 j=new j0830_6();

	}

}
