package Prototype;

import Main.PairDatabase;
import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by Ricardo on 23/03/2016.
 */
public class PrototypeDatabase extends PairDatabase{
    private List list;

    public PrototypeDatabase(@NotNull List prototypeList){
        super();
        this.list = prototypeList;
    }

    public List clone(){
        try {
             return (List)(list.getClass().getMethod("clone",new Class[0]).invoke(list, new Object[0]));
        } catch (Exception e) {e.printStackTrace();}
        return null;
    }

    public void changePrototype(@NotNull List prototypeList){
        this.list = prototypeList;
    }

    @Override
    protected List createList() {
        return clone();
    }
}
