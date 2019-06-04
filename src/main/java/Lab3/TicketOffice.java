package Lab3;


import java.util.HashMap;

public class TicketOffice {
    enum Type{
        COUNTCARD,
        TERMCARG,
        DEPOSITCARD
    }

  Terminal terminal;

    public TicketOffice(Terminal terminal) {
        this.terminal = terminal;
        terminal.setTicketOffice(this);
    }

    HashMap <Integer, ? super TravelCard> listTicket = new HashMap<>();
    private  int countCard= 1;

    public void addNewCard(Type type, TypeCard typeCard, int typeCard2) {

        TravelCard travelCard = null;
        switch (type) {
            case TERMCARG: {

                if (typeCard2 == 10) {
                    travelCard = new termCard(typeCard, termCard.TypeCartTerm.D10, countCard);

                } else {
                    travelCard = new termCard(typeCard, termCard.TypeCartTerm.D30, countCard);
                }

                break;


            }
            case COUNTCARD: {
                if (typeCard2 == 5) {
                    travelCard = new countCard(typeCard, Lab3.countCard.TypeCartCounnt.T5, countCard);
                } else {
                    travelCard = new countCard(typeCard, Lab3.countCard.TypeCartCounnt.T10, countCard);
                }

                break;
            }
            case DEPOSITCARD: {
                travelCard = new depositCard(countCard, typeCard2);
                break;
            }


        }
        listTicket.put(countCard++, travelCard);

            String tempType = "";
            String tempClass = "";
            String tempClassType = "";
            String tempType2 = "";
            String tempClass2 = "";



            tempType = "" + travelCard.getType();
            tempClass = "" + travelCard.getClass().getSimpleName();
            tempClassType = "" + tempClass + tempType;
            terminal.typeStatictic.put(tempType, (Integer) terminal.typeStatictic.get(tempType) + 1);
            terminal.typeStatictic.put(tempClass, (Integer) terminal.typeStatictic.get(tempClass) + 1);
            terminal.typeStatictic.put(tempClassType, (Integer) terminal.typeStatictic.get(tempClassType) + 1);
           // terminal.typeStatictic.put(tempType2, (Integer) terminal.typeStatictic.get(tempType2) + 1);
            //terminal.typeStatictic.put(tempClass2, (Integer) terminal.typeStatictic.get(tempClass2) + 1);



    }

}
