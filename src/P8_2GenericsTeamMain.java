import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by - on 9/4/2017.
 */
public class P8_2GenericsTeamMain {

    public static void main(String[] args) {
        P8_2GenericsBaseballPlayer b1 =  new P8_2GenericsBaseballPlayer("b1");
        P8_2GenericsFootballPlayer f1 =  new P8_2GenericsFootballPlayer("f1");
        P8_2GenericsSoccerPlayer s1 =  new P8_2GenericsSoccerPlayer("s1");

        P8_2GenericsTeam t1f = new P8_2GenericsTeam("t1f"); //Team t1 of football players.
        t1f.addPlayer(b1);
        //Here when P8_2GenericsTeam is non generic type, it can be added any type of player.
        //t1f.addPlayer(f1);
        //t1f.addPlayer(s1);

        //When P8_2GenericsTeam is made as generic then it can accept only the instances of
        //the particular type of player where such type is passed to this class.
        //When we declare class P8_2GenericsTeam as  P8_2GenericsTeam<T> then it is a
        // unbounded type Generic class. When we declare as P8_2GenericsTeam<T extends Player> then it
        //called bounded type Generic class, where it accepts any type of class which has
        // extended the Player class.
        System.out.println(t1f.numPlayers());

        //A generic class can still be used without passing type to it.
        P8_2GenericsTeam t1b = new P8_2GenericsTeam("t1b");
        t1b.addPlayer(b1);
        System.out.println(t1b.numPlayers());

        //t2b can only accept baseball players now
        P8_2GenericsTeam<P8_2GenericsBaseballPlayer> t2b = new P8_2GenericsTeam<>("t2b");
        t2b.addPlayer(b1);
        System.out.println(t2b.numPlayers());

        //If P8_2GenericsTeam has been defined as unbounded type then it can accept any type
        //not just player class type.
        //P8_2GenericsTeam<String> tfails = new P8_2GenericsTeam<>("tfails");
        //Throws runtime exception Exception in thread "main" java.lang.ClassCastException:
        // java.lang.String cannot be cast to P8_2GenericsPlayer
        //tfails.addPlayer("Player String");
        //System.out.println(tfails.numPlayers());

        //To restrict a Generic class to accept only certain type of classes as types,we should
        //declare the Generic class as bounded type. i.e.,  P8_2GenericsTeam<T extends Player>
        P8_2GenericsTeam<P8_2GenericsSoccerPlayer> t1s = new P8_2GenericsTeam<>("t1s");
        t1s.addPlayer(s1);
        System.out.println(t1s.numPlayers());

        t1b.matchResult(t2b,10,11);

        System.out.println("Rankings:");
        System.out.println("t1b : "+t1b.ranking());
        System.out.println("t2b : "+t2b.ranking());
        System.out.println("t1s : "+t1s.ranking());
        System.out.println("t1f : "+t1f.ranking());
        //System.out.println("t1b : "+t1b.ranking());

        //Collection.sort method accepts a collection and expects
        // the contained object to implement compareTo function
        //Collection.sort returns sorted of list of objects
        System.out.println(t2b.compareTo(t1b));
        System.out.println(t1b.compareTo(t2b));
        ArrayList<P8_2GenericsTeam> listb = new ArrayList<>();
        listb.add(t1b);
        listb.add(t2b);
        for(P8_2GenericsTeam o : listb)
        {
            System.out.println(o.ranking()+" : "+o.getName());
        }
        Collections.sort(listb);
        for(P8_2GenericsTeam o : listb)
        {
            System.out.println(o.ranking()+" : "+o.getName());
        }
    }
}
