package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Controller {
    private int[][] pole = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    public Label lbl_win;
    boolean isGameRunning;

    public Controller(){

    }

    public void isWinner(){
        int sucet = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                sucet -= -pole[i][j];
            }
        }
        if (isGameRunning && (sucet == 0 || sucet == 16))
            lbl_win.setVisible(true);
    }

    public void btn1_click(ActionEvent actionEvent){
        changeTile(2,0,1);
        changeTile(5,1,0);
        changeTile(6,1,1);
        isWinner();
    }

    public void btn2_click(ActionEvent actionEvent){
        changeTile(1,0,0);
        changeTile(3,0,2);
        changeTile(5,1,0);
        changeTile(6,1,1);
        changeTile(7,1,2);
        isWinner();
    }

    public void btn3_click(ActionEvent actionEvent) {
        changeTile(2, 0, 1);
        changeTile(4, 0, 3);
        changeTile(6, 1, 1);
        changeTile(7, 1, 2);
        changeTile(8, 1, 3);
        isWinner();
    }

    public void btn4_click(ActionEvent actionEvent){
        changeTile(3, 0, 2);
        changeTile(7, 1, 2);
        changeTile(8, 1, 3);
        isWinner();
    }

    public void btn5_click(ActionEvent actionEvent) {
        changeTile(1, 0, 0);
        changeTile(2, 0, 1);
        changeTile(6, 1, 1);
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        isWinner();
    }

    public void btn6_click(ActionEvent actionEvent) {
        changeTile(1, 0, 0);
        changeTile(2, 0, 1);
        changeTile(3, 0, 2);
        changeTile(5, 1, 0);
        changeTile(7, 1, 2);
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        isWinner();
    }

    public void btn7_click(ActionEvent actionEvent) {
        changeTile(2, 0, 1);
        changeTile(3, 0, 2);
        changeTile(4, 0, 3);
        changeTile(6, 1, 1);
        changeTile(8, 1, 3);
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        isWinner();
    }

    public void btn8_click(ActionEvent actionEvent) {
        changeTile(3, 0, 2);
        changeTile(4, 0, 3);
        changeTile(7, 1, 2);
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        isWinner();
    }

    public void btn9_click(ActionEvent actionEvent) {
        changeTile(5, 1, 0);
        changeTile(6, 1, 1);
        changeTile(10, 2, 1);
        changeTile(13, 3, 0);
        changeTile(14, 3, 1);
        isWinner();
    }

    public void btn10_click(ActionEvent actionEvent) {
        changeTile(5, 1, 0);
        changeTile(6, 1, 1);
        changeTile(7, 1, 2);
        changeTile(9, 2, 0);
        changeTile(11, 2, 2);
        changeTile(13, 3, 0);
        changeTile(14, 3, 1);
        changeTile(15, 3, 2);
        isWinner();
    }

    public void btn11_click(ActionEvent actionEvent) {
        changeTile(6, 1, 1);
        changeTile(7, 1, 2);
        changeTile(8, 1, 3);
        changeTile(10, 2, 1);
        changeTile(12, 2, 3);
        changeTile(14, 3, 1);
        changeTile(15, 3, 2);
        changeTile(16, 3, 3);
        isWinner();
    }

    public void btn12_click(ActionEvent actionEvent) {
        changeTile(7, 1, 2);
        changeTile(8, 1, 3);
        changeTile(11, 2, 2);
        changeTile(15, 3, 2);
        changeTile(16, 3, 3);
        isWinner();
    }

    public void btn13_click(ActionEvent actionEvent) {
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        changeTile(14, 3, 1);
        isWinner();
    }

    public void btn14_click(ActionEvent actionEvent) {
        changeTile(9, 2, 0);
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        changeTile(13, 3, 0);
        changeTile(15, 3, 2);
        isWinner();
    }

    public void btn15_click(ActionEvent actionEvent) {
        changeTile(10, 2, 1);
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        changeTile(14, 3, 1);
        changeTile(16, 3, 3);
        isWinner();
    }

    public void btn16_click(ActionEvent actionEvent) {
        changeTile(11, 2, 2);
        changeTile(12, 2, 3);
        changeTile(15, 3, 2);
        isWinner();
    }

    public void changeTile(int value, int row, int col){
        if (pole[row][col] == 0){
            pole[row][col] = 1;
        }
        else pole[row][col] = 0;
        switch(value){
            case 1: if (pole[0][0] == 0) btn1.setText("0"); else btn1.setText("X"); break;
            case 2: if (pole[0][1] == 0) btn2.setText("0"); else btn2.setText("X"); break;
            case 3: if (pole[0][2] == 0) btn3.setText("0"); else btn3.setText("X"); break;
            case 4: if (pole[0][3] == 0) btn4.setText("0"); else btn4.setText("X"); break;
            case 5: if (pole[1][0] == 0) btn5.setText("0"); else btn5.setText("X"); break;
            case 6: if (pole[1][1] == 0) btn6.setText("0"); else btn6.setText("X"); break;
            case 7: if (pole[1][2] == 0) btn7.setText("0"); else btn7.setText("X"); break;
            case 8: if (pole[1][3] == 0) btn8.setText("0"); else btn8.setText("X"); break;
            case 9: if (pole[2][0] == 0) btn9.setText("0"); else btn9.setText("X"); break;
            case 10: if (pole[2][1] == 0) btn10.setText("0"); else btn10.setText("X"); break;
            case 11: if (pole[2][2] == 0) btn11.setText("0"); else btn11.setText("X"); break;
            case 12: if (pole[2][3] == 0) btn12.setText("0"); else btn12.setText("X"); break;
            case 13: if (pole[3][0] == 0) btn13.setText("0"); else btn13.setText("X"); break;
            case 14: if (pole[3][1] == 0) btn14.setText("0"); else btn14.setText("X"); break;
            case 15: if (pole[3][2] == 0) btn15.setText("0"); else btn15.setText("X"); break;
            case 16: if (pole[3][3] == 0) btn16.setText("0"); else btn16.setText("X"); break;
        }
    }

    public void shuffle(){
        Random rnd = new Random();
        for (int i = 0; i < 20; i ++){
            int j = rnd.nextInt(16)+1;
            switch(j){
                case 1: btn1_click(null); break;
                case 2: btn2_click(null); break;
                case 3: btn3_click(null); break;
                case 4: btn4_click(null); break;
                case 5: btn5_click(null); break;
                case 6: btn6_click(null); break;
                case 7: btn7_click(null); break;
                case 8: btn8_click(null); break;
                case 9: btn9_click(null); break;
                case 10: btn10_click(null); break;
                case 11: btn11_click(null); break;
                case 12: btn12_click(null); break;
                case 13: btn13_click(null); break;
                case 14: btn14_click(null); break;
                case 15: btn15_click(null); break;
                case 16: btn16_click(null); break;
            }
        }
        isGameRunning = true;
    }
}
