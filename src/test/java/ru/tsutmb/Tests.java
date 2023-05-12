package ru.tsutmb;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    Calculate calculate = new Calculate();
    @Test
    void Test1(){
        double x = 1;
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(this.calculate.Work(x)), "0,52359878");
    }

    @Test
    void Test2(){
        double x = 1.5;
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(this.calculate.Work(x)), "-0,18026182");
    }

    @Test
    void Test3(){
        double x = 2.5;
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(this.calculate.Work(x)), "-0,15566498");
    }
}
