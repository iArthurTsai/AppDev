package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    int rows;
    int columns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TableLayout tableLayout2 = findViewById(R.id.tableLayout2);

        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null ){
            rows = Integer.parseInt(bundle.getString("Rows"));
            columns = Integer.parseInt(bundle.getString("Columns"));
            generateTimetable(rows, columns, tableLayout2);

            Toast.makeText(this, "製作好課表後\n請按電源鍵+音量減鍵截圖", Toast.LENGTH_SHORT).show();
        }
    }

    public void button2_Click(View view){
        finish();
    }

    public void generateTimetable(int rows, int columns, TableLayout tableLayout2){

        tableLayout2.removeAllViews(); // Clear existing table content

        for (int i = 0; i <= rows; i++){
            TableRow row = new TableRow(this);

            for (int j = 0; j <= columns; j++){
                EditText editText = new EditText(this);

                if (i == 0 && j == 1) {editText.setText("Mon");}
                if (i == 0 && j == 2) {editText.setText("Tue");}
                if (i == 0 && j == 3) {editText.setText("Wed");}
                if (i == 0 && j == 4) {editText.setText("Thu");}
                if (i == 0 && j == 5) {editText.setText("Fri");}

                if (i == 1 && j == 0) {editText.setText("8:10");}
                if (i == 2 && j == 0) {editText.setText("9:10");}
                if (i == 3 && j == 0) {editText.setText("10:10");}
                if (i == 4 && j == 0) {editText.setText("11:10");}
                if (i == 5 && j == 0) {editText.setText("13:30");}
                if (i == 6 && j == 0) {editText.setText("14:30");}
                if (i == 7 && j == 0) {editText.setText("15:30");}
                if (i == 8 && j == 0) {editText.setText("16:30");}
                if (i == 9 && j == 0) {editText.setText("17:30");}

                row.addView(editText);
            }
            tableLayout2.addView(row);
        }
    }
}