package com.produce.controller;

import com.produce.entity.Syassignright;
import com.produce.service.SyassignrightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class SyassignrightController {

    @Resource
    private SyassignrightService operatorService;

    @RequestMapping("findAllOperator")
    @ResponseBody
    public List<Syassignright> findAllOperator(HttpServletResponse response) throws IOException {
        List<Syassignright> opetators=operatorService.findAllOperator();
        response.getWriter().print(opetators);
        return opetators;
    }

}