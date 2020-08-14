package com.win.quizproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    // private List<String> answers =new ArrayList<String>();

    public Quiz() {

    }

    public Quiz(String question, String answer1, String answer2, String answer3, String answer4, String answer5) {
        Question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    // Zach
    public String getAnswer1() {
        return answer1;
    }

    // Lionel
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    // George
    public String getAnswer2() {
        return answer2;
    }

    // Kaley
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    // Pasha
    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    // public List<String> getAnswers() {
    // return answers;
    // }

    // public void setAnswers(List<String> answers) {
    // this.answers = answers;
    // }

}