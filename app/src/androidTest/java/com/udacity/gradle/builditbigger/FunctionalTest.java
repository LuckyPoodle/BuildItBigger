package com.udacity.gradle.builditbigger;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class FunctionalTest {
    @Test
    public void iTest() throws Exception {
        EndpointsAsyncTask aTest =  new EndpointsAsyncTask();
        aTest.execute(InstrumentationRegistry.getContext());
        String joke = aTest.get(5, TimeUnit.SECONDS);
        Assert.assertEquals(joke,"Hi laugh at this joke : "+"this is a joke");
    }
}

