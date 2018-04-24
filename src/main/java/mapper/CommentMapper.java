package mapper;

import entity.Comment;

import java.util.List;


public interface CommentMapper {
    public boolean newComment(Comment comment);
    public boolean delCommentById(int id);
    public boolean updateComment(Comment comment);
    public Comment queryCommentById(int id);
    public List<Comment> queryCommentByUserId(int userId);
}
