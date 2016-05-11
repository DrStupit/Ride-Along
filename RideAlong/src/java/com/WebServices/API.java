/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.WebServices;

import com.Model.UserPojo;
import com.Model.userDAO;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Kielaen
 */
@RestController
public class API {
    ApplicationContext r = new ClassPathXmlApplicationContext("../../WEB-INF/applicationContext.xml");
     
    userDAO c  = (userDAO)r.getBean("c");
     
    @RequestMapping(value="/ViewAllMembers", method=RequestMethod.GET, headers="Accept=application/json")
    
    public List <UserPojo> getAll()
    {
        List<UserPojo> member = (List<UserPojo>) c.getUsers();       //String message = "world!";
        return member;
    }
    
    @RequestMapping(value="/ViewAllMembers/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public UserPojo getUserByID(@PathVariable("id") int id){
        System.out.println("Fetching user with id "+id);
        
        UserPojo users = c.getById(id);
        
        if(users == null)
        {
            System.out.println("User with ID "+id+" not found");
        }
        return users;
    }
      @RequestMapping(value="/RegUser", method = RequestMethod.POST,headers="Accept=application/json")
     public ResponseEntity<UserPojo> addmembers(@RequestBody UserPojo l, UriComponentsBuilder ucBuilder)
     {
        c.saveUser(l);
  
         HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/RegUser/{id}").buildAndExpand(l.getUserId()).toUri());
        return new ResponseEntity<UserPojo>(headers, HttpStatus.CREATED);
    }

      
}
