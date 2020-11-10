package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import assignment.App;

public class Tests {


   @Test
   public void testAdd(){
       App.main(null);
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
       assertEquals(2, App.add(1, 1), "Addition failed");
   }

    @Test
   public void testSubtract(){
       App.main(null);
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
       assertEquals(2, App.subtract(), "Addition failed");
   }

    @Test
   public void testAdd(){
       App.main(null);
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
       assertEquals(2, App.add(), "Addition failed");
   }

    @Test
   public void testAdd(){
       App.main(null);
       //assertEquals(EXPECTED RESULT, App.METHODtoTEST, "ERROR MESSAGE");
       assertEquals(2, App.add(), "Addition failed");
   }

}
