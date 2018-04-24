package entity;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0011.
 */
@Component
public class Blog {
    private int id;
    private String title;
    private String context;
    private Date date;
    private User author;
    private List<Comment> commentList;

    public Blog(){}

    public Blog(int id){
        this.id=id;
    }
    private List<Comment> commnentList;

    public List<Comment> getCommnentList() {
        return commnentList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public void setCommnentList(List<Comment> commnentList) {
        this.commnentList = commnentList;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", date=" + date +
                ", author=" + author +
                ", commnentList=" + commnentList +
                '}';
    }
}
