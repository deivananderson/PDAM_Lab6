package co.edu.pdam.eci.persistenceapiintegration.data.ui.adapter;

import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by estudiante on 3/9/17.
 */


public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.ViewHolder>  {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        

            public ViewHolder(View view){
                super(view);

            }
    }
}
