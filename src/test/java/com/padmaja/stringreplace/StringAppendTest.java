package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.StringBuilder;


import static org.junit.Assert.assertEquals;



 public class StringAppendTest {

     @Test
     public void appendTest1() {

         StringBuilder sb1 =  new StringBuilder();
         sb1.append("JAVA");
         sb1=  sb1.append(new StringAppend("Oracle"));
         System.out.println(sb1);
         StringBuilder sb2 =  new StringBuilder();
         System.out.println(sb2);
        // String expectedresult = "JAVAcom.padmaja.stringreplace.StringAppend@e2144e4";
        // String expectedresult = "JAVAcom.padmaja.stringreplace.StringAppend@2d928643";
        //assertEquals(sb1,sb2);
     }
 }



