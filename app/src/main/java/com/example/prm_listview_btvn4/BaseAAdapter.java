package com.example.prm_listview_btvn4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BaseAAdapter extends BaseAdapter {
    private Context context;
    private List<Amongus> list;

    public BaseAAdapter(Context context, List<Amongus> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    //create a blank view and refer to view holder
    //set data for view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //1. create view
        Demo41ViewHolder holder;
        if(convertView==null){//not exist view -> create a new view
            //create a blank view
            convertView= LayoutInflater.from(context)
                    .inflate(R.layout.activity_item_view,parent,false);
            //init the object
            holder=new Demo41ViewHolder();
            holder.img_hinh=convertView.findViewById(R.id.demo41_itemview_hinh);
            holder.tvTen=convertView.findViewById(R.id.demo41_itemview_ten);
            holder.tvTuoi=convertView.findViewById(R.id.demo41_itemview_tuoi);
            //create a template for later
            convertView.setTag(holder);
        }
        else { //exist view -> get old view
            holder=(Demo41ViewHolder) convertView.getTag();
        }
        //2. set data
        Amongus crewmates=list.get(position);//get a object
        holder.img_hinh.setImageResource(crewmates.getProfile());
        holder.tvTen.setText(crewmates.getName());
        holder.tvTuoi.setText(crewmates.getAge());
        return convertView;
    }

    //create a class for refer to components of item view: view holder
    static class Demo41ViewHolder{
        ImageView img_hinh;
        TextView tvTen,tvTuoi;
    }
}
