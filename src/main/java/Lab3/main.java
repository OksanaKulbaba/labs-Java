package Lab3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class main
{
    public static void main(String[] args) {

     Terminal terminal = new Terminal();
     TicketOffice ticketOffice = new TicketOffice(terminal);

       ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.STUDENT, 5); // 0
       ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 50);
       ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.STUDENT, 10);
       ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 10);

        ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.STUDENT, 10);
        ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 100);
        ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.STUDENT, 30);
        ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 5);


        ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.USUAL, 10);
        ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 100);
        ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.USUAL, 30);
        ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 5);

        for (Map.Entry t: ticketOffice.listTicket.entrySet()
             ) {
            terminal.checkCard((TravelCard) t.getValue());

        }



        TreeMap<String, Integer> statistic = terminal.getTypeStatictic();


        for (Map.Entry s: statistic.entrySet()){

            System.out.println( s.getKey() + " " + s.getValue());

        }


    }
}
