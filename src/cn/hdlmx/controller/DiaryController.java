package cn.hdlmx.controller;

import cn.hdlmx.pojo.Diary;
import cn.hdlmx.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by handong on 2017/7/23.
 */
@Controller
@RequestMapping("/diary")
@Scope("prototype")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @RequestMapping(value ="{diaryId}*", method = RequestMethod.GET)
    public String list(Model model, HttpServletRequest request, @PathVariable String diaryId) {
       /* String diaryId = getRequestParameter(request);*/
        Diary diary = diaryService.list(diaryId);
        model.addAttribute("diary", diary);
        return "/diary2/list";
    }

    public String getRequestParameter(HttpServletRequest request) {
        String requestURL = request.getRequestURI();
        String[] parameters = requestURL.split("/");
        System.out.println(parameters[parameters.length - 1]);
        return parameters[parameters.length - 1];
    }

}
