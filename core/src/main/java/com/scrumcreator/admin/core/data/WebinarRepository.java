package com.scrumcreator.admin.core.data;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by VMoskalenko on 05.01.2017.
 */
public interface WebinarRepository extends MongoRepository<ScrumPractice, String> {

    public ScrumPractice findByTopic(String firstName);

}
