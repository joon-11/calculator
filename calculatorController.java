package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class calculatorController implements Initializable {
	@FXML Button btn0,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9,btnMul,btnDiv,btnMinus,btnAdd,btnEnter,btnClear;
	@FXML Label lblResult, lblTitle;
	String  num = "";
	String op;
	int n,x,y,result;
	private Model model = new Model();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	public void btn0Action(ActionEvent event) {
		n = 0;
		makenum(n);
	}
	public void btn1Action(ActionEvent event) {
		n = 1;
		makenum(n);
	}
	public void btn2Action(ActionEvent event) {
		n = 2;
		makenum(n);		
	}
	public void btn3Action(ActionEvent event) {
		n = 3;
		makenum(n);
	}
	public void btn4Action(ActionEvent event) {
		n = 4;
		makenum(n);
	}
	public void btn5Action(ActionEvent event) {
		n = 5;
		makenum(n);
	}
	public void btn6Action(ActionEvent event) {
		n = 6;
		makenum(n);
	}
	public void btn7Action(ActionEvent event) {
		n = 7;
		makenum(n);
	}
	public void btn8Action(ActionEvent event) {
		n = 8;
		makenum(n);
	}
	public void btn9Action(ActionEvent event) {
		n = 9;
		makenum(n);
	}
	public void btnMulAction(ActionEvent event) {
		op = "×";
		makelog(op);
	}
	public void btnDivAction(ActionEvent event) {
		op = "÷";
		makelog(op);
	}
	public void btnMinusAction(ActionEvent event) {
		op = "-";
		makelog(op);
	}
	public void btnAddAction(ActionEvent event) {
		op = "+";
		makelog(op);		
	}
	public void btnEnterAction(ActionEvent event) {
		y = Integer.parseInt(lblResult.getText());
		num = lblTitle.getText();
		
		lblTitle.setText(num + y + "=");
		result = model.calculator(op,x,y);
		lblResult.setText(Integer.toString(result));
		
	}
	public void btnClearActon(ActionEvent event) {
			lblResult.setText("");
		lblTitle.setText("");
	}
	public void makenum(int n) {
		num = lblResult.getText();
		lblResult.setText(num+Integer.toString(n));
	}
	public void makelog(String op) {
		x = Integer.parseInt(lblResult.getText());
		lblResult.setText("");
		lblTitle.setText(Integer.toString(x)+" "+ op + " ");
	}

}
