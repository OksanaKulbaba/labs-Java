package Lab3;

public class countCard extends TravelCard {

    enum TypeCartCounnt{
        T5,
        T10
    }

    private int countTravel;

    public countCard( TypeCard type, TypeCartCounnt typeCart, int number) {

        super(type, true, number);
       switch (typeCart){

           case T10: countTravel =10; break;
           case T5: countTravel =5; break;
       }


    }

    @Override
    boolean useCard() {
        if (!super.isActive()){
            return false;
        }
        else {
            countTravel--;
            if (countTravel ==0){super.setActive(false);}
            return true;
        }


    }

    @Override
    public TypeCard getType() {
        return super.getType();
    }
}
