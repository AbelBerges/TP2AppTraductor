package com.desarrollo.apptraducir;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class TraductorViewModel extends ViewModel {
    private MutableLiveData<Palabra> traducida = new MutableLiveData<>();
    private ArrayList<Palabra> listado = new ArrayList<>();

    public TraductorViewModel(){
        listado.add(new Palabra("casa","House",R.drawable.casa));
        listado.add(new Palabra("perro", "Dog",R.drawable.dog));
        listado.add(new Palabra("manzana","Apple",R.drawable.manzana));
        listado.add(new Palabra("gato","Cat",R.drawable.gatito));
        listado.add(new Palabra("conejo","Rabbit",R.drawable.conejito));
        listado.add(new Palabra("sfadi@#@","No matches found",R.drawable.defaulf));
    }

    public LiveData<Palabra> getTraducida(){
        return this.traducida;
    }

    public void Traducir(String laPalabra){
        boolean encontrada = false;
        for (int i = 0;i < listado.size();i++){
            if(laPalabra.equalsIgnoreCase(listado.get(i).getEnEsp())){
                traducida.setValue(listado.get(i));
                encontrada = true;
            }
        }
        if(!encontrada){
            traducida.setValue(listado.get(5));
        }
    }
}
