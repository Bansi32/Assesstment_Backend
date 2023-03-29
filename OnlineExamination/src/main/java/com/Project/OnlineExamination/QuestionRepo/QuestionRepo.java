package com.Project.OnlineExamination.QuestionRepo;
import com.Project.OnlineExamination.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
