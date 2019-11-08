package com.vn.edu.poly.bieudocot;



import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("SetJavaScriptEnabled")

public class MainActivity extends AppCompatActivity {


    ArrayList<BarEntry> BARENTRY ;
    ArrayList<String> BarEntryLabels ;
    BarDataSet Bardataset ;
    BarData BARDATA ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart barChart = (BarChart) findViewById(R.id.barchart);

        BARENTRY = new ArrayList<>();

        BarEntryLabels = new ArrayList<String>();

        AddValuesToBARENTRY();

        AddValuesToBarEntryLabels();

        Bardataset = new BarDataSet(BARENTRY, "Projects");

        BARDATA = new BarData(BarEntryLabels, Bardataset);

        Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        barChart.setData(BARDATA);

        barChart.animateY(3000);


    }
    public void AddValuesToBARENTRY(){

        BARENTRY.add(new BarEntry(20f, 0));
        BARENTRY.add(new BarEntry(10f, 1));
        BARENTRY.add(new BarEntry(55f, 2));
        BARENTRY.add(new BarEntry(15f, 3));


    }
    public void AddValuesToBarEntryLabels(){

        BarEntryLabels.add("A");
        BarEntryLabels.add("B");
        BarEntryLabels.add("C");
        BarEntryLabels.add("D");


    }


}