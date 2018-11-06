package com.scrumcreator.admin.core.web;

import com.scrumcreator.admin.core.data.ScrumPractice;
import com.scrumcreator.admin.core.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by vmoskalenko on 16.01.2017.
 *
 */
abstract class BasicWebController  {

    @Autowired
    MongoOperations mongoOperations;

    User getUserByGoogleId(String id) {
        Query searchUserQuery = new Query(Criteria.where("googleId").is(id));
        return mongoOperations.findOne(searchUserQuery, User.class);
    }

    User getUserById(String id) {
        Query searchUserQuery = new Query(Criteria.where("id").is(id));
        return mongoOperations.findOne(searchUserQuery, User.class);
    }


    ScrumPractice getWebinar(String id) {
        Query searchWebinarQuery = new Query(Criteria.where("id").is(id));
        return mongoOperations.findOne(searchWebinarQuery, ScrumPractice.class);
    }

}
