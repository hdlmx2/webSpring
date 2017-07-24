package cn.hdlmx.dao;

import cn.hdlmx.pojo.Diary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by handong on 2017/7/23.
 */
@Repository
@Scope("prototype")
public class DiaryDao {

    public Diary list(String diaryId) {
        List<Diary> diaryList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Diary diary = new Diary();
            diary.setDiaryId("100" + i);
            diary.setTitle("今天才开始ʼ" + i);
            diary.setDiaryBody("今天才开始用Spring MVC做项目" + i);
            diary.setCreateTime("2017/07/23 9:21" + i);
            diaryList.add(diary);
        }
        Diary diaryReturn = new Diary();
        for (Diary diary : diaryList) {
            if (diary.getDiaryId().equals(diaryId)) diaryReturn = diary;

        }
        return diaryReturn;
    }
}
