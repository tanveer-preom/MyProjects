package com.example.tanveer.assignment_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Tanveer on 5/21/2015.
 */
public class CustomAdapter extends ArrayAdapter implements View.OnClickListener {
    private List<Datas> datalist;
    private Context mainActivity;

    public CustomAdapter(Context context, int resource,List<Datas> list) {
        super(context, R.layout.simple_row_item);
        datalist=list;
        mainActivity=context;
    }

    @Override
    public int getCount() {
        return datalist.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =convertView;
        if(view==null)
        {
            LayoutInflater inflater=LayoutInflater.from(mainActivity);
            view=inflater.inflate(R.layout.simple_row_item,parent,false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(datalist.get(position).getPic());
        TextView tv = (TextView) view.findViewById(R.id.texts);
        tv.setText(datalist.get(position).getText());
        Button btn= (Button) view.findViewById(R.id.listbutton);
        btn.setOnClickListener(this);
        btn.setTag(datalist.get(position));
        return view;
    }

    @Override
    public void onClick(View v) {
        Datas dataToshow = (Datas) v.getTag();
        Toast.makeText(mainActivity,"At Postion "+dataToshow.getPositon()+" text : "+dataToshow.getText(),Toast.LENGTH_LONG).show();

    }
}
