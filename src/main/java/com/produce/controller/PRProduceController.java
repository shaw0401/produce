package com.produce.controller;

import com.produce.entity.Bsinven;
import com.produce.entity.Prplan;
import com.produce.entity.Prproduce;
import com.produce.entity.Syassignright;
import com.produce.service.BsinvenService;
import com.produce.service.PRPlanService;
import com.produce.service.PRProduceService;
import com.produce.service.SyassignrightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Controller
public class PRProduceController {

      @Resource
    private PRProduceService produceService;

      @Resource
      private SyassignrightService operatorService;

      @Resource
      private BsinvenService bsinvenService;

      @Resource
      private PRPlanService planService;
    /**
     * 生产信息列表
     * @param model
     * @return
     */
      @RequestMapping("produceList")
    public String produceList(Model model,String invencode ) {

          List<Bsinven> bsinvens = bsinvenService.findAll();
          model.addAttribute("bsinvens",bsinvens);
              List<Prproduce> produces=produceService.findAllProduce(invencode);
              model.addAttribute("produces",produces);
              if(invencode!=null&&invencode.trim()!=""){
                  Bsinven bsname= bsinvenService.findByInvencode(invencode);
                  model.addAttribute("bsname",bsname);
              }



          return "produceList";
      }

    /**
     * 进入添加信息页面
     * @return
     */
      @RequestMapping("toAddProduce")
      public String toAddProduce(Model model){
          List<Syassignright> allOperator = operatorService.findAllOperator();
          model.addAttribute("allOperator",allOperator);
          List<Bsinven> allBs = bsinvenService.findAll();
          model.addAttribute("allBs",allBs);
          List<Prplan> allPlan = planService.findAllPlan(null);
          model.addAttribute("allPlan",allPlan);
          return "produceAdd";
      }
    /**
     * 添加生产信息
     * @param prproduce
     * @param producedate
     * @param startDate
     * @param endDate
     * @return
     * @throws ParseException
     */
      @RequestMapping("addProduce")
    public String produceAdd(Prproduce prproduce,String producedate,String startDate,String endDate) throws ParseException {

            produceService.insertProduce(prproduce,producedate,startDate,endDate);
        return "redirect:produceList";
      }

    /**
     * 删除生产信息
     * @param prproducecode
     * @return
     */
      @RequestMapping("deleteProduce")
    public String deleteProduce(String prproducecode){
          produceService.produceDelete(prproducecode);
          return "redirect:produceList";
      }
    /**
     * 批量删除
     */
    @RequestMapping("deleteProduceM")
    public  String deleteProduceM(String[] checkbox ,Model model){
        if(checkbox!=null){

            for (int i=0;i<checkbox.length;i++){

                String id=checkbox[i];

                this.deleteProduce(id);

            }
            return "redirect:produceList";
        }else {
            model.addAttribute("msg","您未选中记录，无法删除");
            return "forward:produceList";
        }
    }
    /**
     * 进入更新页面—根据生产信息单号查询对应信息
     * @param prproducecode
     * @param model
     * @return
     */
      @RequestMapping("producePreUpdate")
    public String preUpdate(String prproducecode,Model model){
          List<Syassignright> allOperator = operatorService.findAllOperator();
          model.addAttribute("allOperator",allOperator);
          List<Bsinven> allBs = bsinvenService.findAll();
          model.addAttribute("allBs",allBs);
          List<Prplan> allPlan = planService.findAllPlan(null);
          model.addAttribute("allPlan",allPlan);
        Prproduce produce=produceService.findByProduceCode(prproducecode);
         model.addAttribute("produce",produce);
         return "produceUpdate";
      }

      @RequestMapping("updateProduce")
    public String updateProduce(Prproduce prproduce,String producedate,String startDate,String endDate) throws ParseException{
           produceService.produceUpdate(prproduce,producedate,startDate,endDate);
          return "redirect:produceList";
      }
}
