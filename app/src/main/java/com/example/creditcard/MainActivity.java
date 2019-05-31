package com.example.creditcard;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCreditCardNumber;
    private TextView creditCardNumberText;

    private EditText editTextCVV;
    private TextView CVVText;

    private EditText editTextMMYY;
    private TextView MMYYChangedText;

    private EditText editTextName;
    private TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));

        ActionBar actionBar = getSupportActionBar();
        assert  actionBar != null;
        actionBar.setTitle("Credit Card");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow);

        editTextCreditCardNumber = findViewById(R.id.editTextCreditCardNumber);
        creditCardNumberText = findViewById(R.id.creditCardNumberText);
        editTextCreditCardNumber.addTextChangedListener(textWatcher);

        editTextCVV = findViewById(R.id.editTextCVV);
        CVVText = findViewById(R.id.CVVText);
        editTextCVV.addTextChangedListener(textWatcher);

        editTextMMYY = findViewById(R.id.editTextMMYY);
        MMYYChangedText = findViewById(R.id.MMYYChangeText);
        editTextMMYY.addTextChangedListener(textWatcher);

        editTextName = findViewById(R.id.editTextName);
        nameText = findViewById(R.id.nameText);
        editTextName.addTextChangedListener(textWatcher);

    }

    private TextWatcher textWatcher =
            new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    if(editTextCreditCardNumber.hasFocus())
                        creditCardNumberText.setText(s);

                    else if(editTextCVV.hasFocus())
                        CVVText.setText(s);

                    else if(editTextMMYY.hasFocus())
                        MMYYChangedText.setText(s);

                    else if(editTextName.hasFocus())
                        nameText.setText(s);

                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            };

}
