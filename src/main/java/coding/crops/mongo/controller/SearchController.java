package coding.crops.mongo.controller;

import coding.crops.mongo.dao.SearchDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/17.
 */
@RestController
public class SearchController {

    @Autowired
    SearchDao dao;

    @RequestMapping("/mongo")
    public String insertResponse() {
        dao.add();
        return "success";
    }
}
