package Lab3;



public abstract class TravelCard  {
    private TypeCard type;

    public boolean isActive() {
        return active;
    }

    private boolean active;
    private  int number;

    public int getNumber() {
        return number;
    }

    public TypeCard getType() {
        return type;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public TravelCard(TypeCard type, boolean active, int number) {
        this.type = type;
        this.active = active;
        this.number = number;
    }
     abstract boolean useCard();



}
