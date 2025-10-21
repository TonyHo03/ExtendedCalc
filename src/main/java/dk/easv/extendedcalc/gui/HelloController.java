package dk.easv.extendedcalc.gui;

import dk.easv.extendedcalc.bll.CalculatorLogic;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {


    public Label lblResult;
    public Button btnClearClick, btnPlusMinusClick, btnPercentClick, btnDivideClick, btnSevenClick, btnEightClick, btnNineClick, btnMultiplyClick, btnFourClick,btnFiveClick, btnSixClick, btnMinusClick, btnOneClick, btnTwoClick, btnThreeClick, btnPlusClick, btnZeroClick, btnCommaClick, btnCalculateClick;
    public Label lblOperator;

    private double result1 = 0;
    private String result2 = "0";
    private String operator = "+";

    private final CalculatorLogic calculatorLogic = new CalculatorLogic();

    public void onBtnClearClick(ActionEvent actionEvent) {
        result1 = 0;
        result2 = "0";
        operator = "+";
        lblResult.setText(result2);
        lblOperator.setText(operator);
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
        result2 = calculatorLogic.PlusMinus(Double.parseDouble(result2)) + "";
        lblResult.setText(result2);
    }

    public void onBtnPercentClick(ActionEvent actionEvent) {

        result2 = calculatorLogic.Percent(result1, Double.parseDouble(result2)) + "";
        lblResult.setText(result2);

    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        operator = "/";
        lblOperator.setText(operator);
        result1 = calculatorLogic.Division(result1, Double.parseDouble(result2));
        result2 = "0";
        lblResult.setText(result2);
    }

    public void onBtnSevenClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "7";
        } else {
            result2 = result2 + "7";
        }
        lblResult.setText(result2);
    }

    public void onBtnEightClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "8";
        } else {
            result2 = result2 + "8";
        }
        lblResult.setText(result2);
    }

    public void onBtnNineClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "9";
        } else {
            result2 = result2 + "9";
        }
        lblResult.setText(result2);
    }

    public void onBtnMultiplyClick(ActionEvent actionEvent) {
        operator = "*";
        lblOperator.setText(operator);
        result1 = calculatorLogic.Multiplication(result1, Double.parseDouble(result2));
        result2 = "0";
        lblResult.setText(result2);
    }

    public void onBtnFourClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "4";
        } else {
            result2 = result2 + "4";
        }
        lblResult.setText(result2);
    }

    public void onBtnFiveClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "5";
        } else {
            result2 = result2 + "5";
        }
        lblResult.setText(result2);
    }

    public void onBtnSixClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "6";
        } else {
            result2 = result2 + "6";
        }
        lblResult.setText(result2);
    }

    public void onBtnMinusClick(ActionEvent actionEvent) {
        operator = "-";
        lblOperator.setText(operator);
        result1 = calculatorLogic.Subtraction(result1, Double.parseDouble(result2));

        result2 = "0";
        lblResult.setText(result2);
    }

    public void onBtnOneClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "1";
        } else {
            result2 = result2 + "1";
        }
        lblResult.setText(result2);
    }

    public void onBtnTwoClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "2";
        } else {
            result2 = result2 + "2";
        }
        lblResult.setText(result2);
    }

    public void onBtnThreeClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "3";
        } else {
            result2 = result2 + "3";
        }
        lblResult.setText(result2);
    }

    public void onBtnPlusClick(ActionEvent actionEvent) {
        operator = "+";
        lblOperator.setText(operator);
        result1 = calculatorLogic.Addition(result1, Double.parseDouble(result2));

        result2 = "0";
        lblResult.setText(result2);

    }

    public void onBtnZeroClick(ActionEvent actionEvent) {
        if (result2.equals("0")) {
            result2 = "0";
        } else {
            result2 = result2 + "0";
        }

        lblResult.setText(result2);
    }

    public void onBtnCommaClick(ActionEvent actionEvent) {
        result2 = result2 + ".";
        lblResult.setText(result2);
    }

    public void onBtnCalculateClick(ActionEvent actionEvent) {

        result1 = calculatorLogic.Calc(result1, Double.parseDouble(result2), operator);
        result2 = "0";
        operator = "=";
        lblOperator.setText(operator);
        System.out.println(operator);
        lblResult.setText(result1 + "");

    }
}
