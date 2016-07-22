package Factory;

import Main.PairDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo on 23/03/2016.
 */
public class ALDatabase extends PairDatabase {

    @Override
    protected List createList() {
        return new ArrayList<>();
    }
}
