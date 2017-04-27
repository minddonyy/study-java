package work;
import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class new_memojang extends Frame implements ActionListener,WindowListener{
	String st1;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5;
	MenuItem me1,me2,me3,me4,me5,me6,me7;
	MenuItem md1,md2;
	FileDialog fd;
	TextArea ta;
	MenuShortcut ms1,ms2,ms3,ms4,ms5;
	MenuShortcut ms6,ms7,ms8,ms9,ms10,ms11;
	Panel p;

	new_memojang(){
		this.addWindowListener(this);
		mb=new MenuBar();
		p=new Panel();
		ImageIcon img=new ImageIcon("img/memo.jpeg");
		this.setIconImage(img.getImage());
		
		ta=new TextArea(); 
		
		ms1=new MenuShortcut(KeyEvent.VK_N,false);
		ms2=new MenuShortcut(KeyEvent.VK_O,false);
		ms3=new MenuShortcut(KeyEvent.VK_S,false);
		ms4=new MenuShortcut(KeyEvent.VK_A,false);
		ms5=new MenuShortcut(KeyEvent.VK_X,false);
		
		ms6=new MenuShortcut(KeyEvent.VK_Z,false);
		ms7=new MenuShortcut(KeyEvent.VK_X,false);
		ms8=new MenuShortcut(KeyEvent.VK_C,false);
		ms9=new MenuShortcut(KeyEvent.VK_V,false);
		ms10=new MenuShortcut(KeyEvent.VK_DELETE,false);
		ms11=new MenuShortcut(KeyEvent.VK_A,false);
		
		m1=new Menu("파일(F)");
		m2=new Menu("편집(E)");
		m3=new Menu("도움말(H)");
		
		
		mi1=new MenuItem("새로만들기",ms1);
		mi2=new MenuItem("열기",ms2);
		mi3=new MenuItem("저장",ms3);
		mi4=new MenuItem("다른 이름으로 저장",ms4);
		mi5=new MenuItem("끝내기",ms5);
		
		me1=new MenuItem("실행취소",ms6);
		me2=new MenuItem("잘라내기",ms7);
		me3=new MenuItem("복사",ms8);
		me4=new MenuItem("붙여넣기",ms9);
		me5=new MenuItem("삭제",ms10);
		me6=new MenuItem("모두선택",ms11);
		
		md1=new MenuItem("도움말 보기");
		md2=new MenuItem("메모장 정보");
		
		
		
		
		
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.addSeparator(); //경계선
		m1.add(mi5);
		
		m2.add(me1);
		m2.add(me2);
		m2.add(me3);
		m2.add(me4);
		m2.add(me5);
		m2.add(me6);
		
		m3.add(md1);
		m3.add(md2);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		
		
		me1.addActionListener(this);
		me2.addActionListener(this);
		me3.addActionListener(this);
		me4.addActionListener(this);
		me5.addActionListener(this);
		me6.addActionListener(this);
		
		
		setMenuBar(mb);
		
		this.add(p);
		this.add(ta);
		this.setTitle("메모장");
		
		this.setVisible(true);
		this.setSize(700,500);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new new_memojang();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		// TODO Auto-generated method stub
		if(e.getSource()==mi1){
			if(ta.getText()!=null){
				ta.setText("");
			}//end of if
		}//end of if
		try{
		if(e.getSource()==mi2){
			fd=new FileDialog(this,"열기",FileDialog.LOAD);
			fd.setSize(300,200);
			fd.setVisible(true);
			String fname=fd.getDirectory()+fd.getFile();
			FileReader fr=new FileReader("fname");
			BufferedReader bfr=new BufferedReader(fr);
			String s=bfr.readLine();
			ta.append(s+"\n");
			fr.close();
			bfr.close();
		}
			}catch(IOException e2){
				e2.printStackTrace();
			}	

		
		if(e.getSource()==mi3){
			fd=new FileDialog(this,"저장",FileDialog.SAVE);
			fd.setSize(300,200);
			fd.setVisible(true);
			String text=ta.getText();
			String fname=fd.getDirectory()+fd.getFile();
			this.setTitle(fd.getFile()+"메모장");
			if(fd.getFile()==null)
				return;
			try{
				FileWriter fw=new FileWriter(fname);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(text);
				bw.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}//end of catch
		}//end of if
		
		if(e.getSource()==mi4){
			fd=new FileDialog(this,"다른 이름으로 저장",FileDialog.SAVE);
			fd.setSize(300,200);
			fd.setVisible(true);
			String text=ta.getText();
			String fname=fd.getDirectory()+fd.getFile();
			this.setTitle(fd.getFile()+"메모장");
			if(fd.getFile()==null)
				return;
			try{
				FileWriter fw=new FileWriter(fname);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(text);
				bw.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}//end of catch
		}//end of if
		
		if(e.getSource()==mi5){
			System.exit(0);
		}
		
		if(e.getSource()==me1){
			
		}
		
		if(e.getSource()==me2){
			//잘라내기
			if(ta.getText()!=null){
				st1=ta.getText();
				ta.setText("");
			}
		}
		
		if(e.getSource()==me3){
			if(ta.getText()!=null ){
			st1=ta.getText();
			ta.append("\n"+st1);
			}
		}
		
		if(e.getSource()==me4){
			ta.setText("");
			ta.setText(st1);
		}
		
		
		if(e.getSource()==me5){
			if(ta.getText()!=null)
			{
				ta.setText("");
			}
		}
		
		if(e.getSource()==me6){
			if(ta.getText()!=null){
				ta.selectAll();
			}
		}
		
		if(e.getSource()==md1){
			JOptionPane.showMessageDialog(this,"정보입니다","Infomation",JOptionPane.INFORMATION_MESSAGE);
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
