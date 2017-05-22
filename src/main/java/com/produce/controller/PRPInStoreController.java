package com.produce.controller;

import com.produce.entity.Bsinven;
import com.produce.entity.Prpinstore;
import com.produce.entity.Prproduce;
import com.produce.entity.Syassignright;
import com.produce.service.BsinvenService;
import com.produce.service.PRPInStoreService;
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
public class PRPInStoreController {

    @Resource
    private PRPInStoreService storeService;

    @Resource
    private PRProduceService produceService;

    @Resource
    private SyassignrightService operatorService;

    @Resource
    private BsinvenService bsinvenService;

    /**
     * 查询库存情况
     * @param model
     * @return
     */
    @RequestMapping("storesList")
    public String storeList(Model model,String prproducecode){
      //下拉列表显示数据
        List<Prproduce> allProduce = produceService.findAllProduce(null);
        model.addAttribute("allProduce",allProduce);
        //数据回显
        Prproduce produce = produceService.findByProduceCode(prproducecode);
        model.addAttribute("produce",produce);
        //带条件查询
        List<Prpinstore> stores=storeService.findAllStore(prproducecode);

        model.addAttribute("stores",stores);
        return "storeList";
    }

    /**
     * 进入添加库存页面
     * @return
     */
    @RequestMapping("toStoreAdd")
    public String toStoreAdd(Model model){
        List<Syassignright> allOperator = operatorService.findAllOperator();
        model.addAttribute("allOperator",allOperator);

        List<Prproduce> produces = produceService.findAllProduce(null);
        model.addAttribute("produces",produces);

       /* List<Bsinven> allBs = bsinvenService.findAll();
        model.addAttribute("allBs",allBs);*/

        return "storeAdd";
    }

    /**
     * 添加库存
     * @param inStore
     * @param prinDate
     * @return
     * @throws ParseException
     */
    @RequestMapping("AddStore")
    public String AddStore(Prpinstore inStore,String prinDate) throws ParseException {

        storeService.insert(inStore,prinDate);
        return "redirect:storesList";
    }

    /**
     * 库存记录数删除
     * @param princode
     * @return
     */
    @RequestMapping("storeDelete")
    public  String storeDelete(String princode){
        storeService.deleteStore(princode);
        return "redirect:storesList";
    }

    @RequestMapping("deleteStoreM")
    public String deleteStoreMore(String[] checkbox,Model model){
        if(checkbox!=null){

            for (int i=0;i<checkbox.length;i++){

                String id=checkbox[i];

                this.storeDelete(id);

            }
            return "redirect:storesList";
        }else {
            model.addAttribute("msg","您未选中记录，无法删除");
            return "forward:storesList";
        }
    }
    /**
     * 进入库存修改页面
     * @param princode
     * @param model
     * @return
     */
    @RequestMapping("storePreUpdate")
    public String storePreUpdate(String princode,Model model){
        Prpinstore inStore=storeService.selectByStoreCode(princode);
        model.addAttribute("inStore",inStore);
        //操作人员
        List<Syassignright> allOperator = operatorService.findAllOperator();
        model.addAttribute("allOperator",allOperator);
        //产品
        List<Bsinven> bsinvens = bsinvenService.findAll();
        model.addAttribute("bsinvens",bsinvens);
        //生产
        List<Prproduce> produces = produceService.findAllProduce(null);
        model.addAttribute("produces",produces);
        return "storeUpdate";
    }

    @RequestMapping("updateStore")
    public String updateStore(Prpinstore inStore,String prinDate) throws ParseException {
        storeService.storeUpdate(inStore,prinDate);
        return "redirect:storesList";
    }
}
