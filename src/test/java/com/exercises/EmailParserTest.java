package com.exercises;

import org.junit.Assert;
import org.junit.Test;

public class EmailParserTest {

    @Test
    public void name() {
        EmailParser m = new EmailParser();

        String result = m.predict("Google", "Sundar Pichai");

        Assert.assertEquals(result, "s.pichai@google.com");
    }
}