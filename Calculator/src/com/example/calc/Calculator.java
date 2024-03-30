package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends Activity implements OnClickListener, TextWatcher {
	EditText etResult;
	Button btnPlus, btnMinus, btnMultiply, btnDivide, btnClear, btnAbs, btnDiv, btnMod, btnStepen, button0, button1,
			button2, button3, button4, button5, button6, button7, button8, button9, btnCalculate;

	int int_num1, int_num2, int_result;
	double double_num1, double_num2, double_result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);

		etResult = (EditText) findViewById(R.id.etResult);
		etResult.addTextChangedListener(this);

		btnPlus = (Button) findViewById(R.id.btnPlus);
		btnMinus = (Button) findViewById(R.id.btnMinus);
		btnMultiply = (Button) findViewById(R.id.btnMultiply);
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnClear = (Button) findViewById(R.id.btnClear);
		btnAbs = (Button) findViewById(R.id.btnAbs);
		btnDiv = (Button) findViewById(R.id.btnDiv);
		btnMod = (Button) findViewById(R.id.btnMod);
		btnStepen = (Button) findViewById(R.id.btnStepen);
		button0 = (Button) findViewById(R.id.button0);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		btnCalculate = (Button) findViewById(R.id.btnCalculate);

		btnPlus.setOnClickListener(this);
		btnMinus.setOnClickListener(this);
		btnMultiply.setOnClickListener(this);
		btnDivide.setOnClickListener(this);
		btnClear.setOnClickListener(this);
		btnAbs.setOnClickListener(this);
		btnDiv.setOnClickListener(this);
		btnMod.setOnClickListener(this);
		btnStepen.setOnClickListener(this);
		button0.setOnClickListener(this);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);
		button8.setOnClickListener(this);
		button9.setOnClickListener(this);
		btnCalculate.setOnClickListener(this);
	}
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.button0:
			etResult.append(button0.getText());
			break;
		case R.id.button1:
			etResult.append(button1.getText());
			break;
		case R.id.button2:
			etResult.append(button2.getText());
			break;
		case R.id.button3:
			etResult.append(button3.getText());
			break;
		case R.id.button4:
			etResult.append(button4.getText());
			break;
		case R.id.button5:
			etResult.append(button5.getText());
			break;
		case R.id.button6:
			etResult.append(button6.getText());
			break;
		case R.id.button7:
			etResult.append(button7.getText());
			break;
		case R.id.button8:
			etResult.append(button8.getText());
			break;
		case R.id.button9:
			etResult.append(button9.getText());
			break;
		case R.id.btnPlus:
			etResult.append(btnPlus.getText());
			break;
		case R.id.btnMinus:
			etResult.append(btnMinus.getText());
			break;
		case R.id.btnMultiply:
			etResult.append(btnMultiply.getText());
			break;
		case R.id.btnDivide:
			etResult.append(btnDivide.getText());
			break;
		case R.id.btnClear:
			etResult.setText("");
			break;
		case R.id.btnAbs:
			if (etResult.getText().length() > 0) {
				double_num1 = Double.valueOf(etResult.getText().toString());
				double_num1 = Math.abs(double_num1);
				etResult.setText(String.valueOf(double_num1));
			}
}