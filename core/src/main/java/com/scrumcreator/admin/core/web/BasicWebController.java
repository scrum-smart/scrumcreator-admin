package com.scrumcreator.admin.core.web;

import com.scrumcreator.admin.core.data.User;
import com.scrumcreator.admin.core.data.Webinar;
import com.scrumcreator.admin.core.security.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.context.SecurityContextHolder;

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

    User getCurrentUser() {
        UserAccount userAccount = (UserAccount) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return getUserByGoogleId(userAccount.getGoogleId());
    }

    Webinar getWebinar(String id) {
        Query searchWebinarQuery = new Query(Criteria.where("id").is(id));
        return mongoOperations.findOne(searchWebinarQuery, Webinar.class);
    }

}
