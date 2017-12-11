package com.example.tuong.ardapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tuong.hotuongcoffeemanager.R;
import com.example.tuong.model.coffeeTable;

import java.util.List;

/**
 * Created by tuong on 12/11/2017.
 */

public class AdapterCoffeeTable extends ArrayAdapter<coffeeTable> {
    Activity context;
    int resource;
    List<coffeeTable> objects;
    public AdapterCoffeeTable(@NonNull Activity context, int resource, @NonNull List<coffeeTable> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);

        TextView items_txtNameTable = row.findViewById(R.id.items_txtNameTable);
        TextView items_txtInformation = row.findViewById(R.id.items_txtInformation);
        ImageView items_btnPeople = row.findViewById(R.id.items_btnPeople);
        ImageView items_btnLabourer = row.findViewById(R.id.items_btnLabourer);
        Button items_btnSeatReservation = row.findViewById(R.id.items_btnSeatReservation);
        Button items_btnEmptyTable = row.findViewById(R.id.items_btnEmptyTable);

        final coffeeTable coffeeTable =  this.objects.get(position);
        items_txtNameTable.setText(coffeeTable.getNameTable());

        if(coffeeTable.getHavePeople()){
            items_btnEmptyTable.setVisibility(View.INVISIBLE);
            items_btnSeatReservation.setVisibility(View.INVISIBLE);
            items_btnLabourer.setVisibility(View.INVISIBLE);
            items_btnPeople.setVisibility(View.VISIBLE);
        }
        else if(coffeeTable.getLabourer()){
            items_btnEmptyTable.setVisibility(View.INVISIBLE);
            items_btnSeatReservation.setVisibility(View.INVISIBLE);
            items_btnPeople.setVisibility(View.INVISIBLE);
            items_btnLabourer.setVisibility(View.VISIBLE);
        }
        else if(coffeeTable.getEmplyTable()){
            items_btnLabourer.setVisibility(View.INVISIBLE);
            items_btnSeatReservation.setVisibility(View.INVISIBLE);
            items_btnPeople.setVisibility(View.INVISIBLE);
            items_btnEmptyTable.setVisibility(View.VISIBLE);
        }
        else if(coffeeTable.getSeatReservation()){
            items_btnEmptyTable.setVisibility(View.INVISIBLE);
            items_btnLabourer.setVisibility(View.INVISIBLE);
            items_btnPeople.setVisibility(View.INVISIBLE);
            items_btnSeatReservation.setVisibility(View.VISIBLE);
        }
        return row;
    }
}
