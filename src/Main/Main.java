package Main;

import Factory.LLDatabase;
import Prototype.PrototypeDatabase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ricardo on 23/03/2016.
 */
public class Main {
    public static void main(String[] args){
        PairDatabase pairDatabase = new LLDatabase();

        pairDatabase.put(1,2);
        pairDatabase.put(1,5);
        pairDatabase.put(1,1);
        pairDatabase.put(5,3);

        System.out.println(pairDatabase.getValue(1));
        System.out.println(pairDatabase.getValue(5));

        PrototypeDatabase prototypeDatabase = new PrototypeDatabase(new ArrayList<>());

        prototypeDatabase.put(1,1);
        prototypeDatabase.put(1,5);
        prototypeDatabase.put(1,2);
        prototypeDatabase.changePrototype(new LinkedList<>());
        prototypeDatabase.put(5,3);
        System.out.println(prototypeDatabase.getValue(1).getClass());
        System.out.println(prototypeDatabase.getValue(5).getClass());
    }
}
