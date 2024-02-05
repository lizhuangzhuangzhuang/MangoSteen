package com.mangosteen.app.dao;

import com.mangosteen.app.model.dao.UserInfo;

public interface UserDao {
    /**
     * Get use info by use id;
     * @param id user id
     * @return the specific user information
     */
    UserInfo getUserInfoById(Long id);
}
