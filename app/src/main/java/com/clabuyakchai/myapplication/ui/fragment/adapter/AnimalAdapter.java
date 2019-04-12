package com.clabuyakchai.myapplication.ui.fragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.clabuyakchai.myapplication.R;
import com.clabuyakchai.myapplication.data.remote.dto.Animal;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalHolder> {

    private List<Animal> animals;

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_item, parent, false);

        return new AnimalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        holder.bind(animals.get(position));
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
        notifyDataSetChanged();
    }

    class AnimalHolder extends RecyclerView.ViewHolder{
        private ImageView picture;
        private TextView title;

        public AnimalHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            title = itemView.findViewById(R.id.title);
        }

        public void bind(Animal animal){
            Picasso.get().load(animal.getUrl())
                    .into(picture);
            title.setText(animal.getTitle());
        }
    }
}
