package com.siit.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedRepository<T> implements IRepository<T> {


    private Set<T> sortedList = new TreeSet<T> ( );

    public SortedRepository () {

    }


    @Override
    public void save ( T obj ) {
        sortedList.add ( obj );
    }

    @Override
    public void remove ( T obj ) {
        sortedList.remove ( obj );

    }

    @Override
    public int count () {

        return sortedList.size ( );
    }

    @Override
    public Set<T> listAll () {

        return sortedList;
    }
}
