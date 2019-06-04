package Lab3;


import java.time.LocalDate;

public class termCard  extends TravelCard{


    enum TypeCartTerm{
        D10,
        D30
    }


    private LocalDate dayActivate;
    private LocalDate dayEnd;

    public termCard(TypeCard type, TypeCartTerm term, int number) {
        super(type, true, number);

        dayActivate = LocalDate.now();
       switch (term){
           case D10: dayEnd = dayActivate.plusDays(10); break;
           case D30: dayEnd =dayActivate.plusMonths(1); break;
       }
    }


    @Override
    boolean useCard() {
        if (dayEnd.isAfter(LocalDate.now())){
        return true;}

        return false;
    }

    @Override
    public TypeCard getType() {
        return super.getType();
    }
}