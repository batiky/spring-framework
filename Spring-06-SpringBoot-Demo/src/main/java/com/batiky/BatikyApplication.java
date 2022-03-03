package com.batiky;

import com.batiky.model.Comment;
import com.batiky.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BatikyApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(BatikyApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);
    }

}
