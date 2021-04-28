package com.example.todo_9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import androidx.test.filters.SmallTest;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumber(){
        double result = mCalculator.ADD(1.111f,1.111d);
        assertThat(result, is(closeTo(2.222, 0.01)));
    }

    @Test
    public void subTwoNumber(){
        double result = mCalculator.SUB(5d, 7d);
        assertThat(result, is(equalTo(-2d)));
    }

    @Test
    public void subWorksWithNegativeResults(){
        double result = mCalculator.SUB(-2d, 1d);
        assertThat(result, is(equalTo(-3d)));
    }

    @Test
    public void mulTwoNumber(){
        double result = mCalculator.MUL(5d, 6d);
        assertThat(result, is(equalTo(30d)));
    }

    @Test
    public void mulTwoNumbersZero(){
        double result = mCalculator.MUL(0d, 5d);
        assertThat(result, is(equalTo(0d)));

    }

    @Test
    public void divTwoNumber(){
        double result = mCalculator.DIV(5d, 1d);
        assertThat(result, is(equalTo(5d)));
    }

    @Test
    public void divTwoNumbersZero(){
        double result = mCalculator.DIV(0d, 2d);
        assertThat(result, is(equalTo(0d)));
    }
}