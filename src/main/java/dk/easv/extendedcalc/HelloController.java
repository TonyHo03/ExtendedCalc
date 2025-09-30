package dk.easv.extendedcalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {


    public Label lblResult;
    public Button btnClearClick, btnPlusMinusClick, btnPercentClick, btnDivideClick, btnSevenClick, btnEightClick, btnNineClick, btnMultiplyClick, btnFourClick,btnFiveClick, btnSixClick, btnMinusClick, btnOneClick, btnTwoClick, btnThreeClick, btnPlusClick, btnZeroClick, btnCommaClick, btnCalculateClick;
    public Label lblOperator;

    private double result1 = 0;
    private String result2 = "";
    private String operator = "+";

    public void onBtnClearClick(ActionEvent actionEvent) {
        result1 = 0;
        result2 = "";
        operator = "+";
        lblResult.setText("");
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
        result2 = Double.parseDouble(result2) * -1 + "";
        lblResult.setText(result2);
    }

    public void onBtnPercentClick(ActionEvent actionEvent) {

        result2 = Double.parseDouble(result2)/100 * result1 + "";
        lblResult.setText(result2);

    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        if (result1 == 0) {
            result1 = 1 / Double.parseDouble(result2);
        }else{
            result1 = result1 / Double.parseDouble(result2);
        }
        result2 = "";
        lblResult.setText(result2);
        operator = "/";
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
        if (result1 == 0) {
            result1 = 1 * Double.parseDouble(result2);
        }else{
            result1 = result1 * Double.parseDouble(result2);
        }
        result2 = "";
        lblResult.setText(result2);
        operator = "*";
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
        if (result1 == 0) {
            result1 = Double.parseDouble(result2);
        } else {
            result1 = result1 - Double.parseDouble(result2);
        }

        result2 = "";
        lblResult.setText(result2);
        operator = "-";
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

        if (result1 == 0) {
            result1 = Double.parseDouble(result2);
        } else {
            result1 = result1 + Double.parseDouble(result2);
        }

        result2 = "";
        lblResult.setText(result2);
        operator = "+";

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
        if (operator.equals("+")) {
            result1 = result1 + Double.parseDouble(result2);
            result2 = "0";
            lblResult.setText(result1 + "");
        } else if (operator.equals("-")) {
            result1 = result1 - Double.parseDouble(result2);
            result2 = "0";
            lblResult.setText(result1 + "");
        }  else if (operator.equals("*")) {
            result1 = result1 * Double.parseDouble(result2);
            result2 = "0";
            lblResult.setText(result1 + "");
        } else if (operator.equals("/")) {
            result1 = result1 / Double.parseDouble(result2);
            result2 = "0";
            lblResult.setText(result1 + "");
        }

    }
}
