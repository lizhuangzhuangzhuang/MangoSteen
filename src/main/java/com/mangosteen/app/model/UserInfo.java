package com.mangosteen.app.model;

import java.time.LocalDateTime;

public class UserInfo {
    private Long id;
    private String username;
    private String password;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public UserInfo(Long id, String username, String password, LocalDateTime createTime, LocalDateTime updateTime){
        this.id = id;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId (){
        return id;
    }
    public String getUsername (){
        return username;
    }
    public String getPassword (){
        return password;
    }
    public LocalDateTime getCreateTime (){
        return createTime;
    }
    public LocalDateTime getUpdateTime (){
        return updateTime;
    }

    public UserInfo SetId (Long id){
        this.id = id;
        return this;
    }
    public UserInfo getUsername (String username){
        this.username = username;
        return this;
    }
    public UserInfo getPassword (String password){
        this.password = password;
        return this;
    }
    public UserInfo getCreateTime (LocalDateTime createTime){
        this.createTime = createTime;
        return this;
    }
    public UserInfo getUpdateTime (LocalDateTime updateTime){
        this.updateTime = updateTime;
        return this;
    }


}
