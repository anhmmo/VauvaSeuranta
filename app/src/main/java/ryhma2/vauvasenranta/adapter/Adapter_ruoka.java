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
import ryhma2.vauvasenranta.model.Ruoka;
import ryhma2.vauvasenranta.sqlite.RuokaDAO;

import java.util.List;
/**
 * <h1>Info class!</h1>
 * This class used to get and send information to RuokaActivity.

 * @author  Au Nguyen
 * @version 1.0
 * @since   10.12.2019
 */
public class Adapter_ruoka extends RecyclerView.Adapter<Adapter_ruoka.ViewHodel>{
    private List<Ruoka> ruokalist;
    private Context context;
    private OnitemDeleteItem onitemDelete;
    private RuokaDAO ruokaTietokanta;

    public Adapter_ruoka(List<Ruoka> ruokalist, Context context, OnitemDeleteItem onitemDelete) {
        this.ruokalist = ruokalist;
        this.context = context;
        this.onitemDelete = onitemDelete;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v3 = inflater.inflate(R.layout.item_ruoka,parent,false);
        return new ViewHodel(v3,onitemDelete);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, final int position) {
        ruokaTietokanta = new RuokaDAO(context);
        holder.tvMuistipano.setText(ruokalist.get(position).getMuistiPano()+"");
        holder.tvRuokaLaji.setText(ruokalist.get(position).getRuokaLaji());
        holder.tvMaitoMaara.setText(ruokalist.get(position).getMaitoMaara()+"");
        holder.tvaika.setText(ruokalist.get(position).getAika());
        holder.imgPoistetaanRuoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onitemDelete.onItemdelete(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ruokalist.size();
    }

    public static class ViewHodel extends RecyclerView.ViewHolder{

        public TextView tvRuokaLaji;
        public TextView tvMaitoMaara;
        public TextView tvMuistipano;
        public TextView tvaika;

        public ImageView imgPoistetaanRuoka;

        public ViewHodel(View itemView, OnitemDeleteItem onitemDeleteDan) {
            super(itemView);
            tvRuokaLaji = (TextView) itemView.findViewById(R.id.tv_laji);
            tvMaitoMaara = (TextView) itemView.findViewById(R.id.tv_maara);
            tvMuistipano = (TextView) itemView.findViewById(R.id.tv_muisti);
            tvaika = itemView.findViewById(R.id.textViewAika);
            imgPoistetaanRuoka = (ImageView) itemView.findViewById(R.id.img_poistetaan);

        }
    }
}
