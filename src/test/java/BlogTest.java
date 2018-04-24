import entity.Blog;
import entity.User;
import mapper.BlogMapper;
import mapper.UserMapper;
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
public class BlogTest {
    @Autowired
     BlogMapper blogMapper;
    @Test
    public void newBlogTest(){
        Blog blog=new Blog();
        blog.setTitle("blog_title");
        blog.setContext("blog_context");
        blog.setDate(new Date());
        blog.setAuthor(new User(5));

        blogMapper.newBlog(blog);
    }
    @Test
    public void delBlogTest(){
        //BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        blogMapper.delBlog(18);
    }

   @Test

    public void updateBlogTest(){
        //BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Blog blog=new Blog();
        blog.setId(19);
        blog.setTitle("title_update");
        blog.setContext("context_update");
        blog.setDate(new Date());
        blog.setAuthor(new User(3));
        blogMapper.updateBlog(blog);
    }
    @Test
   // @Ignore
    public void listAllBlogTest(){
        //BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList=blogMapper.listAllBlog();
        System.out.println(blogList);
    }
    @Test
    //@Ignore
    public void queryBlogbyIdTest(){
        //BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        Blog blog=blogMapper.queryBlogbyId(19);
        System.out.println(blog);
    }
    @Test
    //@Ignore
    public void queryBlogByTitleTest(){
        //BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList=blogMapper.queryBlogByTitle("title");
        System.out.println(blogList);
    }
}
