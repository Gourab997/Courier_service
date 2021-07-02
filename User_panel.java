import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class User_panel extends Frame implements ActionListener{
	private Frame parent;
	private User_login ulog;
	public User_panel(){}
	public User_panel(User_login log){
		super("User Panel");
		ulog=log;
		Button b1=new Button("User List");
		Button b2=new Button("Employee List");
		Button b3=new Button("History");
		Button b4=new Button("Approval");
		Button b5=new Button("Logout");
		b1.setBounds(50,150,100,70);
		b2.setBounds(150,150,100,70);
		b3.setBounds(250,150,100,70);
		b4.setBounds(350,150,100,70);
		b5.setBounds(450,150,100,70);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(b1);add(b2);add(b3);add(b4);add(b5);
		setSize(600,400);
		setLocation(600,400);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent ae){
		System.out.println("Button Pressed");
		String s=ae.getActionCommand();
		if(s.equals("Logout")){
			this.setVisible(false);
			parent.setVisible(true);
		}
		if(s.equals("Approval")){
			this.setVisible(false);
			cs.setVisible(true);
			cs.setParent(this);
		}
		if(s.equals("History")){
			//this.setVisible(false);
			//parent.setVisible(true);
			System.out.println("logout2");
		}
		if(s.equals("Employee List")){
			this.setVisible(false);
			el.setVisible(true);
			el.setParent(this);
			
		}
		if(s.equals("User List")){
			this.setVisible(false);
			user.setVisible(true);
			user.setParent(this);
			
		}
	}
	public void setParent(Frame f){parent=f;}
}

