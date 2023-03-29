package com.Project.OnlineExamination.Service;

import com.Project.OnlineExamination.DTO.UserDTO;
import com.Project.OnlineExamination.entity.User;

import java.util.List;
public interface UserService {
    String addUser(UserDTO userDTO);

    List<UserDTO> getUser(UserDTO userDTO);

}
