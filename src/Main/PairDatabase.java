package Main;


import java.util.HashMap;
import java.util.List;

/**
 * Created by Ricardo on 23/03/2016.
 */
public abstract class PairDatabase{
    private HashMap<Integer, List<Integer>> pairs;


    public PairDatabase(){
        pairs = new HashMap<>();
    }

    protected abstract List createList();

    public void put(int number1, int number2){
        if(pairs.containsKey(number1)){
            pairs.get(number1).add(number2);
        } else {
            List list = createList();
            list.add(number2);
            pairs.put(number1,list);
        }
    }

    public List<Integer> getValue(int number1){
        return pairs.get(number1);
    }
}
