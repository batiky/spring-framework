package com.batiky;


import com.batiky.service.CommentService;
import com.batiky.config.ProjectConfig;
import com.batiky.model.Comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BatikyApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("SpringFramework");


        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);

        System.out.println(cs1 == cs2);
    }
}
