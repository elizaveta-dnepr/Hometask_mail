package com.layout.liza.hometaskmail;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MailViewHolder> {

    List<Mail> mails;

    @Override
    public MailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mail_view, parent, false);
        MailViewHolder mvh = new MailViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MailViewHolder holder, int position) {
        holder.sender.setText(mails.get(position).sender);
        holder.mailTheme.setText(mails.get(position).mailTheme);
        holder.mailBody.setText(mails.get(position).mailBody);
        holder.icon.setImageResource(mails.get(position).iconId);
    }

    @Override
    public int getItemCount() {
        return mails.size();
    }

    public static class MailViewHolder extends RecyclerView.ViewHolder {

        TextView sender;
        ImageView icon;
        TextView mailTheme;
        TextView mailBody;


        MailViewHolder(View itemView) {
            super(itemView);
            sender = (TextView) itemView.findViewById(R.id.sender);
            mailTheme = (TextView) itemView.findViewById(R.id.mail_theme);
            mailBody = (TextView) itemView.findViewById(R.id.mail_body);
            icon = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }


    RecyclerViewAdapter(List<Mail> mails) {
        this.mails = mails;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}