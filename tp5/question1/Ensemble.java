package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        // à compléter pour la question1-1

        if(this.table.contains(t)){
            return false;
        } else {
            this.table.add(t);
            return true;
        } 
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        Ensemble tableUnion = new Ensemble();
       tableUnion.addAll(this);
       tableUnion.addAll(e);
        return tableUnion;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
         Ensemble tableInter = new Ensemble();
         tableInter.addAll(this);
         tableInter.retainAll(e);
        return tableInter; 

       
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        Ensemble tablediff = new Ensemble();
         tablediff.addAll(this);
         tablediff.removeAll(e);
        return tablediff; 
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
         Ensemble tablediffSym = new Ensemble();
        tablediffSym.addAll(this.union(e));
        tablediffSym.removeAll(this.inter(e));
        return tablediffSym; 
    }
    
}
