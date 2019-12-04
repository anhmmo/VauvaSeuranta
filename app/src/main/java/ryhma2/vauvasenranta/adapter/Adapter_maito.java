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
import ryhma2.vauvasenranta.model.MaitoPumppu;
import ryhma2.vauvasenranta.sqlite.MaitoDAO;
import ryhma2.vauvasenranta.sqlite.RuokaDAO;

import java.util.ArrayList;
import java.util.List;

public class Adapter_maito extends RecyclerView.Adapter<Adapter_maito.ViewHodel> {
    private List<MaitoPumppu> maitoa;
    private Context context;
    private OnitemDeleteItem onitemDeleteMaito;
    private RuokaDAO ruoka_databases;
    private MaitoDAO maito_database;

    public Adapter_maito(List<MaitoPumppu> maitoa, Context context, OnitemDeleteItem onitemDeleteMaito) {
        this.maitoa = maitoa;
        this.context = context;
        this.onitemDeleteMaito= onitemDeleteMaito;

    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_maito_pumppa,parent,false);
        return new ViewHodel(v,context,(ArrayList<MaitoPumppu>) maitoa,onitemDeleteMaito);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, final int position) {
        ruoka_databases = new RuokaDAO(context);
        maito_database = new MaitoDAO(context);
        holder.nimi.setText(maitoa.get(position).getMaitoNimet());
        holder.maara.setText(maitoa.get(position).getMaitoMaara()+"");
        holder.textit.setText(maitoa.get(position).getMaitoNote());
        //when user click delete icon, item will be deleted
        holder.poistetaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemDeleteMaito.onItemdelete(position);
            }
        });
        int maarat = Integer.parseInt(holder.maara.getText().toString());
        int kq = (800-maarat);
        holder.summa.setText(String.valueOf(kq));

    }

    @Override
    public int getItemCount() {
        return maitoa.size();
    }

    public static class ViewHodel extends RecyclerView.ViewHolder implements View.OnClickListener{
    public ImageView luku, poistetaan;
    public TextView nimi, textit, summa, maara;
    ArrayList<MaitoPumppu> maidot = new ArrayList<>();

    Context context;
        public ViewHodel(View itemView, Context context, ArrayList<MaitoPumppu> maidot, OnitemDeleteItem onitemDeleteDan) {
            super(itemView);
            this.context = context;
            this.maidot = maidot;
            itemView.setOnClickListener(this);

            luku = itemView.findViewById(R.id.img_dan);
            poistetaan = itemView.findViewById(R.id.img_poistaa);
            nimi = itemView.findViewById(R.id.img_nimet);
            textit = itemView.findViewById(R.id.tinhtrangdan);
            summa = itemView.findViewById(R.id.luongcam_dan);
            maara = itemView.findViewById(R.id.tv_soluongdan);
        }

        @Override
        public void onClick(View v) {


        }
    }

}
