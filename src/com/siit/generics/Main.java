package com.siit.generics;

public class Main {
    public static void main ( String args[] ) {

        sortedRepository ( );
        System.out.println ( );
        orderedRepo ( );
    }

    private static void orderedRepo () {
        IRepository<Integer> orderedRepository = new OrderedRepository<Integer> ( );
        orderedRepository.save ( 23 );
        orderedRepository.save ( 1 );
        orderedRepository.save ( 56 );
        orderedRepository.save ( 12 );
        orderedRepository.save ( 34 );
        orderedRepository.save ( 13 );

        orderedRepository.remove ( 13 );

        System.out.println ( "The ordered Repo length is: " + orderedRepository.count ( ) );
        System.out.println ( "The ordered Repo is: "+ orderedRepository.listAll ( ) );
    }

    private static void sortedRepository () {
        IRepository<Integer> sortedRepository = new SortedRepository<Integer> ( );

        sortedRepository.save ( 23 );
        sortedRepository.save ( 11 );
        sortedRepository.save ( 100);
        sortedRepository.save ( 1 );

        sortedRepository.remove ( 100 );

        System.out.println ( "The sorted Repo length is: " + sortedRepository.count ( ) );
        System.out.println ( "The sorted Repo is: " + sortedRepository.listAll ( ) );
    }


}
