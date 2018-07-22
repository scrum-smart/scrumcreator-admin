package com.scrumcreator.admin.core.app;

import java.text.ParseException;
import java.util.*;


/**
 * Created by VMoskalenko on 05.01.2017.
 */
public class App {

    public static void main(String[] args) throws ParseException {

        // For XML
        //ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");

        // For Annotation
        /*ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMongoConfig.class, SpringGotoConfig.class, GotoController.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");*/

        //User user = new User("mkyong", "password123");

        // save
        //mongoOperation.save(user);

        // now user object got the created id.
        //System.out.println("1. user : " + user);

        // query to search user
        //Query searchUserQuery = new Query(Criteria.where("id").is("586e55f992abe07fe40aebe9"));

        // find the saved user again.
        //User savedUser = mongoOperation.findOne(searchUserQuery, User.class);
        //System.out.println("2. find - savedUser : " + savedUser);

        // update password
        //mongoOperation.updateFirst(searchUserQuery,
        //        Update.update("password", "new password"),User.class);

        // find the updated user object
        //User updatedUser = mongoOperation.findOne(searchUserQuery, User.class);

        //BasicDBObject query = new BasicDBObject();
        //query.put("_id", new ObjectId("586e55f992abe07fe40aebe9"));

        //Webinar webinar = mongoOperation.findOne(searchUserQuery, Webinar.class);

        /*String id = "586e55f992abe07fe40aebe9";
        String date = "12-12-2017";
        String startDate = "12:00";
        String endDate = "13:00";*/

/*        System.out.println("3. updatedUser : " + ((GotoController) ctx.getBean("gotoController"))
                .createGotoWebinar(id, date, startDate, endDate));*/

        // delete
        //mongoOperation.remove(searchUserQuery, User.class);

        // List, it should be empty now.
        //List<User> listUser = mongoOperation.findAll(User.class);
        //System.out.println("4. Number of user = " + listUser.size());


        System.out.printf(Locale.ENGLISH, "https://attendee.gotowebinar.com/register/%1d?src=tcmail", 1234);

    }

}
