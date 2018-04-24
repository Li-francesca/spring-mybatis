import entity.Blog;
import entity.Comment;
import entity.User;
import mapper.CommentMapper;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CommentTest {
    @Autowired
    CommentMapper commentMapper;
    @Test
    //@Ignore
    public void queryCommentByIdTest(){
        Comment comment=commentMapper.queryCommentById(2);
        System.out.println(comment);
    }
    @Test
    //@Ignore
    public void queryCommentByUserIdTest(){
        List<Comment> commentList=commentMapper.queryCommentByUserId(1);
        System.out.println(commentList);
    }
    @Test
    public void newCommentTest(){
        Comment comment=new Comment();
        comment.setContext("new_context");
        comment.setTime(new Date());
        comment.setBlog(new Blog(1));
        comment.setUser(new User(1));
        commentMapper.newComment(comment);
    }
    @Test
    //@Ignore
    public void delCommentByIdTest(){
        boolean s=commentMapper.delCommentById(2);
    }

    @Test
    //@Ignore
    public void updateCommentTest(){
        Comment comment=new Comment();
        comment.setId(3);
        comment.setContext("context_update");
        comment.setTime(new Date());
        boolean s=commentMapper.updateComment(comment);
        Assert.assertTrue(s);
    }
}
