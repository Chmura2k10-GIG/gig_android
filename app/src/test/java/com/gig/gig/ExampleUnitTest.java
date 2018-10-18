package com.gig.gig;

import org.junit.Test;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void springTest(){
        String url = "https://ajax.googleapis.com/ajax/" +
                "services/search/web?v=1.0&q={query}";
        // Create a new RestTemplate instance
                RestTemplate restTemplate = new RestTemplate();

        // Add the String message converter
                restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        // Make the HTTP GET request, marshaling the response to a String
                String result = restTemplate.getForObject(url, String.class, "Android");
    }
}

