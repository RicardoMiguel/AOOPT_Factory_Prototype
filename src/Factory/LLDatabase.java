package Factory;

import Main.PairDatabase;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ricardo on 23/03/2016.
 */
public class LLDatabase extends PairDatabase{

    @Override
    protected List createList() {
        return new LinkedList<>();
    }
}
