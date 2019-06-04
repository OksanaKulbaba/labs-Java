package Lab1;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static Lab1.Lab1.DiferrentAlb;
import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {

    @Test
    void diferrentAlb() throws IOException {

        String s = "Aaaa Fff gfdsa iuyt hyjhg iuytr";

       ArrayList <String> list = DiferrentAlb(s);

       assertEquals("gfdsa", list.get(0));
       assertEquals("iuyt", list.get(1));
       assertEquals("iuytr", list.get(2));



    }
}