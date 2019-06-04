package Lab5;



import java.sql.SQLOutput;
import java.util.Map;

public class Cash   {
    Check check = new Check();

    int summ;
     public void printCheck(){



      for(Map.Entry<Goods, Double> entry: check.entrySet() ){
          Goods goods   = (Goods)entry.getKey();

          System.out.printf("%10s  %10s    %5.2f \n", goods.name, goods.price, (double)entry.getValue()*goods.price);
            summ += (double)entry.getValue()*goods.price;
      }
         System.out.println("Итого:                   " + summ);

     }
}
