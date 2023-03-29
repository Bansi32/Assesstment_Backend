package com.Project.OnlineExamination.Service;

import com.Project.OnlineExamination.DTO.QuestionDTO;

import java.util.List;

public interface QuestionService {
    String addQuestion(QuestionDTO questionDto);

    List<QuestionDTO> getAllQuestion();

    List<QuestionDTO> getCaeQuestions();

    List<QuestionDTO> getEseQuestions();


}
