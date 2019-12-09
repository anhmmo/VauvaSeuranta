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

/**
 * <h1>Meista class!</h1>
 * This class used to show information about author.
 * Instance variable <b>vinkkiTiedot</b> create new list for VinkkiLista class.
 * Instance variable <b>context</b> create new Context class instance. (Interface to global information about an application environment. This is an abstract class whose implementation is provided by the Android system. It allows access to application-specific resources and classes, as well as up-calls for application-level operations such as launching activities, broadcasting and receiving intents, etc.)
 *
 * @author  Au Nguyen
 * @version 1.0
 * @since   10.12.2019
 */

public class Adapter_Info extends RecyclerView.Adapter<Adapter_Info.ViewHodel> {
    private List<VinkkiLista> vinkkiTiedot;
    private Context context;

    /**
     * This method is class Contructor.

     */
    public Adapter_Info(List<VinkkiLista> vinkkiTiedot, Context context) {
        this.vinkkiTiedot = vinkkiTiedot;
        this.context = context;
    }


    /**
     * Base class for an Adapter.
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     * Adapters provide a binding from an app-specific data set to views that are displayed within a RecyclerView.
     * @param parent get context
     * @param viewType show list in ViewHolder
     * @return context and list
     */
    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v3 = inflater.inflate(R.layout.adapter_info,parent,false);
        return new ViewHodel(v3, context, (ArrayList<VinkkiLista>) vinkkiTiedot);
    }

    /**
     * set text for item
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     * Adapters provide a binding from an app-specific data set to views that are displayed within a RecyclerView.
     * @param holder get holder
     * @param position get position of item in the list
     * @return context and list
     */

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        holder.nimi.setText(vinkkiTiedot.get(position).getVinkkiNimi());
        holder.tiedot.setText(vinkkiTiedot.get(position).getVinkkiTiedot());
    }

    /**
     * get size of the list
     * @return number element in list
     */
    @Override
    public int getItemCount() {
        return vinkkiTiedot.size();
    }

    /**
     * Contructor of ViewHolder
     */
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


        /**
         * get input then save to databases
         * @param v return view
         */
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
