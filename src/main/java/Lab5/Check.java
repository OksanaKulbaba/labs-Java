package Lab5;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Check extends TreeMap<Goods, Double> {



    public void addGoods(Goods goods) {

        if (!this.containsKey(goods)) {
            this.put(goods, goods.getCount());
        } else {
            this.put(goods, (double) this.get(goods) + goods.getCount());

        }


    }

}



