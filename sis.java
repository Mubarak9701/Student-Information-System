import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mk
{
public static void main(String args[])
{
new I();
}
}
class I implements ActionListener
{
	JFrame f;
	JPanel p1,p2,p3,p4,p5;
	JButton b1,b2,b3,b4;
	I()
	{
		f=new JFrame("Student Information");
		p1=new JPanel();p2=new JPanel();p3=new JPanel();p4=new JPanel();p5=new JPanel();
		b1=new JButton("Admin");b2=new JButton("Student");b3=new JButton("Parent");b4=new JButton("Exit");
		b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b1.setForeground(Color.red);b2.setForeground(Color.orange);
		b3.setForeground(Color.pink);b4.setForeground(Color.blue);
		f.setVisible(true);
		f.setSize(400,300);
		f.setLayout(new GridLayout(4,1));
		p1.add(b1);p2.add(b2);p3.add(b3);p4.add(b4);
		f.add(p1);f.add(p2);f.add(p3);f.add(p4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
	try{
		FileWriter y6=new FileWriter("admin.txt");
		String sq="1234";
		y6.write(sq);
		y6.close();
	}
	catch(Exception oo){}
if(m.getSource().equals(b1)){
	f.setVisible(false);
	new L(1);
}
else if(m.getSource().equals(b2)){
	f.setVisible(false);
	new L(2);
}
else if(m.getSource().equals(b3)){
	f.setVisible(false);
	new L(3);
}
else
	f.setVisible(false);
}
}
class L implements ActionListener
{
	JButton b1,b2,b3;
	JFrame f;
    int n;
	JLabel l1,l2;
	JPasswordField t;
	JTextField t1;
	L(int x)
	{
		n=x;
		l1=new JLabel("Username");
		t=new JPasswordField(10);
		l2=new JLabel("Password");
		t1=new JTextField(10);
		f=new JFrame("Login");
		b1=new JButton("Login");
		b2=new JButton("Back");
		b3=new JButton("Exit");
		b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b1.setForeground(Color.red);
		b2.setForeground(Color.orange);b3.setForeground(Color.pink);
		l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		t.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		f.setLayout(new FlowLayout());
		f.setVisible(true);f.setSize(600,400);f.add(l1);f.add(t1);
		f.add(l2);f.add(t);f.add(b2);f.add(b3);f.add(b1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);	
       }
public void actionPerformed(ActionEvent m){
	if(m.getSource().equals(b1)){
		String s9=t1.getText();
		try{
			File ff=new File(t1.getText()+".txt");
			if(ff.exists()){
				String s="";
				if(n==1 || n==2){
					FileReader f8=new FileReader(t1.getText()+".txt");
					int c=1;
					while((c=f8.read())!=-1){
						s+=(char)c;}
					f8.close();
				}
				else if(n==3){
					FileReader f1=new FileReader(t1.getText()+"p.txt");
					int c=1;
					while((c=f1.read())!=-1){
						s+=(char)c;
						}
					f1.close();
				}
				if(s.equals(t.getPassword().toString())){
					if(n==1){
						f.setVisible(false);
						new A();
					}
					else if(n==2){
						f.setVisible(false);
						new S(s9);
					}
					else if(n==3){
						f.setVisible(false);
						new P(s9);
					}
				}
				else
					JOptionPane.showMessageDialog(null,"Invalid Password");
			}
			else
				JOptionPane.showMessageDialog(null,"No Student with this roll no exists");
		}
		catch(Exception oo){}
		}
	else if(m.getSource().equals(b2)){
	f.setVisible(false);
	new I();
	}
	else
		f.setVisible(false);
}}
class A implements ActionListener    // admin
{
JFrame f;
JButton b1,b2,b3,b4,b5;
JPanel p1,p2,p3,p4,p5,p6;
A()
{
f=new JFrame("Admin");
p1=new JPanel();
p5=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();
f.setVisible(true);
f.setSize(500,400);
f.setLayout(new FlowLayout());
p6=new JPanel();
b5=new JButton("Exit");
b4=new JButton("Logout");
b1=new JButton("New Student");
b2=new JButton("Existing Student");
b3=new JButton("Change Password");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
b4.setForeground(Color.blue);b5.setForeground(Color.green);
p1.add(b1);
p2.add(b2);
p3.add(b3);
p5.add(b4);
p6.add(b5);
f.add(p1);
f.add(p2);
f.add(p3);
f.add(p6);
f.add(p5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
f.setVisible(false);
new N(f);
}
else if(m.getSource().equals(b2))
{
f.setVisible(false);
new Exist(f);
}
else if(m.getSource().equals(b3))
{
f.setVisible(false);
new Change1(1);
}
else if(m.getSource().equals(b4))
{
f.setVisible(false);
new I();
}
else
{
f.setVisible(false);
}}}
class N implements ActionListener  // adding a new student
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;	
JButton b1,b2,b3;	
JFrame f,f1;
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
String s="",s1,s2,s3,s4,s5,s6="",s7;
N(JFrame f2)
{
f=new JFrame("New Student");
f1=f2;
b1=new JButton("Submit");b2=new JButton("Back");b3=new JButton("Exit");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
l1=new JLabel("Roll Number");
l2=new JLabel("Name");
l3=new JLabel("Date of Birth");
l4=new JLabel("Year");
l5=new JLabel("Branch");
l6=new JLabel("Mail");
l7=new JLabel("Mobile");
l8=new JLabel("City");
l9=new JLabel("Sem");
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
t4=new JTextField(10);
t5=new JTextField(10);
t6=new JTextField(10);
t7=new JTextField(10);
t8=new JTextField(10);
t9=new JTextField(10);
t10=new JTextField(10);
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t10.setFont(new Font("TimesNewRoman",Font.BOLD,20));
p1=new JPanel();p2=new JPanel();p5=new JPanel();
p3=new JPanel();p7=new JPanel();
p8=new JPanel();p4=new JPanel();p6=new JPanel();
p6.setLayout(new GridLayout(1,2,4,4));
p1.setLayout(new GridLayout(1,2,5,5));
p2.setLayout(new GridLayout(1,2,5,5));
p3.setLayout(new GridLayout(1,2,5,5));
p4.setLayout(new GridLayout(1,2,5,5));
p5.setLayout(new GridLayout(1,2,5,5));
p7.setLayout(new GridLayout(1,2,5,5));
p8.setLayout(new GridLayout(1,2,5,5));
p1.add(l1);p1.add(t1);
p2.add(l2);p2.add(t2);
p3.add(l3);p3.add(t3);
p4.add(l4);p4.add(t4);
p5.add(l5);p5.add(t5);
p6.add(l6);p6.add(t6);
p7.add(l7);p7.add(t7);
p8.add(l8);p8.add(t8);
p4.add(l9);p4.add(t9);
f.add(p1);f.add(p2);f.add(p3);f.add(p4);
f.add(p5);f.add(p6);f.add(p7);f.add(p8);
f.setVisible(true);f.setSize(500,900);
f.setLayout(new GridLayout(12,1,5,5));
f.add(b1);f.add(b2);f.add(b3);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
}
public void actionPerformed(ActionEvent m){
	if(m.getSource().equals(b1)){	
		String g1=t1.getText();
		String g7="12345";
		try{
			FileWriter g=new FileWriter(g1+"p.txt");
			g.write("12345");
			FileWriter y1=new FileWriter(g1+".txt");
			y1.write(g7);
			FileWriter y8=new FileWriter(g1+"name.txt");
			y8.write(t2.getText());
			FileWriter y2=new FileWriter(g1+"dob.txt");
			y2.write(t3.getText());
			FileWriter y3=new FileWriter(g1+"y.txt");
			y3.write(t4.getText()+t9.getText());
			FileWriter y4=new FileWriter(g1+"branch.txt");
			y4.write(t5.getText());
			FileWriter y5=new FileWriter(g1+"mail.txt");
			y5.write(t6.getText());
			FileWriter y6=new FileWriter(g1+"mobile.txt");
			y6.write(t7.getText());
			FileWriter y7=new FileWriter(g1+"city.txt");
			y7.write(t8.getText());
			y1.close();y2.close();y3.close();y4.close();g.close();
			y5.close();y6.close();y7.close();y8.close();
			JOptionPane.showMessageDialog(null,"Details of student with roll no:"+g1+" added successfully");
			f1.setVisible(true);
			f.setVisible(false);
		}
		catch(Exception oo){}
		}
	else if(m.getSource().equals(b2)){
		f1.setVisible(true);
		f.setVisible(false);
	}
	else if(m.getSource().equals(b3))
		f.setVisible(false);
}}
class Exist implements ActionListener
{
JFrame f,f1;
JLabel l1;
JTextField t1;
JButton b1,b2,b3;
Exist(JFrame f2)
{
f=new JFrame("Existing Student");
f1=f2;
b1=new JButton("Next");b2=new JButton("Back");b3=new JButton("Exit");
l1=new JLabel("Roll Nuber");
t1=new JTextField(10);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setForeground(Color.blue);
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
f.setVisible(true);
f.setSize(300,500);
f.setLayout(new FlowLayout());
f.add(l1);f.add(t1);
f.add(b1);f.add(b2);f.add(b3);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
try{
File y=new File(t1.getText()+".txt");
if(y.exists())
{
String d=t1.getText();
f.setVisible(false);
new Exist1(d);
}
else
JOptionPane.showMessageDialog(null,"student with this roll no doesnt exists");
}
catch(Exception oo){}
}
else if(m.getSource().equals(b2))
{
f.setVisible(false);
f1.setVisible(true);
}
else if(m.getSource().equals(b3)){
f.setVisible(false);
}}}
class Exist1 implements ActionListener
{
JFrame f,f1;
int c=0;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
JButton b1,b2;
String s="",s1="",s2="",s3="",s4="",s5="",s6="",s7="";
Exist1(String t)
{
f=new JFrame("Existing Student");
s+=t;
b1=new JButton("Submit");b2=new JButton("Exit");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l1=new JLabel("Roll Number");
l2=new JLabel("Name");
l3=new JLabel("DOB(D/M/Y)");
l4=new JLabel("Year");
l5=new JLabel("Sem");
l6=new JLabel("Branch");
l7=new JLabel("Mail");
l8=new JLabel("Mobile");
l9=new JLabel("City");
t1=new JTextField(10);t2=new JTextField(10);t3=new JTextField(10);
t4=new JTextField(10);t5=new JTextField(10);t6=new JTextField(10);
t7=new JTextField(10);t8=new JTextField(10);t9=new JTextField(10);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setForeground(Color.blue);t2.setForeground(Color.blue);
t3.setForeground(Color.blue);t4.setForeground(Color.blue);
t5.setForeground(Color.blue);t6.setForeground(Color.blue);
t7.setForeground(Color.blue);t8.setForeground(Color.blue);
t9.setForeground(Color.blue);
p1=new JPanel();p2=new JPanel();p4=new JPanel();p3=new JPanel();p5=new JPanel();
p6=new JPanel();p7=new JPanel();p8=new JPanel();p9=new JPanel();p10=new JPanel();
p1.setLayout(new GridLayout(1,2,5,5));
p2.setLayout(new GridLayout(1,2,5,5));
p3.setLayout(new GridLayout(1,2,5,5));
p4.setLayout(new GridLayout(1,2,5,5));
p5.setLayout(new GridLayout(1,2,5,5));
p6.setLayout(new GridLayout(1,2,5,5));
p7.setLayout(new GridLayout(1,2,5,5));
p8.setLayout(new GridLayout(1,2,5,5));
p9.setLayout(new GridLayout(1,2,5,5));
p10.setLayout(new GridLayout(1,3,5,5));
try{
FileReader y1=new FileReader(s+"name.txt");
while((c=y1.read())!=-1)
s1+=(char)c;
t2.setText(s1);
t1.setText(s);
FileReader y2=new FileReader(s+"dob.txt");
while((c=y2.read())!=-1)
s2+=(char)c;
t3.setText(s2);
FileReader y3=new FileReader(s+"y.txt");
while((c=y3.read())!=-1)
s3+=(char)c;
t4.setText(Character.toString(s3.charAt(0)));t5.setText(Character.toString(s3.charAt(1)));
FileReader y4=new FileReader(s+"branch.txt");
while((c=y4.read())!=-1)
s4+=(char)c;
t6.setText(s4);
FileReader y5=new FileReader(s+"mail.txt");
while((c=y5.read())!=-1)
s5+=(char)c;
t7.setText(s5);
FileReader y6=new FileReader(s+"mobile.txt");
while((c=y6.read())!=-1)
s6+=(char)c;
t8.setText(s6);
FileReader y7=new FileReader(s+"city.txt");
while((c=y7.read())!=-1)
s7+=(char)c;
t9.setText(s7);
y1.close();y2.close();y3.close();y4.close();
y5.close();y6.close();y7.close();
}
catch(Exception oo){}
f.setVisible(true);
f.setLayout(new GridLayout(10,1,5,5));
f.setSize(500,700);
t1.setEditable(false);
p1.add(l1);p1.add(t1);
p2.add(l2);p2.add(t2);
p3.add(l3);p3.add(t3);
p4.add(l4);p4.add(t4);
p5.add(l5);p5.add(t5);
p6.add(l6);p6.add(t6);
p7.add(l7);p7.add(t7);
p8.add(l8);p8.add(t8);
p9.add(l9);p9.add(t9);
p10.add(b1);p10.add(b2);
f.add(p1);f.add(p2);f.add(p3);f.add(p4);f.add(p5);
f.add(p6);f.add(p7);f.add(p8);f.add(p9);f.add(p10);
b1.setForeground(Color.red);b2.setForeground(Color.orange);
b1.addActionListener(this);b2.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
try
{
FileWriter y1=new FileWriter(s+"name.txt");
FileWriter y2=new FileWriter(s+"dob.txt");
FileWriter y3=new FileWriter(s+"y.txt");
FileWriter y4=new FileWriter(s+"branch.txt");
FileWriter y5=new FileWriter(s+"mail.txt");
FileWriter y6=new FileWriter(s+"mobile.txt");
FileWriter y7=new FileWriter(s+"city.txt");
y1.write(t2.getText());
y2.write(t3.getText());
y3.write(t4.getText()+t5.getText());
y4.write(t6.getText());
y5.write(t7.getText());
y6.write(t8.getText());
y7.write(t9.getText());
y1.close();y2.close();y3.close();y4.close();
y5.close();y6.close();y7.close();
JOptionPane.showMessageDialog(null,"Student Details saved Successfully");
new A();
f.setVisible(false);
}
catch(Exception nnb){}
}
else
f.setVisible(false);
}}
class S implements ActionListener
{
JFrame f;
String s1="",s2="",s3="",s4="",s5="",s6="",s7="",t="";
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
JButton b1,b2,b3;
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
S(String s)
{
t+=s;
f=new JFrame("Student");
b1=new JButton("Logout");b2=new JButton("Exit");b3=new JButton("Change Password");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
l1=new JLabel("Roll Number");
l2=new JLabel("Name");
l3=new JLabel("Date of Birth");
l4=new JLabel("Year");
l5=new JLabel("Branch");
l6=new JLabel("Mail");
l7=new JLabel("Mobile");
l8=new JLabel("City");
l9=new JLabel("Sem");
t1=new JTextField(10);t2=new JTextField(10);t3=new JTextField(10);
t4=new JTextField(10);t5=new JTextField(10);t6=new JTextField(10);
t7=new JTextField(10);t8=new JTextField(10);t9=new JTextField(10);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setForeground(Color.blue);t2.setForeground(Color.blue);
t3.setForeground(Color.blue);t4.setForeground(Color.blue);
t5.setForeground(Color.blue);t6.setForeground(Color.blue);
t7.setForeground(Color.blue);t8.setForeground(Color.blue);
t9.setForeground(Color.blue);
try{
FileReader y1=new FileReader(s+"name.txt");
FileReader y2=new FileReader(s+"dob.txt");
FileReader y3=new FileReader(s+"y.txt");
FileReader y4=new FileReader(s+"branch.txt");
FileReader y5=new FileReader(s+"mail.txt");
FileReader y6=new FileReader(s+"mobile.txt");
FileReader y7=new FileReader(s+"city.txt");
int c=0;
t1.setText(t);
while((c=y1.read())!=-1)
s1+=(char)c;
t2.setText(s1);
while((c=y2.read())!=-1)
s2+=(char)c;
t3.setText(s2);
while((c=y3.read())!=-1)
s4+=(char)c;
t4.setText(Character.toString(s4.charAt(0)));t9.setText(Character.toString(s4.charAt(1)));
while((c=y4.read())!=-1)
s3+=(char)c;
t5.setText(s3);
while((c=y5.read())!=-1)
s5+=(char)c;
t6.setText(s5);
while((c=y6.read())!=-1)
s6+=(char)c;
t7.setText(s6);
while((c=y7.read())!=-1)
s7+=(char)c;
t8.setText(s7);
y1.close();y2.close();y3.close();y4.close();
y5.close();y6.close();y7.close();
}
catch(Exception oo){}
p1=new JPanel();p2=new JPanel();p5=new JPanel();p10=new JPanel();
p3=new JPanel();p7=new JPanel();p9=new JPanel();
p8=new JPanel();p4=new JPanel();p6=new JPanel();
p6.setLayout(new GridLayout(1,2,4,4));
p1.setLayout(new GridLayout(1,2,5,5));
p2.setLayout(new GridLayout(1,2,5,5));
p3.setLayout(new GridLayout(1,2,5,5));
p4.setLayout(new GridLayout(1,2,5,5));
p5.setLayout(new GridLayout(1,2,5,5));
p7.setLayout(new GridLayout(1,2,5,5));
p8.setLayout(new GridLayout(1,2,5,5));
p10.setLayout(new GridLayout(1,2,5,5));
p1.add(l1);p1.add(t1);
p2.add(l2);p2.add(t2);
p3.add(l3);p3.add(t3);
p4.add(l4);p4.add(t4);p10.add(l9);p10.add(t9);
p5.add(l5);p5.add(t5);
p6.add(l6);p6.add(t6);
p7.add(l7);p7.add(t7);
p8.add(l8);p8.add(t8);
p9.add(b1);p9.add(b2);p9.add(b3);
f.setVisible(true);f.setSize(500,900);
f.setLayout(new GridLayout(9,1,5,5));
t1.setEditable(false);t2.setEditable(false);
t3.setEditable(false);t6.setEditable(false);
t4.setEditable(false);t7.setEditable(false);
t5.setEditable(false);t8.setEditable(false);
t9.setEditable(false);
f.add(p1);f.add(p2);f.add(p3);f.add(p4);f.add(p10);
f.add(p5);f.add(p6);f.add(p7);f.add(p8);f.add(p9);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
f.setVisible(false);
new L(2);
}
else if(m.getSource().equals(b3))
{
f.setVisible(false);
new Change1(2);
}
else{
f.setVisible(false);
}}}
class P implements ActionListener
{
JFrame f;
String s1="",s2="",s3="",s4="",s5="",s6="",s7="",t="";
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
JButton b1,b2,b3;
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
P(String s)
{
t+=s;
f=new JFrame("Parent");
b1=new JButton("Logout");b2=new JButton("Exit");b3=new JButton("Change Password");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
l1=new JLabel("Roll Number");
l2=new JLabel("Name");
l3=new JLabel("Date of Birth");
l4=new JLabel("Year");
l5=new JLabel("Branch");
l6=new JLabel("Mail");
l7=new JLabel("Mobile");
l8=new JLabel("City");
l9=new JLabel("Sem");
t1=new JTextField(10);t2=new JTextField(10);t3=new JTextField(10);
t4=new JTextField(10);t5=new JTextField(10);t6=new JTextField(10);
t7=new JTextField(10);t8=new JTextField(10);t9=new JTextField(10);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t5.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t6.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t7.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t8.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t9.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setForeground(Color.blue);t2.setForeground(Color.blue);
t3.setForeground(Color.blue);t4.setForeground(Color.blue);
t5.setForeground(Color.blue);t6.setForeground(Color.blue);
t7.setForeground(Color.blue);t8.setForeground(Color.blue);
t9.setForeground(Color.blue);
try{
FileReader y1=new FileReader(s+"name.txt");
FileReader y2=new FileReader(s+"dob.txt");
FileReader y3=new FileReader(s+"y.txt");
FileReader y4=new FileReader(s+"branch.txt");
FileReader y5=new FileReader(s+"mail.txt");
FileReader y6=new FileReader(s+"mobile.txt");
FileReader y7=new FileReader(s+"city.txt");
int c=0;
t1.setText(t);
while((c=y1.read())!=-1)
s1+=(char)c;
t2.setText(s1);
while((c=y2.read())!=-1)
s2+=(char)c;
t3.setText(s2);
while((c=y3.read())!=-1)
s4+=(char)c;
t4.setText(Character.toString(s4.charAt(0)));t9.setText(Character.toString(s4.charAt(1)));
while((c=y4.read())!=-1)
s3+=(char)c;
t5.setText(s3);
while((c=y5.read())!=-1)
s5+=(char)c;
t6.setText(s5);
while((c=y6.read())!=-1)
s6+=(char)c;
t7.setText(s6);
while((c=y7.read())!=-1)
s7+=(char)c;
t8.setText(s7);
y1.close();y2.close();y3.close();y4.close();
y5.close();y6.close();y7.close();
}
catch(Exception oo){}
p1=new JPanel();p2=new JPanel();p5=new JPanel();p10=new JPanel();
p3=new JPanel();p7=new JPanel();p9=new JPanel();
p8=new JPanel();p4=new JPanel();p6=new JPanel();
p6.setLayout(new GridLayout(1,2,4,4));
p1.setLayout(new GridLayout(1,2,5,5));
p2.setLayout(new GridLayout(1,2,5,5));
p3.setLayout(new GridLayout(1,2,5,5));
p4.setLayout(new GridLayout(1,2,5,5));
p5.setLayout(new GridLayout(1,2,5,5));
p7.setLayout(new GridLayout(1,2,5,5));
p8.setLayout(new GridLayout(1,2,5,5));
p10.setLayout(new GridLayout(1,2,5,5));
p1.add(l1);p1.add(t1);
p2.add(l2);p2.add(t2);
p3.add(l3);p3.add(t3);
p4.add(l4);p4.add(t4);p10.add(l9);p10.add(t9);
p5.add(l5);p5.add(t5);
p6.add(l6);p6.add(t6);
p7.add(l7);p7.add(t7);
p8.add(l8);p8.add(t8);
p9.add(b1);p9.add(b2);p9.add(b3);
f.setVisible(true);f.setSize(500,900);
f.setLayout(new GridLayout(9,1,5,5));
t1.setEditable(false);t2.setEditable(false);
t3.setEditable(false);t6.setEditable(false);
t4.setEditable(false);t7.setEditable(false);
t5.setEditable(false);t8.setEditable(false);
t9.setEditable(false);
f.add(p1);f.add(p2);f.add(p3);f.add(p4);f.add(p10);
f.add(p5);f.add(p6);f.add(p7);f.add(p8);f.add(p9);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
f.setVisible(false);
new L(3);
}
else if(m.getSource().equals(b3))
{
f.setVisible(false);
new Change1(3);
}
else{
f.setVisible(false);
}}}
class Change1 implements ActionListener
{
JFrame f;
JTextField t1,t2;
JPasswordField k1,k2;
JLabel l1,l2,l3,l4;
JPanel p1,p2,p3,p4,p5,p6;
JButton b1,b2,b3;
int n;
Change1(int x)
{
n=x;
l1=new JLabel("Username");
l2=new JLabel("Password");
k1=new JPasswordField(10);
k2=new JPasswordField(10);
l4=new JLabel("New Password");
t1=new JTextField(10);
l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
l4.setFont(new Font("TimesNewRoman",Font.BOLD,20));
k1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
k2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
t1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();
f=new JFrame("Change Password");
b1=new JButton("Change");b2=new JButton("Back");b3=new JButton("Exit");
b1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b2.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b3.setFont(new Font("TimesNewRoman",Font.BOLD,20));
b1.setForeground(Color.red);b2.setForeground(Color.orange);b3.setForeground(Color.pink);
f.setVisible(true);
f.setSize(500,400);
f.setLayout(new GridLayout(1,4,5,5));
p1.add(l1);
p1.add(t1);
p2.add(l2);
p2.add(k1);
p3.add(l4);
p3.add(k2);
p4.add(b1);
p4.add(b2);
p4.add(b3);
f.add(p1);
f.add(p2);
f.add(p3);
f.add(p4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent m)
{
if(m.getSource().equals(b1))
{
try{
String s="";
int c=0;
if(n==3){
FileReader y1=new FileReader(t1.getText()+"p.txt");
while((c=y1.read())!=-1){
s+=(char)c;
}
y1.close();
}
else{
FileReader y=new FileReader(t1.getText()+".txt");
while((c=y.read())!=-1){
s+=(char)c;
}
y.close();
}
if(s.equals(k1.getPassword().toString()))
{
if(n==3){
FileWriter y9=new FileWriter(t1.getText()+"p.txt");
String s3=k2.getPassword().toString();
y9.write(s3);
JOptionPane.showMessageDialog(null,"Password changed Successfully");
y9.close();
}
else{
FileWriter ym=new FileWriter(t1.getText()+".txt");
String s3=k2.getPassword().toString();
ym.write(s3);
JOptionPane.showMessageDialog(null,"Password changed Successfully");
ym.close();
}
f.setVisible(false);
new L(n);
}
else
JOptionPane.showMessageDialog(null,"Invalid Password");
}
catch(Exception oo){}
}
else if(m.getSource().equals(b2))
{
if(n==1)
{
f.setVisible(false);
new A();
}
else if(n==2)
{
f.setVisible(false);
new S(t1.getText());
}
else
{
f.setVisible(false);
new P(t1.getText());
}}
else
f.setVisible(false);
}}
