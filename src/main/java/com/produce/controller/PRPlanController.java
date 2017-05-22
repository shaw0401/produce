package com.produce.controller;


import com.produce.entity.Bsinven;
import com.produce.entity.Prplan;
import com.produce.entity.Seorder;
import com.produce.entity.Syassignright;
import com.produce.service.BsinvenService;
import com.produce.service.PRPlanService;
import com.produce.service.SeorderService;
import com.produce.service.SyassignrightService;
import com.produce.util.UUIDUtils;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * 生产计划
 * Created by 吴方潇 on 2017/5/12.
 */
@Controller
public class PRPlanController {

    @Resource
    private PRPlanService planService;

    @Resource
    private SyassignrightService operatorService;

    @Resource
    private BsinvenService bsinvenService;

    @Resource
    private SeorderService seorderService;

    @RequestMapping("toList")
    public String toList(){
        return "index";
    }

    /**
     * 生产计划列表
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String list(Model model,String seordercode){
        List<Seorder> orders = seorderService.findAllOrder();
        model.addAttribute("orders",orders);
        List<Prplan> plans=planService.findAllPlan(seordercode);
        model.addAttribute("plans",plans);
        //查询回显
         Seorder order=seorderService.findByOrdercode(seordercode);
         model.addAttribute("order",order);
        return "planList";
    }

    /**
     * 进入添加生产页面
     * @return
     */
    @RequestMapping("toAddPlan")
    public String addPlan(Model model){
        List<Syassignright> allOperator = operatorService.findAllOperator();
        model.addAttribute("allOperator",allOperator);

        List<Bsinven> allBs = bsinvenService.findAll();
        model.addAttribute("allBs",allBs);

        List<Seorder> allOrder = seorderService.findAllOrder();
        model.addAttribute("allOrder",allOrder);
        return "planAdd";
    }

    /**
     * 添加生产计划
     * @return
     */
    @RequestMapping("addPlan")
    public String addPlan(Prplan plan,String plandate,String enddate) throws ParseException {

        planService.insert(plan,plandate,enddate);
        return "redirect:list";
    }

    /**
     * 删除生产计划
     * @param prplancode
     * @return
     */
   @RequestMapping("deletePlan")
   public String deletePlan(String prplancode){
        planService.planDelete(prplancode);
        return "redirect:list";
   }
    /**
     * 批量删除
     */
    @RequestMapping("deletePlanM")
    public String deletePlanM(String[] checkbox,Model model){
        if(checkbox!=null){

            for (int i=0;i<checkbox.length;i++){

                String id=checkbox[i];

                this.deletePlan(id);

            }
            return "redirect:list";
        }else {
            model.addAttribute("msg","您未选中记录，无法删除");
            return "forward:list";
        }
    }
    /**
     * 通过生产编号查询生产信息
     * @param model
     * @param prplancode
     * @return
     */
   @RequestMapping("preUpdate")
   public String preUpdate(Model model,String prplancode){
        Prplan plan=planService.findByPrplanCode(prplancode);
        model.addAttribute("plan",plan);
        //操作员
       List<Syassignright> operators = operatorService.findAllOperator();
       model.addAttribute("operators",operators);
       //销售订单号
       List<Seorder> orders = seorderService.findAllOrder();
       model.addAttribute("orders",orders);
       //产品
       List<Bsinven> bsinvens = bsinvenService.findAll();
       model.addAttribute("bsinvens",bsinvens);
       return "planUpdate";
   }

    /**
     * 更新计划信息
     * @param prplan
     * @param plandate
     * @param enddate
     * @return
     * @throws ParseException
     */
   @RequestMapping("update")
   public  String update(Prplan prplan,String plandate,String enddate) throws ParseException {
       planService.updatePlan(prplan,plandate,enddate);
       return "redirect:list";
   }

     @RequestMapping("toTop")
    public String top(){
        return "top";
     }
    @RequestMapping("toLeft")
    public String totLeft(){
        return "left";
    }
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}
