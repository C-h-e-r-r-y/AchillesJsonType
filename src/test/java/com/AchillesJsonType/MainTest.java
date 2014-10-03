package com.AchillesJsonType;

import com.datastax.driver.core.querybuilder.Select;
import info.archinnov.achilles.persistence.PersistenceManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.datastax.driver.core.querybuilder.QueryBuilder.select;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml"})
public class MainTest {
    @Autowired
    private PersistenceManager persistenceManager;

    @Test
    public void testName() throws Exception {
        Select select = select().from("base_table");
        persistenceManager.typedQuery(BaseEntity.class, select).get();
    }
}
