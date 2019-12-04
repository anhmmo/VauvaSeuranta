package ryhma2.vauvasenranta.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ryhma2.vauvasenranta.base.VinkkiActivity;
import ryhma2.vauvasenranta.R;
import ryhma2.vauvasenranta.model.VinkkiLista;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Info extends RecyclerView.Adapter<Adapter_Info.ViewHodel> {
    private List<VinkkiLista> vinkkiTiedot;
    private Context context;

    public Adapter_Info(List<VinkkiLista> vinkkiTiedot, Context context) {
        this.vinkkiTiedot = vinkkiTiedot;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v3 = inflater.inflate(R.layout.adapter_info,parent,false);
        return new ViewHodel(v3, context, (ArrayList<VinkkiLista>) vinkkiTiedot);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        holder.nimi.setText(vinkkiTiedot.get(position).getVinkkiNimi());
        holder.tiedot.setText(vinkkiTiedot.get(position).getVinkkiTiedot());
    }

    @Override
    public int getItemCount() {
        return vinkkiTiedot.size();
    }

    public static class ViewHodel extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView nimi,tiedot;
    ArrayList<VinkkiLista> vinkkiTiedot = new ArrayList<>();
    Context context;
        public ViewHodel(View itemView, Context context, ArrayList<VinkkiLista> vinkkiTiedot) {
            super(itemView);
            this.vinkkiTiedot = vinkkiTiedot;
            nimi = itemView.findViewById(R.id.tv_VinkkiNimi);
            tiedot = itemView.findViewById(R.id.tv_VinkkiTiedot);
            itemView.setOnClickListener(this);
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            VinkkiLista tarkkaTiedot = this.vinkkiTiedot.get(position);
            Intent intent = new Intent(this.context, VinkkiActivity.class);
            intent.putExtra("vinkkiNimi", tarkkaTiedot.getVinkkiNimi());
            intent.putExtra("vinkkiTiedot", tarkkaTiedot.getVinkkiTiedot());
            context.startActivity(intent);
        }
    }
}
