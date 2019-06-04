package Lab5;



public class Goods implements Comparable {
    String name;
    double price;
    double count;


    public Goods(String name, double price, double count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    @Override
    public int compareTo(Object o) {

        if(this.name.compareToIgnoreCase(((Goods)o).name)==0 && this.price != ((Goods)o).price)
        {return  -1;}
        else
           return this.name.compareToIgnoreCase(((Goods)o).name);
    }
   }
