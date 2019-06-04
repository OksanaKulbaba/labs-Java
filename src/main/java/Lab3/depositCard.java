package Lab3;

public class depositCard extends TravelCard {

    private double deposit;
    private  int countTravel;
    private int costOneTravel=5;

    public depositCard(int number, double deposit) {

        super(TypeCard.USUAL,true, number);
        this.deposit = deposit;
        buyTravel();
    }

  /*  public void setDeposit(int money){
        deposit= deposit + money;
    } */

    public void buyTravel(){
        int posibilTravel;
        if ((deposit/(costOneTravel*0.80)) >40){
            posibilTravel = (int) (deposit/(costOneTravel*0.8));
            deposit = deposit - posibilTravel* (countTravel*0.8);
        }

            else if ((deposit/(costOneTravel*0.85)>20)){
            posibilTravel = (int) (deposit/(costOneTravel*0.85));
            deposit = deposit - (posibilTravel* (costOneTravel*0.85));
        }
            else if ((deposit/(costOneTravel*0.90)>10)){
            posibilTravel = (int) (deposit/(costOneTravel*0.90));

            deposit =  deposit - posibilTravel* (costOneTravel*0.9);

        }
            else {
            posibilTravel = (int) (deposit/(costOneTravel));
            deposit = deposit - posibilTravel* (costOneTravel);
        }
            countTravel += posibilTravel;

        if (countTravel >0){
            super.setActive(true);

        }


    }

    @Override
    boolean useCard() {
        if (!super.isActive() && deposit > costOneTravel ) {
            buyTravel();
        }
        if (!super.isActive()){

            return  false;}

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



