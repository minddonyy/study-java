import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class j1101_3 extends Frame implements KeyListener,WindowListener {
	Panel p;
	TextField tf1,tf2;
	Label l;
	j1101_3(){
		p=new Panel();
		tf1=new TextField(15);
		tf2=new TextField(15);
		l=new Label("-");
		
		p.add(tf1);
		p.add(l);
		p.add(tf2);
		
		tf1.requestFocus();
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		
		this.add(p);
		this.addWindowListener(this);
		this.setSize(500,100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new j1101_3();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			tf2.setText("왼쪽눌림");
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			tf2.setText("오른쪽눌림");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String s=tf1.getText().trim();
		if(s.length()==6){
			tf2.requestFocus();
		}
	}

	
	
	
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
