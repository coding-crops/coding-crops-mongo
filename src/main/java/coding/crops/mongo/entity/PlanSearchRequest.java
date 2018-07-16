package coding.crops.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2018/7/17.
 */
@Data
public class PlanSearchRequest {
    /**
     * 编号.
     */
    @Id
    private String id;
    /**
     * 省.
     */
    private String province;
    /**
     * 市.
     */
    private String city;
    /**
     * 区.
     */
    private String district;
    /**
     * 状态.
     */
    private String status;
}
