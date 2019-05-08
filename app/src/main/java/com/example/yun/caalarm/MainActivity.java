package com.example.yun.caalarm;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static Subject[][] schedule = new Subject[6][9];

    GridView mainGv;
    TextView userIdTv;
    ImageView menuBt, taggingBt, infoBt, alarmBt;
    MyAdapter myAdapter;
    ArrayList<Subject> viewData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGv = (GridView)findViewById(R.id.mainGv);
        userIdTv = (TextView)findViewById(R.id.userIdTv);
        menuBt = (ImageView)findViewById(R.id.menuBt);
        taggingBt = (ImageView)findViewById(R.id.taggingBt);
        infoBt = (ImageView)findViewById(R.id.infoBt);
        alarmBt = (ImageView)findViewById(R.id.alarmBt);
        myAdapter = new MyAdapter(this);
        mainGv.setAdapter(myAdapter);
        init();
    }

    /**
     * Set Data
     */
    private void init(){
        viewData.add(new Subject("Java"));
        viewData.add(new Subject("OS"));
        viewData.add(new Subject("DB"));
        viewData.add(new Subject("OSS"));
        viewData.add(new Subject("Algorithm"));
        viewData.add(new Subject("OODP"));

        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.menuBt){

        }else if(v.getId() == R.id.taggingBt){

        }else if(v.getId() == R.id.infoBt){

        }else if(v.getId() == R.id.alarmBt){

        }
    }


    /**
     * Adapter
     */
    public class RowDataViewHolder {
        public TextView titleTvHolder;
    }

    class MyAdapter extends ArrayAdapter {
        LayoutInflater lnf;

        public MyAdapter(Activity context) {
            super(context, R.layout.subject, viewData);
            lnf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return viewData.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return viewData.get(position);
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }
   

        public View getView(int position, View convertView, ViewGroup parent) {
            RowDataViewHolder viewHolder;

            if (convertView == null) {
                convertView = lnf.inflate(R.layout.subject, parent, false);
                viewHolder = new RowDataViewHolder();
                viewHolder.titleTvHolder = (TextView) convertView.findViewById(R.id.titleTv);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (RowDataViewHolder) convertView.getTag();
            }




//            int tempPos = player.posY + (player.posX * 5);



            return convertView;
        }
    }
}
