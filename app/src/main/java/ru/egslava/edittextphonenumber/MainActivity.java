package ru.egslava.edittextphonenumber;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import br.com.sapereaude.maskededittext.MaskedEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaskedEditText maskedEditText = findViewById(R.id.phone_input);

        maskedEditText.setKeepHint(true);
    }
}
