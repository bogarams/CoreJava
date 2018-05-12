import java.util.ArrayList;

/**
 * Created by - on 9/4/2017.
 */
//A generic class can take type as a parameter.
//T can be either a class or an interface.
//Can specify multiple outbound with syntax as:
    //<T extends Player & Coach & Manager>  where Player is a class and
    //Coach/MAnager are interfaces
public class P8_2GenericsTeam<T extends P8_2GenericsPlayer> implements Comparable <P8_2GenericsTeam<T>>{

    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;
    private ArrayList<T> members = new ArrayList<>();

    public P8_2GenericsTeam(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if(members.contains(player)) {
            //System.out.println(((P8_2GenericsPlayer) player).getName() + " is already present in the team "+this.name);
            System.out.println(player.getName() + " is already present in the team "+this.name);
            return false;
        }
        else
        {
            members.add(player);
            //Need casting when class accepts unbounded type
            //System.out.println(((P8_2GenericsPlayer) player).getName() + " has been added to the team "+this.name);
            System.out.println(player.getName() + " has been added to the team "+this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    //public void matchResult(P8_2GenericsTeam opponent, int ourScore, int theirScore){
    public void matchResult(P8_2GenericsTeam<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore)
        {
            won++;
        }else if (ourScore == theirScore){
            tied++;
        }else{
            lost++;
        }
        played++;
        if(opponent != null)
        opponent.matchResult(null,theirScore,ourScore);

    }

    public int ranking()
    {
        return (2*won)+tied;
    }

    @Override
    public int compareTo(P8_2GenericsTeam<T> team) {
        if(this.ranking() > team.ranking())
            return -1;
        else if(this.ranking() < team.ranking())
            return 1;
        else
            return 0;
    }
}
