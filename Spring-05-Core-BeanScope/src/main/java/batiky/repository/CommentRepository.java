package batiky.repository;

import com.batiky.model.Comment;


public interface CommentRepository {
    void storeComment(Comment comment);
}
