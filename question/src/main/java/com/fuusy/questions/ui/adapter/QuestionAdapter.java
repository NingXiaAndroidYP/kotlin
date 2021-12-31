package com.fuusy.questions.ui.adapter;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.fuusy.common.utils.ToastUtil;
import com.fuusy.questions.R;
import com.fuusy.questions.bean.QuestionBean;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.VideoHolder> {

    private List<QuestionBean> question;

    public QuestionAdapter(List<QuestionBean> question) {
        this.question = question;
    }

    @Override
    public VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_question, parent, false);
        return new VideoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final VideoHolder holder, int position) {
        QuestionBean item = question.get(position);
        holder.title.setText(item.getTitle());
        holder.tva.setText(item.getA());
        holder.tvb.setText(item.getB());
        holder.tvc.setText(item.getC());
        holder.tvd.setText(item.getD());
        holder.tva.setTextColor(Color.parseColor("#666666"));
        holder.tvb.setTextColor(Color.parseColor("#666666"));
        holder.tvc.setTextColor(Color.parseColor("#666666"));
        holder.tvd.setTextColor(Color.parseColor("#666666"));
        if(item.isSelect()==1){
            setColor(holder.tva);
        }else if(item.isSelect()==2){
            setColor(holder.tvb);
        }else if(item.isSelect()==3){
            setColor(holder.tvc);
        } if(item.isSelect()==4){
            setColor(holder.tvd);
        }
        holder.tva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               item.setSelect(1);
               notifyDataSetChanged();
               if(onItemClick!=null){
                   onItemClick.nextPage();
               }
            }
        });
        holder.tvb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setSelect(2);
                notifyDataSetChanged();
                if(onItemClick!=null){
                    onItemClick.nextPage();
                }
            }
        });
        holder.tvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setSelect(3);
                notifyDataSetChanged();
                if(onItemClick!=null){
                    onItemClick.nextPage();
                }
            }
        });
        holder.tvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setSelect(4);
                notifyDataSetChanged();
                if(onItemClick!=null){
                    onItemClick.nextPage();
                }
            }
        });
        holder.tvMost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onItemClick!=null){
                    onItemClick.prePage();
                }
            }
        });


    }

    public void setColor(TextView textView) {

        textView.setTextColor(Color.parseColor("#29CC40"));
    }

    @Override
    public int getItemCount() {
        return question.size();
    }

    public static class VideoHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView tva;
        private TextView tvb;
        private TextView tvc;
        private TextView tvd;
        private TextView tvMost;

        VideoHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            tva = itemView.findViewById(R.id.tv_a);
            tvb = itemView.findViewById(R.id.tv_b);
            tvc = itemView.findViewById(R.id.tv_c);
            tvd = itemView.findViewById(R.id.tv_d);
            tvMost = itemView.findViewById(R.id.tv_most);

            itemView.setTag(this);
        }
    }

    public interface onItemClick{
        void prePage();
        void nextPage();
    }

    private onItemClick onItemClick;

    public void setOnItemClick(QuestionAdapter.onItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }
}