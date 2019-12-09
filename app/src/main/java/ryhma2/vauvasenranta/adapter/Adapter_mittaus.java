package ryhma2.vauvasenranta.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.interface1.OnitemDeleteItem;
import ryhma2.vauvasenranta.model.Mittaus;

import java.util.List;

/**
 * <h1>Info class!</h1>
 * This class used to get and send information to MittausActivity.

 * @author  Au Nguyen
 * @version 1.0
 * @since   10.12.2019
 */

public class Adapter_mittaus extends RecyclerView.Adapter<Adapter_mittaus.ViewHodel> {
    private List<Mittaus> mittausList;
    private Context context;
    private OnitemDeleteItem onitemDelete;

    public Adapter_mittaus(List<Mittaus> mittausList, Context context, OnitemDeleteItem onitemDelete) {
        this.mittausList = mittausList;
        this.context = context;
        this.onitemDelete = onitemDelete;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v3 = inflater.inflate(R.layout.item_mittaus,parent,false);
        return new ViewHodel(v3);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, final int position) {
        holder.tvGetPaino.setText(mittausList.get(position).getPaino()+"");
        holder.tvGetPituus.setText(mittausList.get(position).getPituus()+"");
        holder.tvaika.setText(mittausList.get(position).getAika());
        holder.tvGetMittausNote.setText(mittausList.get(position).getMittausNote());
        holder.imgPoistetaanKuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemDelete.onItemdelete(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mittausList.size();
    }

    public static class ViewHodel extends RecyclerView.ViewHolder{

        public TextView tvGetMittausNote;
        public TextView tvGetPituus;
        public TextView tvGetPaino;
        public ImageView imgPoistetaanKuva;
        public TextView tvaika;


        public ViewHodel(View itemView) {
            super(itemView);

            tvGetMittausNote = (TextView) itemView.findViewById(R.id.tv_mittausnote);
            tvGetPituus = (TextView) itemView.findViewById(R.id.tv_pituus);
            tvGetPaino = (TextView) itemView.findViewById(R.id.tv_paino);
            imgPoistetaanKuva = (ImageView) itemView.findViewById(R.id.img_deleteMittaus);
            tvaika = itemView.findViewById(R.id.txtMittausAika);
        }
    }
}
