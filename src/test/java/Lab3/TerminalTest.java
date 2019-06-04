package Lab3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {
    Terminal terminal  = new Terminal();
    TicketOffice ticketOffice = new TicketOffice(terminal);

    TreeMap<String,Integer> map = terminal.getTypeStatictic();

    void addcart(){
        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.STUDENT, 5); //1
        terminal.ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 50); //2
        terminal.ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.STUDENT, 10); //3
        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 10);

        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.STUDENT, 10);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 100);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.STUDENT, 30);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 5);

        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD, TypeCard.USUAL, 10);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.DEPOSITCARD, TypeCard.USUAL, 100);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.TERMCARG, TypeCard.USUAL, 30);
        terminal.ticketOffice.addNewCard(TicketOffice.Type.COUNTCARD,TypeCard.SCHOOL, 5);


        for (Map.Entry t: terminal.ticketOffice.listTicket.entrySet()
        ) {
            terminal.checkCard((TravelCard) t.getValue());

        }
    }

    @Test
    void getTypeStatictic() {

       addcart();
       assertEquals(3,(int) map.get("SCHOOL"));
       assertEquals(0,(int) map.get("SCHOOLFalse"));
       assertEquals(3,(int) map.get("SCHOOLTrue"));
       assertEquals(4,(int) map.get("STUDENT"));
       assertEquals(0,(int) map.get("STUDENTFalse"));
       assertEquals(4,(int) map.get("STUDENTTrue"));
       assertEquals(5,(int) map.get("USUAL"));
       assertEquals(0,(int) map.get("USUALFalse"));
       assertEquals(5,(int) map.get("USUALTrue"));

       assertEquals(6,(int) map.get("countCard"));
       assertEquals(0,(int) map.get("countCardFalse"));
       assertEquals(3,(int) map.get("countCardSCHOOL"));
       assertEquals(2,(int) map.get("countCardSTUDENT"));
       assertEquals(6,(int) map.get("countCardTrue"));
       assertEquals(1,(int) map.get("countCardUSUAL"));

       assertEquals(3,(int) map.get("depositCard"));
       assertEquals(0,(int) map.get("depositCardFalse"));
       assertEquals(3,(int) map.get("depositCardTrue"));
       assertEquals(3,(int) map.get("depositCardUSUAL"));

       assertEquals(3,(int) map.get("termCard"));
       assertEquals(0,(int) map.get("termCardFalse"));
       assertEquals(0,(int) map.get("termCardSCHOOL"));
       assertEquals(2,(int) map.get("termCardSTUDENT"));
       assertEquals(1,(int) map.get("termCardUSUAL"));
       assertEquals(3,(int) map.get("termCardTrue"));

    }
    @Test
    void getTypeStatictic1() {

        addcart();
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(1));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(1));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(1));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(1));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(1));

        assertEquals(4,(int) map.get("STUDENT"));
        assertEquals(1,(int) map.get("STUDENTFalse"));
        assertEquals(8,(int) map.get("STUDENTTrue"));
    }
    @Test
    void getTypeStatictic2() {

        addcart();

        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));
        terminal.checkCard((TravelCard) terminal.ticketOffice.listTicket.get(2));


        assertEquals(5,(int) map.get("USUAL"));
        assertEquals(1,(int) map.get("USUALFalse"));
        assertEquals(15,(int) map.get("USUALTrue"));


    }

}