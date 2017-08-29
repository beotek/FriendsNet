package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Set;

import javax.transaction.Transactional;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerIT {

    @LocalServerPort
    private int port;

    @Autowired
    private PersonDAO dao;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    private ObjectMapper mapper;

    @Before
    public void setup() {

//    	Iterable<Person> persons = dao.findAll();
//    	for(Person person: persons) {
//    		dao.remove(person);
//    	}
    	
        this.mapper = new ObjectMapper();
      
    }


    @Test
    public void testFindAllNoContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[]", response.getBody(), false);
    }

    @Test
    public void testFindAllWithContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        Person person = new Person();
        person.setName("taka");
        person.setSurname("toko");
        dao.save(person);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{'id': 1, 'name': 'taka', 'surname':'toko'} ]", response.getBody(), false);
    }
    
  @Test
  public void findById() {
	  
	  
  }
  
  @Test
  public void testCreate() throws JSONException {
     
	  Person person = new Person();
	  person.setName("taka");
	  person.setSurname("TAKA");
	  
	  HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);
	  
	  // Act
      ResponseEntity<String> response = restTemplate.exchange(
              createURLWithPort("/person"),
              HttpMethod.POST, entity, String.class);

      // Assert
      JSONAssert.assertEquals("{'id': 1, 'name': 'taka', 'surname':'TAKA'} ", response.getBody(), false);
	  
  }
  
  @Test
  public void testFindById() {
	  
  }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
