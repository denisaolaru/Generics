package com.siit.generics;

import java.util.*;

public class OrderedRepository<T> implements IRepository<T> {

    private Set<T> lista = new LinkedHashSet<> ( );

    public OrderedRepository () {
    }

    @Override
    public void save ( T obj ) {
        lista.add ( obj );
    }

    @Override
    public void remove ( T obj ) {
        lista.remove ( obj );

    }

    @Override
    public int count () {
        return lista.size ( );
    }

    @Override
    public Set<T> listAll () {
        return lista;
    }
}
