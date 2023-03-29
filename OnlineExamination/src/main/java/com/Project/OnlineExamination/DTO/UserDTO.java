package com.Project.OnlineExamination.DTO;
import jakarta.persistence.Column;
public class UserDTO {
    private int userId;

    private String userName;

    private String emailId;

    private String password;

    private boolean role;

    public UserDTO() {
    }

    public UserDTO(String userName, String emailId, String password, boolean role) {
        this.userName = userName;
        this.emailId = emailId;
        this.password = password;
        this.role = role;
    }

    public UserDTO(int userId, String userName, String emailId, String password, boolean role) {
        this.userId = userId;
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
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
