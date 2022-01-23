package com.SPMProject.backend;

import java.net.URI;
import java.net.URISyntaxException;

import com.SPMProject.backend.entityModel.OwlThing;
import org.springframework.http.HttpHeaders;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import io.jsonwebtoken.lang.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@SpringBootTest
@ActiveProfiles("test")
public class DeviceTest {
   @Test
   public void testGetEmployeeListSuccess() throws URISyntaxException 
   {
       RestTemplate restTemplate = new RestTemplate();
        
       final String baseUrl = "http://localhost:8080/devices";
       URI uri = new URI(baseUrl);
    
       ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
            
       //Verify request succeed
       System.out.println(result.getBody());

       Assertions.assertEquals(200, result.getStatusCodeValue());
   }

/*

   @Test
    public void testAddEmployeeMissingHeader() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:/save";
        URI uri = new URI(baseUrl);
        Employee employee = new Employee(null, "Adam", "Gilly", "test@email.com");
        
        HttpHeaders headers = new HttpHeaders();
    
        HttpEntity<OwlThing> request = new HttpEntity<>(employee, headers);
        
        try
        {
            restTemplate.postForEntity(uri, request, String.class);
            Assert.fail();
        }
        catch(HttpClientErrorException ex) 
        {
            //Verify bad request and missing header
            Assert.assertEquals(400, ex.getRawStatusCode());
            Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));
        }
    }
    */

}