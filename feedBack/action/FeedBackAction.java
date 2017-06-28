package com.huadi.feedBack.action;

import com.huadi.basic.action.BaseAction;
import com.huadi.feedBack.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
@Controller
@RequestMapping("/qams")
public class FeedBackAction extends BaseAction {

    @Autowired
    private FeedBackService FBService;



    /*@RequestMapping("/qualityAnalysis")
    public ModelAndView getThePage(){
        mav.setViewName("qualityAnaltsis");
        return mav;
    }*/

}
