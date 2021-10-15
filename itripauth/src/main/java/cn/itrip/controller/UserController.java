package cn.itrip.controller;

import cn.itrip.dao.itripUserLinkUser.ItripUserLinkUserMapper;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    ItripUserLinkUserMapper dao;
    @RequestMapping(value = "/json",method = RequestMethod.GET,produces ="application/json; charset=utf-8")
    @ResponseBody
    public Object getlist(String pid) throws Exception {
        return JSONArray.toJSONString(dao.getItripUserLinkUserById(new Long(pid)));
    }
}
