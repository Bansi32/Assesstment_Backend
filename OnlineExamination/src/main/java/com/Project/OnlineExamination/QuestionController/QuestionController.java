package com.Project.OnlineExamination.QuestionController;

import com.Project.OnlineExamination.DTO.QuestionDTO;
import com.Project.OnlineExamination.DTO.UserDTO;
import com.Project.OnlineExamination.Service.QuestionService;
import com.Project.OnlineExamination.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;
    @Autowired
    private UserService userService;

    //posting data questions
    @PostMapping(path="question")
    public String saveQuestion(@RequestBody QuestionDTO questionDto){
        String id=questionService.addQuestion(questionDto);
        return id;
    }
    //signup users
    @PostMapping(path="signup")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id=userService.addUser(userDTO);
        return id;
    }
    //loginUsers
    @PostMapping(path="login")
    public List<UserDTO> getUser(@RequestBody UserDTO userDTO){
        List<UserDTO> users=userService.getUser(userDTO);
        return users;
    }
    //fetching data questions
    @GetMapping(path="question")
    public List<QuestionDTO> getAllQuestion(){
        List<QuestionDTO> allQuestions=questionService.getAllQuestion();
        return allQuestions;
    }

    //fetching cae specific data
    @GetMapping(path="question/cae")
    public List<QuestionDTO> getCaeQuestions(){
        List<QuestionDTO> caeQuestions=questionService.getCaeQuestions();
        return caeQuestions;
    }

    //fetching ese specific data
    @GetMapping(path="question/ese")
    public List<QuestionDTO> getEseQuestions(){
        List<QuestionDTO> eseQuestions=questionService.getEseQuestions();
        return eseQuestions;
    }
}
