package Lab3;



import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public  class Terminal {
    public void setTicketOffice(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    TicketOffice ticketOffice;

    public TreeMap<String, Integer> getTypeStatictic() {
        return typeStatictic;
    }

    TreeMap<String, Integer> typeStatictic = new TreeMap<>();

    public Terminal() {

        typeStatictic.put("countCard",0);
        typeStatictic.put("depositCard",0);
        typeStatictic.put("termCard",0);

        typeStatictic.put("STUDENT",0);
        typeStatictic.put("USUAL",0);
        typeStatictic.put("SCHOOL",0);

        typeStatictic.put("countCardSTUDENT",0);
        typeStatictic.put("countCardUSUAL",0);
        typeStatictic.put("countCardSCHOOL",0);

        typeStatictic.put("depositCardUSUAL",0);

        typeStatictic.put("termCardSTUDENT",0);
        typeStatictic.put("termCardUSUAL",0);
        typeStatictic.put("termCardSCHOOL",0);

        typeStatictic.put("countCardTrue",0);
        typeStatictic.put("depositCardTrue",0);
        typeStatictic.put("termCardTrue",0);

        typeStatictic.put("STUDENTTrue",0);
        typeStatictic.put("USUALTrue",0);
        typeStatictic.put("SCHOOLTrue",0);


        typeStatictic.put("countCardFalse",0);
        typeStatictic.put("depositCardFalse",0);
        typeStatictic.put("termCardFalse",0);

        typeStatictic.put("STUDENTFalse",0);
        typeStatictic.put("USUALFalse",0);
        typeStatictic.put("SCHOOLFalse",0);
    }


    public void  checkCard(TravelCard travelCard){
        boolean canUse =false;
        String tempType = "";
        String tempClass  = "";
        String tempClassType = "";
        String tempType2  ="";
        String tempClass2 = "";
        if (ticketOffice.listTicket.containsKey(travelCard.getNumber())) {
            canUse = travelCard.useCard();

            tempType = "" + travelCard.getType();
            tempClass = "" + travelCard.getClass().getSimpleName();
            tempClassType = "" + tempClass + tempType;


            if (canUse) {
                tempType2 = tempType + "True";
                tempClass2 = tempClass + "True";

            } else {
                tempType2 = tempType + "False";
                tempClass2 = tempClass + "False";
            }
        }


        typeStatictic.put(tempType2, (Integer) typeStatictic.get(tempType2) +1);
        typeStatictic.put(tempClass2, (Integer) typeStatictic.get(tempClass2) +1);



    }




}
