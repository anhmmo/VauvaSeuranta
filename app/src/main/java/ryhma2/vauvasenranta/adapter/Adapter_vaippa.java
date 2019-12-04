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
import ryhma2.vauvasenranta.model.Vaippa;
import ryhma2.vauvasenranta.sqlite.VaippaDAO;

import java.util.List;

public class Adapter_vaippa extends RecyclerView.Adapter<Adapter_vaippa.ViewHodel> {
    private List<Vaippa> vaippaLista;
    private Context context;
    private OnitemDeleteItem onitemDelete;
    private VaippaDAO vaippaKanta;

    public Adapter_vaippa(List<Vaippa> vaippaLista, Context context, OnitemDeleteItem onitemDelete) {
        this.vaippaLista = vaippaLista;
        this.context = context;
        this.onitemDelete = onitemDelete;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v3 = inflater.inflate(R.layout.item_vaippa,parent,false);
        return new ViewHodel(v3, onitemDelete);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, final int position) {
        vaippaKanta = new VaippaDAO(context);
        holder.tvaika.setText(vaippaLista.get(position).getmAika()+"");
        holder.tvnote.setText(vaippaLista.get(position).getmMuistinpano()+"");
        holder.tvvaippalaji.setText(vaippaLista.get(position).getmVaippaLaji());
        holder.imgDeletevaippa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemDelete.onItemdelete(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return vaippaLista.size();
    }

    public static class ViewHodel extends RecyclerView.ViewHolder{
        public TextView tvvaippalaji;
        public TextView tvnote;
        public TextView tvaika;
        public ImageView imgDeletevaippa;

        public ViewHodel(View itemView, OnitemDeleteItem onitemDeleteDan) {
            super(itemView);
            tvvaippalaji = (TextView) itemView.findViewById(R.id.tv_vaippalaji);
            tvnote = (TextView) itemView.findViewById(R.id.tv_vaippa_note);
            tvaika = (TextView) itemView.findViewById(R.id.tv_vaippa_aika);
            imgDeletevaippa = (ImageView) itemView.findViewById(R.id.img_delete_vaippa);

        }
    }
}
