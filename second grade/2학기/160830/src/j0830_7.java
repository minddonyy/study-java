import java.awt.*;
public class j0830_7 extends Frame {
	TextArea ta1,ta2,ta3,ta4;
	Panel p;
	j0830_7(){
		ta1=new TextArea(50,60);
		ta2=new TextArea("손하영 바보");
		ta3=new TextArea("손하영 멍총이",50,60);
		ta4=new TextArea("유난쌤을 좋아하는 하영이",50,60,3);
		
		p=new Panel();
		p.add(ta1);
		p.add(ta2);
		p.add(ta3);
		p.add(ta4);
		
		this.add(p);
		
		this.setSize(1000, 1000);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j0830_7 j=new j0830_7();

	}

}
