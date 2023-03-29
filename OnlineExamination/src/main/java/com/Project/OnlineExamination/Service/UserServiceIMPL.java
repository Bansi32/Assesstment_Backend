package com.Project.OnlineExamination.Service;

import com.Project.OnlineExamination.entity.User;
import com.Project.OnlineExamination.QuestionRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.OnlineExamination.DTO.UserDTO;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserDTO userDTO) {
        User u=new User(
                userDTO.getUserName(),
                userDTO.getEmailId(),
                userDTO.getPassword(),
                userDTO.getRole()
        );
        userRepo.save(u);
        return u.getUserName();
    }

    @Override
    public List<UserDTO> getUser(UserDTO userDTO) {
        List<User> getUsers = userRepo.findAll();
        List<UserDTO> user = new ArrayList<>();
        for (User u : getUsers) {
            UserDTO userDto = new UserDTO(
                    u.getUserId(),
                    u.getUserName(),
                    u.getEmailId(),
                    u.getPassword(),
                    u.getRole()
            );
            if(userDto.getEmailId().equals(userDTO.getEmailId()) && userDto.getPassword().equals(userDTO.getPassword())) {
                user.add(userDto);
            }
        }
        return user;
    }
}
