package com.anncode.aplicacioncontactos.vista.fragment;

import com.anncode.aplicacioncontactos.adapter.ContactoAdaptador;
import com.anncode.aplicacioncontactos.model.Contacto;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public interface IRecyclerViewFragmentView {

    void generarLinearLayoutVertical();

    ContactoAdaptador crearAdaptador(ArrayList<Contacto> contactos);

    void inicializarAdaptadorRV(ContactoAdaptador adaptador);
}
