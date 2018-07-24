package com.scrumcreator.admin.core.config;

import com.scrumcreator.admin.core.data.ScrumPractice;
import com.scrumcreator.admin.core.data.SpringMongoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMongoConfig.class})
public class TestDataContext {

    @Autowired
    private MongoOperations mongoOperations;

    static final int QTY = 153;

    @Test
    public void ensureScrumPracticeListIs153() {
        List<ScrumPractice> list = mongoOperations.findAll(ScrumPractice.class);
        assertEquals(QTY, list.size());
    }
}
