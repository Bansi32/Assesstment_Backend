package com.Project.OnlineExamination.Service;

import com.Project.OnlineExamination.DTO.QuestionDTO;

import com.Project.OnlineExamination.QuestionRepo.QuestionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.OnlineExamination.entity.Question;


import java.util.ArrayList;
import java.util.List;


@Service
public class QuestionServiceIMPL implements QuestionService{
@Autowired
    private QuestionRepo questionRepo;


    //function to add data questions
    @Override
    public String addQuestion(QuestionDTO questionDto) {
       Question q=new Question(
               questionDto.getQ1(),
               questionDto.getQ2(),
               questionDto.getQ3(),
               questionDto.getQ4(),
               questionDto.getQ5(),
               questionDto.getExam()
       );
               questionRepo.save(q);
               return q.getExam();
    }

    //function to get data all questions
    @Override
    public List<QuestionDTO> getAllQuestion() {
        List<Question> getQuestions=questionRepo.findAll();
        List<QuestionDTO> questionList=new ArrayList<>();
        for(Question q:getQuestions)
        {
            QuestionDTO questionDTO=new QuestionDTO(
                    q.getQuestionId(),
                    q.getQ1(),
                    q.getQ2(),
                    q.getQ3(),
                    q.getQ4(),
                    q.getQ5(),
                    q.getExam()
            );
            questionList.add(questionDTO);
        }
        return questionList;
    }

    //to fetch data specific field i.e cae
    @Override
    public List<QuestionDTO> getCaeQuestions() {
        List<Question> getQuestions=questionRepo.findAll();
        List<QuestionDTO> questionList=new ArrayList<>();
        for(Question q:getQuestions)
        {
            QuestionDTO questionDTO=new QuestionDTO(
                    q.getQuestionId(),
                    q.getQ1(),
                    q.getQ2(),
                    q.getQ3(),
                    q.getQ4(),
                    q.getQ5(),
                    q.getExam()
            );
            if(questionDTO.getExam().equals("cae")) {
                questionList.add(questionDTO);
            }
        }
        return questionList;
    }

    //to fetch data specific field i.e ese
    @Override
    public List<QuestionDTO> getEseQuestions() {
        List<Question> getQuestions=questionRepo.findAll();
        List<QuestionDTO> questionList=new ArrayList<>();
        for(Question q:getQuestions)
        {
            QuestionDTO questionDTO=new QuestionDTO(
                    q.getQuestionId(),
                    q.getQ1(),
                    q.getQ2(),
                    q.getQ3(),
                    q.getQ4(),
                    q.getQ5(),
                    q.getExam()
            );
            if(questionDTO.getExam().equals("ese")) {
                questionList.add(questionDTO);
            }
        }
        return questionList;
    }


}
