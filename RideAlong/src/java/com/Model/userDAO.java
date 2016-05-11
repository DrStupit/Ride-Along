/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author accenture4
 */
public class userDAO
{
     HibernateTemplate template; 
   
   
public void setTemplate(HibernateTemplate template)
{  
    this.template = template;  
    this.template.setCheckWriteOperations(false);
}  
public void updateforce (UserPojo l)
{
  Session session= null; 
   SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
   session =sessionFactory.openSession();
  session.beginTransaction(); 

    session.update(l);
    session.getTransaction().commit();
    session.flush();
    session.close();
}

//method to save employee  
public void saveUser(UserPojo l)
{  
    template.save(l);  
}  

//method to update employee  
public void updateUser(UserPojo l)
{  
    template.update(l);  
}  

//method to delete employee  
public void deleteUser(UserPojo l){  
    
    template.delete(l);
    
}  


//method to return one employee of given id  

public UserPojo getById(int id)
{  
    UserPojo e=(UserPojo)template.get(UserPojo.class,id);  
    return e;  
} 
 
//method to return all employees  
public List<UserPojo> getUsers()
{  
    List<UserPojo> list=new ArrayList<UserPojo>();  
    list=template.loadAll(UserPojo.class);  
    return list;  
}

public  List<Object> getSpecific(String name, String pwd)
{
    List<Object> list=new ArrayList<Object>();
    //return (List)template.findByCriteria(DetachedCriteria.forClass(labors.class).add(Restrictions.eq("Labors_Idnumber", idnumber)));
    String query = "from UserPojo users where users.Name =? AND users.Password =?";
   
    list = template.find(query, name, pwd);

    return list;
}



}
