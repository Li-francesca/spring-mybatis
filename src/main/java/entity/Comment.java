package entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/24 0011.
 */
@Component
public class Comment {
    private int id;
    private String context;
    private Date time;
    private User user;
    private Blog blog;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", context='" + context + '\'' +
                ", time=" + time +
                ", user=" + user +
                ", blog=" + blog +
                '}';
    }
}
