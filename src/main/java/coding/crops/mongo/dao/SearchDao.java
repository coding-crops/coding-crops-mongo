package coding.crops.mongo.dao;

import coding.crops.mongo.entity.PlanSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/7/17.
 */
@Repository
public class SearchDao {
    @Autowired
    MongoTemplate template;

    public void add() {
        PlanSearchRequest request = new PlanSearchRequest();
        request.setCity("dalian");
        template.insert(request);
    }
}
