package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare all the buttons and text veiw
    private Button zero, one, two, three, four, five, six, seven, eight, nine, dot;
    private Button add, substract, multiply, divide, clearAll, equal;
    private EditText values;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void setupButtons(){
        //Setup All the buttons and Text views
        zero = findViewById(R.id.buttonZero);
        one = findViewById(R.id.buttonOne);
        two = findViewById(R.id.buttonTwo);
        three = findViewById(R.id.buttonThree);
        four = findViewById(R.id.buttonFour);
        five = findViewById(R.id.buttonFive);
        six = findViewById(R.id.buttonSix);
        seven = findViewById(R.id.buttonSeven);
        eight = findViewById(R.id.buttonEight);
        nine = findViewById(R.id.buttonNine);
        add = findViewById(R.id.buttonAdd);
        substract = findViewById(R.id.buttonSubtract);
        multiply = findViewById(R.id.buttonMultiply);
        divide = findViewById(R.id.buttonDivide);
        clearAll = findViewById(R.id.buttonClear);
        equal = findViewById(R.id.buttonEqual);
        values = findViewById(R.id.editText);
        result = findViewById(R.id.infoTextView);
    }
}
