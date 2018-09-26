package com.arvin.model;




import javax.persistence.*;
import java.util.Date;

/**
 *
 */
@Entity
@Table(name = "user_info")
public class UserInfo {

    public UserInfo(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name",columnDefinition = "varchar(250) DEFAULT NULL COMMENT '用户名'")
    private String userName;

    @Column(name = "password", length = 20)
    private String password;

    @Column(length = 50)
    private String createBy;

    @Temporal(TemporalType.TIME)
    private Date createTime = new Date();

    @Column(length = 50)
    private String updateBy;

    @Temporal(TemporalType.TIME)
    private Date updateTime = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
