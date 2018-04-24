package mapper;

import entity.Blog;

import java.util.List;


public interface BlogMapper {
    public boolean newBlog(Blog blog);
    public boolean delBlog(int id);
    public boolean updateBlog(Blog blog);
    public Blog queryBlogbyId(int id);
    public List<Blog> listAllBlog();
    public List<Blog> queryBlogByTitle(String title);
}
