package com.mangosteen.app.dao;

import com.mangosteen.app.dao.mapper.UserInfoMapper;
import com.mangosteen.app.model.dao.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
//    private final UserInfoMapper userInfoMapper;
      private final UserInfoMapper userInfoMapper;
    @Autowired  // 构造器注入
      public UserDaoImpl(UserInfoMapper userInfoMapper){
        this.userInfoMapper = userInfoMapper;
    }
    @Override
    public UserInfo getUserInfoById(Long id) {
        return userInfoMapper.getUserInfoByUserId(id);
    }
}
