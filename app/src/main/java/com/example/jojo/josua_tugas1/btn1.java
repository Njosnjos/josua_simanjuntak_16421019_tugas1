package com.example.jojo.josua_tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class btn1 extends AppCompatActivity {

    EditText ednpm,ednama,eduniv,edfak,edprodi;
    TextView tvnpm,tvnama,tvuniv,tvfak,tvprodi;
    Button input ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);

        ednpm   = (EditText) findViewById (R.id.npm);
        ednama  = (EditText) findViewById (R.id.nama);
        eduniv  = (EditText) findViewById (R.id.univ);
        edfak   = (EditText) findViewById (R.id.fak);
        edprodi = (EditText) findViewById (R.id.prodi);

        tvnpm   = (TextView) findViewById (R.id.tdnpm);
        tvnama  = (TextView) findViewById (R.id.tdnama);
        tvuniv  = (TextView) findViewById (R.id.tduniv);
        tvfak   = (TextView) findViewById (R.id.tdfak);
        tvprodi = (TextView) findViewById (R.id.tdprodi);

        input   = (Button) findViewById (R.id.btnsave);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txtnpm,txtnama,txtuniv,txtfak,txtprodi;
                txtnpm   = ednpm.getText().toString();
                txtnama  = ednama.getText().toString();
                txtuniv  = eduniv.getText().toString();
                txtfak   = edfak.getText().toString();
                txtprodi = edprodi.getText().toString();

                tvnpm.setText(txtnpm);
                tvnama.setText(txtnama);
                tvuniv.setText(txtuniv);
                tvfak.setText(txtfak);
                tvprodi.setText(txtprodi);
            }
        });
    }
}
