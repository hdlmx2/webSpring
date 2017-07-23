package cn.hdlmx.beans;

/**
 * Created by handong on 2017/7/23.
 */
public class Diary {
    private String diaryId;
    private String title;
    private String diaryBody;
    private User author;
    private String createTime;

    public Diary() {
    }

    public String getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiaryBody() {
        return diaryBody;
    }

    public void setDiaryBody(String diaryBody) {
        this.diaryBody = diaryBody;
    }


    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "title='" + title + '\'' +
                ", diaryBody='" + diaryBody + '\'' +
                ", author=" + author +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
