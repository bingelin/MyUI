package com.binge.util.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by linjb on 2016/8/8.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>  {

    private ArrayList<String> dataList;
    private Context context;

    public interface OnItemClickListener{
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setmOnItemClickListenr(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public MyAdapter(ArrayList<String> dataList , Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        holder.tv.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }



    class MyHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_tv)
        TextView tv;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}

