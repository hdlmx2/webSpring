package cn.hdlmx.service;

import cn.hdlmx.beans.Diary;
import cn.hdlmx.dao.DiaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by handong on 2017/7/23.
 */
@Service
@Scope("prototype")
public class DiaryService {
    @Autowired
    private DiaryDao diaryDao;

    public Diary list(String diaryId) {
        return diaryDao.list(diaryId);
    }

    public DiaryDao getDiaryDao() {
        return diaryDao;
    }

    public void setDiaryDao(DiaryDao diaryDao) {
        this.diaryDao = diaryDao;
    }
}
