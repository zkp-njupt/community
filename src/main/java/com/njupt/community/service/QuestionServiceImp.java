package com.njupt.community.service;


import com.njupt.community.domain.Question;
import com.njupt.community.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImp implements QuestionService{

    @Autowired
    private QuestionMapper mapper;


    @Override
    public void create(Question question) {
        mapper.create(question);
    }
}
