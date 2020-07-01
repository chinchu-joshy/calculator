import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isoperatorClicked=false;
	JFrame f;
	JLabel displaylabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton divisionbutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton multiplicationbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton subtractionbutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equelbutton;
	JButton additionbutton;
	JButton clearbutton;
	JButton squrebutton;
	String oldvalueAdd,oldvalueDiv,oldvalueMulti,oldvalueSub,oldvalueSqu;
	int call;
	public Calculator(){
	 f=new JFrame ("calculator");
		f.setLayout(null);
		f.setSize(500, 600);
		f.setLocation(400, 100);
	
		displaylabel=new JLabel("");
		displaylabel.setBounds(30, 50, 360, 50);
		displaylabel.setBackground(Color.gray);
		displaylabel.setOpaque(true);
		displaylabel.setForeground(Color.white);
		f.add(displaylabel);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		 sevenbutton=new JButton("7");
		sevenbutton.setBounds(40, 140, 55,55 );
		f.add(sevenbutton);
		sevenbutton.setFont(new Font("Arial",Font.PLAIN,30));
		sevenbutton.setBackground(Color.gray);
		sevenbutton.addActionListener(this);
		
		 eightbutton=new JButton("8");
		eightbutton.setBounds(130,140,55,55);
		f.add(eightbutton);
		eightbutton.setFont(new Font("Arial",Font.PLAIN,30));
		eightbutton.setBackground(Color.gray);
		eightbutton.addActionListener(this);
		
		 ninebutton=new JButton("9");
		ninebutton.setBounds(220, 140, 55,55);
		f.add(ninebutton);
		ninebutton.setFont(new Font("Arial",Font.PLAIN,30));
		ninebutton.setBackground(Color.gray);
		ninebutton.addActionListener(this);
		
		divisionbutton=new JButton("/");
		divisionbutton.setBounds(310, 140, 65, 55);
		f.add(divisionbutton);
		divisionbutton.setFont(new Font("Arial",Font.PLAIN,30));
		divisionbutton.setBackground(Color.pink);
		divisionbutton.addActionListener(this);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(40, 230,55, 55);
		f.add(fourbutton);
		fourbutton.setFont(new Font("Arial",Font.PLAIN,30));
		fourbutton.setBackground(Color.gray);
		fourbutton.addActionListener(this);
		
		 fivebutton=new JButton("5");
		fivebutton.setBounds(130,230 ,55, 55);
		f.add(fivebutton);
		fivebutton.setFont(new Font("Arial",Font.PLAIN,30));
		fivebutton.setBackground(Color.gray);
		fivebutton.addActionListener(this);
		
		 sixbutton=new JButton("6");
		sixbutton.setBounds(220, 230, 55,55);
		f.add(sixbutton);
		sixbutton.setFont(new Font("Arial",Font.PLAIN,30));
		sixbutton.setBackground(Color.gray);
		sixbutton.addActionListener(this);
		
		 multiplicationbutton=new JButton("*");
		multiplicationbutton.setBounds(310, 230, 65, 55);
		f.add(multiplicationbutton);
		multiplicationbutton.setFont(new Font("Arial",Font.PLAIN,30));
		multiplicationbutton.setBackground(Color.pink);
		multiplicationbutton.addActionListener(this);
		
		 onebutton=new JButton("1");
		onebutton.setBounds(40, 320,55, 55);
		f.add(onebutton);
		onebutton.setFont(new Font("Arial",Font.PLAIN,30));
		onebutton.setBackground(Color.gray);
		onebutton.addActionListener(this);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130, 320, 55, 55);
		f.add(twobutton);
		twobutton.setFont(new Font("Arial",Font.PLAIN,30));
		twobutton.setBackground(Color.gray);
		twobutton.addActionListener(this);
		
		 threebutton=new JButton("3");
		threebutton.setBounds(220, 320, 55, 55);
		f.add(threebutton);
		threebutton.setFont(new Font("Arial",Font.PLAIN,30));
		threebutton.setBackground(Color.gray);
		threebutton.addActionListener(this);
		
		 subtractionbutton=new JButton("-");
		subtractionbutton.setBounds(310, 320,65, 55);
		f.add(subtractionbutton);
		subtractionbutton.setFont(new Font("Arial",Font.PLAIN,30));
		subtractionbutton.setBackground(Color.pink);
		subtractionbutton.addActionListener(this);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(40, 410,55, 55);
		f.add(dotbutton);
		dotbutton.setFont(new Font("Arial",Font.PLAIN,30));
		dotbutton.setBackground(Color.gray);
		dotbutton.addActionListener(this);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 410, 55, 55);
		f.add(zerobutton);
		zerobutton.setFont(new Font("Arial",Font.PLAIN,30));
		zerobutton.setBackground(Color.gray);
		zerobutton.addActionListener(this);
		
		 equelbutton=new JButton("=");
		equelbutton.setBounds(220,410 , 55, 55);
		f.add(equelbutton);
		equelbutton.setFont(new Font("Arial",Font.PLAIN,30));
		equelbutton.setBackground(Color.gray);
		equelbutton.addActionListener(this);
		
		 additionbutton=new JButton("+");
		additionbutton.setBounds(310, 410, 65, 55);
		f.add(additionbutton);
		additionbutton.setFont(new Font("Arial",Font.PLAIN,30));
		additionbutton.setBackground(Color.pink);
		additionbutton.addActionListener(this);
		
		clearbutton=new JButton("clear");
		clearbutton.setBounds(265, 490,110, 40);
		f.add(clearbutton);
		clearbutton.setFont(new Font("Arial",Font.PLAIN,30));
		clearbutton.setBackground(Color.pink);
		clearbutton.addActionListener(this);
		
		squrebutton=new JButton("squre");
		squrebutton.setBounds(40, 490,110, 40);
		f.add(squrebutton);
		squrebutton.setFont(new Font("Arial",Font.PLAIN,30));
		squrebutton.setBackground(Color.pink);
		squrebutton.addActionListener(this);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String a[]) {
		Calculator c=new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource()==sevenbutton) {
			if(isoperatorClicked) {
				displaylabel.setText("7");
				isoperatorClicked=false;
			
			}
			else {
			String LabelText=displaylabel.getText();
			displaylabel.setText(LabelText+"7");}
		}else if(e.getSource()==eightbutton) {
			if(isoperatorClicked) {
				displaylabel.setText("8");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"8");}
		}else if(e.getSource()==ninebutton) {
			if(isoperatorClicked) {
				displaylabel.setText("9");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"9");}
		}else if(e.getSource()==fourbutton) {
			if(isoperatorClicked) {
				displaylabel.setText("4");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"4");}
		}else if(e.getSource()==fivebutton) {
			if(isoperatorClicked) {
				displaylabel.setText("5");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"5");}
		}else if(e.getSource()==sixbutton) {
			if(isoperatorClicked) {
				displaylabel.setText("6");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"6");}
		}else if(e.getSource()==onebutton) {
			if(isoperatorClicked) {
				displaylabel.setText("1");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"1");}
		}else if(e.getSource()==twobutton) {
			if(isoperatorClicked) {
				displaylabel.setText("2");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"2");}
		}else if(e.getSource()==threebutton) {
			if(isoperatorClicked) {
				displaylabel.setText("3");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"3");}
		}else if(e.getSource()==dotbutton) {
			if(isoperatorClicked) {
				displaylabel.setText(".");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+".");}
			
		}else if(e.getSource()==zerobutton) {
			if(isoperatorClicked) {
				displaylabel.setText("0");
				isoperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"0");}
		}
		
		else if(e.getSource()==additionbutton) {
			isoperatorClicked=true;
			call=1;
			oldvalueAdd=displaylabel.getText();
			
		}else if(e.getSource()==divisionbutton) {
			isoperatorClicked=true;
			call=2;
			oldvalueDiv=displaylabel.getText();
	}else if(e.getSource()==multiplicationbutton) {
		isoperatorClicked=true;
		call=3;
		oldvalueMulti=displaylabel.getText();
	}
		else if(e.getSource()==subtractionbutton) {
			isoperatorClicked=true;
			call=4;
			oldvalueSub=displaylabel.getText();
	}

		else if(e.getSource()==squrebutton) {
			isoperatorClicked=true;
			call=5;
			oldvalueSqu=displaylabel.getText();
			
			
	}
		else if(e.getSource()==equelbutton) {
			if(call==1) {
			String newvalue=displaylabel.getText();
			float oldvalueAddition=Float.parseFloat(oldvalueAdd);
			float newvalueAddition=Float.parseFloat(newvalue);
			float resultD=oldvalueAddition+newvalueAddition;
			displaylabel.setText(resultD+"");
			
			}
			if(call==2) {
				String newvalue=displaylabel.getText();
				float oldvalueDivision=Float.parseFloat(oldvalueDiv);
				float newvalueDivision=Float.parseFloat(newvalue);
				float resultA=oldvalueDivision/newvalueDivision;
				displaylabel.setText(resultA+"");
			}
			if(call==3) {
				String newvalue=displaylabel.getText();
				float oldvalueMultiplication=Float.parseFloat(oldvalueMulti);
				float newvalueMultiplication=Float.parseFloat(newvalue);
				float resultM=oldvalueMultiplication*newvalueMultiplication;
				displaylabel.setText(resultM+"");
			}
			if(call==4) {
				String newvalue=displaylabel.getText();
				float oldvalueSubtraction=Float.parseFloat(oldvalueSub);
				float newvalueSubtraction=Float.parseFloat(newvalue);
				float resultS=oldvalueSubtraction-newvalueSubtraction;
				displaylabel.setText(resultS+"");
			}
			if(call==5) {
				
				float old=Float.parseFloat(oldvalueSqu);
				float result=old*old;
				
				displaylabel.setText(result+"");
				
			}
			
		}else if(e.getSource()==clearbutton) {
		displaylabel.setText("");}
		}
}