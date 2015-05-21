package com.example.tanveer.assignment_listview;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private ListView listview;
    private List<Datas> listofdatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listtoshow);
        listofdatas =new ArrayList<>();
        for(int i=0;i<30;i++) {
            listofdatas.add(new Datas("ASHES dIVIDE("+i+")", R.drawable.pic1, i++));
            listofdatas.add(new Datas("ALTER BRIDGE("+i+")", R.drawable.pic2, i++));
            listofdatas.add(new Datas("3 DOORS DOWN("+i+")", R.drawable.pic3, i++));
            listofdatas.add(new Datas("PINK FLOYD("+i+")", R.drawable.pic4, i));
        }
        CustomAdapter adapter =new CustomAdapter(this,R.layout.simple_row_item,listofdatas);
        listview.setAdapter(adapter);
    }


}
