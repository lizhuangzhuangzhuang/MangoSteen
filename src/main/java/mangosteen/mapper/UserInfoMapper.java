package mangosteen.mapper;

import mangosteen.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ORM: data model -> Table ms_userinfo
 */

@Mapper
public interface UserInfoMapper {
//    SELECT * from mangosteen_test.ms_userinfo LIMIT 5;
    @Select("SELECT id, username, password, create_time, update_time FROM ms_userInfo WHERE id=#{id}")
    UserInfo getUserInfoByUserId(Long id);
}
