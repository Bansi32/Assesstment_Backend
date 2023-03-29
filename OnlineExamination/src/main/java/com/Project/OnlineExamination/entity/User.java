package com.Project.OnlineExamination.entity;
import jakarta.persistence.*;
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="userId",length=50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column(name="user_name",length=50)
    private String userName;
    @Column(name="email_id",length=50)
    private String emailId;
    @Column(name="password",length=50)
    private String password;
    @Column(name="user_role",length=50)
    private boolean role;

    public User() {
    }

    public User(int userId, String userName, String emailId, String password, boolean role) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.role = role;
    }

    public User(String userName, String emailId, String password, boolean role) {
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
