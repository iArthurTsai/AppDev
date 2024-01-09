package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

//    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextRows = findViewById(R.id.editTextRows);
        final EditText editTextColumns = findViewById(R.id.editTextColumns);
//        Button buttonGenerate = findViewById(R.id.buttonGenerate);
        Button buttonGenerate2 = findViewById(R.id.buttonGenerate2);
//        final TableLayout tableLayout = findViewById(R.id.tableLayout);

//        buttonGenerate.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                int rows = Integer.parseInt(editTextRows.getText().toString());
//                int columns = Integer.parseInt(editTextColumns.getText().toString());
//
//                generateTimetable(rows, columns, tableLayout);
//
//            }
//        });

        buttonGenerate2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //generateTimetable(rows, columns, tableLayout);

                EditText Rows = findViewById(R.id.editTextRows);
                EditText Columns = findViewById(R.id.editTextColumns);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("Rows", Rows.getText().toString());
                bundle.putString("Columns", Columns.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }

//    private void generateTimetable(int rows, int columns,TableLayout tableLayout){
//        tableLayout.removeAllViews(); // Clear existing table content
//
//        for (int i = 0; i <= rows; i++){
//            TableRow row = new TableRow(this);
//
//            for (int j = 0; j <= columns; j++){
//                EditText editText = new EditText(this);
//
//                if (i == 0 && j == 1) {editText.setText("Mon");}
//                if (i == 0 && j == 2) {editText.setText("Tue");}
//                if (i == 0 && j == 3) {editText.setText("Wed");}
//                if (i == 0 && j == 4) {editText.setText("Thu");}
//                if (i == 0 && j == 5) {editText.setText("Fri");}
//
//                if (i == 1 && j == 0) {editText.setText("8:10");}
//                if (i == 2 && j == 0) {editText.setText("9:10");}
//                if (i == 3 && j == 0) {editText.setText("10:10");}
//                if (i == 4 && j == 0) {editText.setText("11:10");}
//                if (i == 5 && j == 0) {editText.setText("13:30");}
//                if (i == 6 && j == 0) {editText.setText("14:30");}
//                if (i == 7 && j == 0) {editText.setText("15:30");}
//                if (i == 8 && j == 0) {editText.setText("16:30");}
//                if (i == 9 && j == 0) {editText.setText("17:30");}
//
//                row.addView(editText);
//            }
//            tableLayout.addView(row);
//        }
//    }
}
