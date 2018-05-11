package com.example.mirim.agabank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Date;
import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {


    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();


    public ListViewAdapter(){


    }

    @Override
    public int getCount() {

        //Adapter에 사용되는 데이터의 개수를 리턴
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //position에 위차한 데이터를 화면에 출력하는데 사용될 View를 리턴

        final int pos = position;
        final Context context = parent.getContext();


        //"listview item" layout을 inflate하여 converView 참조 획득.

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
            convertView = inflater.inflate(R.layout.listview_item,parent,false);
        }

        TextView dateText = (TextView) convertView.findViewById(R.id.date);
        TextView casehText = (TextView) convertView.findViewById(R.id.cash);
        TextView typeText = (TextView) convertView.findViewById(R.id.type);


        return convertView;

    }


    public void addItem(String date,int cash,String type){


            ListViewItem item = new ListViewItem();

            item.setDate(date);
            item.setCash(cash);
            item.setType(type);


            listViewItemList.add(item);



    }

}
