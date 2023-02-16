package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
	
	@FXML
	
	
	public Label Results;
	
	
	
	String Formula1 = "";
	String Formula2 = "";
	String Operation = "";
	
	String FormulaResults = "";
	

	int num1;// the first value//
	int num2;// the second value//
	
	int Answer;// the answer in integer form which is converted//
	
	int btn=1; //stays at 1 to play case 1 switch in all buttons.used to determine when operator is pressed so inputs afterwards go towards to second value//
	int btn2=0;//determines which operator will be used//
	int btn3=0;//used to determine when to reset everything//
	int btn4=0;//used so that 0 can not be the first value pressed//
	int btn5=0;//used so that an operator cannot be pressed first//
	
	
	
	public void Button_clear(ActionEvent e) { //clear or reset button//
		
		Results.setText("0");
		Formula1 = "";
		Formula2 = "";
		Operation = "";
		
		FormulaResults = "";
		Answer=0;
		btn=1;
		btn3=0;
		btn4=0;
		btn5=0;
		
		
	}
	public void Button_one(ActionEvent e) {
		btn4=1;
		btn5=1;
		
	if (btn3==0) {
		switch(btn) {
		
		case 1:
			Formula1 += "1";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
			break;
			
		case 2:
			Formula2 += "1";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
				
			num2=Integer.parseInt(Formula2);
			break;
				
			}
		
	}
	else if(btn3==1) {  //if a number is pressed after the answer is displayed, reset the calculation and input the number after//
		Results.setText("0");
		Formula1 = "";
		Formula2 = "";
		Operation = "";
		
		FormulaResults = "";
		Answer=0;
		btn=1;
		btn3=0;
		
		Formula1 += "1";
		Results.setText(Formula1+Operation+Formula2);
		System.out.println("working");
		
		num1=Integer.parseInt(Formula1);
	}
	}
	public void Button_two(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "2";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "2";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "2";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}	
	}
	public void Button_three(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "3";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "3";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "3";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}				
	}
	public void Button_four(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "4";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "4";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "4";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}
	}
	public void Button_five(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "5";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "5";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "5";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}
	}
	public void Button_six(ActionEvent e) {	
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "6";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "6";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "6";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}

	}
	public void Button_seven(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "7";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "7";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "7";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}
	
	}
	public void Button_eight(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "8";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "8";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "8";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}
	
	}
	public void Button_nine(ActionEvent e) {
		btn4=1;
		btn5=1;
		
		if (btn3==0) {
			switch(btn) {
			
			case 1:
				Formula1 += "9";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "9";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			Formula1 += "9";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			num1=Integer.parseInt(Formula1);
		}
	
	}
	public void Button_zero(ActionEvent e) {
		if (btn3==0 && btn4==1) {
			switch(btn) {
			
			case 1:
				Formula1 += "0";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
				
				num1=Integer.parseInt(Formula1);
				break;
				
			case 2:
				Formula2 += "0";
				Results.setText(Formula1+Operation+Formula2);
				System.out.println("working");
					
				num2=Integer.parseInt(Formula2);
				break;
					
				}
			
		}
		else if(btn3==1) {
			System.out.println("working");
			Results.setText("0");
			Formula1 = "";
			Formula2 = "";
			Operation = "";
			
			FormulaResults = "";
			Answer=0;
			btn=1;
			btn3=0;
			
			//Formula1 += "0";//
			
			
			num1=Integer.parseInt(Formula1);
		}
		
	}
	public void Button_divide(ActionEvent e) { //divide operator//

		if (btn5==1) {
		for (btn = 1; btn < 2; btn++) {
			Operation = "/";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			btn2=1;
		
		 }
		}
		
	}
	public void Button_multiply(ActionEvent e) {//multiply operator//
		
		if (btn5==1) {
		for (btn = 1; btn < 2; btn++) {
			Operation = "*";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			btn2=2;
		}
		}
	}
	public void Button_subtract(ActionEvent e) {//subtract operator//
		
		if (btn5==1) {
		for (btn = 1; btn < 2; btn++) {
			Operation = "-";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			btn2=3;
			
		}
		}
		
	
	}
	public void Button_add(ActionEvent e) {//add operator//
		
		if (btn5==1) {
		for (btn = 1; btn < 2; btn++) {
			Operation = "+";
			Results.setText(Formula1+Operation+Formula2);
			System.out.println("working");
			
			btn2=4;
		}
		}

	}
	public void Button_equals(ActionEvent e) { //equals button//
		if (btn5==1) {
		num1=Integer.parseInt(Formula1);
		num2=Integer.parseInt(Formula2);
		
		operation();
		System.out.println(Answer);
		
		FormulaResults=String.valueOf(Answer);
		
		Results.setText(FormulaResults);
		btn3++;
		btn4=0;
		btn5=0;
		
		}
	
		
		
	}
	public void operation () {//place where operation is determined//
		
		if (btn2==1) {
			Answer = num1 / num2;
		}
		else if(btn2==2) {
			Answer = num1 * num2;
		}
		else if(btn2==3) {
			Answer = num1 - num2;
		}
		else if(btn2==4)	{
			Answer = num1 + num2;
		}
	}

}
