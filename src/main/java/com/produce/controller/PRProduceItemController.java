package com.produce.controller;

import com.produce.entity.Bsinven;
import com.produce.entity.Prproduce;
import com.produce.entity.Prproduceitem;
import com.produce.service.BsinvenService;
import com.produce.service.PRProduceItemService;
import com.produce.service.PRProduceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Controller
public class PRProduceItemController {

    @Resource
    private PRProduceItemService produceItemService;

    @Resource
    private BsinvenService bsinvenService;

    @Resource
    private PRProduceService produceService;

    /**
     * 原料生产需求列表
     * @param model
     * @return
     */
    @RequestMapping("produceItemList")
    public String produceItemList(Model model,String prproducecode){
           //查询数据回显
        Prproduce produce = produceService.findByProduceCode(prproducecode);
        model.addAttribute("produce",produce);
          //下拉框中出现所有查询条件
        List<Prproduce> allProduce = produceService.findAllProduce(null);
        model.addAttribute("allProduce",allProduce);

        List<Prproduceitem> produceItems=produceItemService.findAllItems(prproducecode);
        model.addAttribute("produceItems",produceItems);


        return "produceItemList";
    }

    /**
     * 进入原料需求添加页面
     * @return
     */
    @RequestMapping("toProduceItemAdd")
    public String toProduceAdd(Model model){

        List<Bsinven> allBs = bsinvenService.findAll();
        model.addAttribute("allBs",allBs);

        List<Prproduce> allProduce = produceService.findAllProduce(null);
        model.addAttribute("allProduce",allProduce);
        return "produceItemAdd";
    }

    /**
     * 生产物料信息添加
     * @param produceItem
     * @return
     */
    @RequestMapping("produceItemAdd")
    public String produceItemAdd(Prproduceitem produceItem){
        produceItemService.addProduceItem(produceItem);
        return "redirect:produceItemList";
    }

    /**
     * 根据物料需求表ID删除信息
     * @param id
     * @return
     */
    @RequestMapping("productItemDelete")
    public String productItemDelete(int id){
        produceItemService.deleteProductItem(id);
        return "redirect:produceItemList";
    }

    /**
     * 更新物料信息-通过物料表ID查找对应信息
     * @param id
     * @return
     */
    @RequestMapping("produceItemPreUpdate")
    public String produceItemPreUpdate(int id ,Model model){
        Prproduceitem produceItem=produceItemService.selectByItemId(id);
        model.addAttribute("produceItem",produceItem);
        //生产单号
        List<Prproduce> allProduce = produceService.findAllProduce(null);
        model.addAttribute("allProduce",allProduce);
        //产品
        List<Bsinven> bsinvens = bsinvenService.findAll();
        model.addAttribute("bsinvens",bsinvens);
        return "produceItemUpdate";
    }

    @RequestMapping("produceItemUpdate")
    public String produceItemUpdate(Prproduceitem produceItem){
        produceItemService.updateProductItem(produceItem);
        return "redirect:produceItemList";
    }

    /**
     * 批量删除
     * @param checkbox
     * @return
     */
    @RequestMapping("deleteMore")
    public String deleteMore(String[] checkbox,Model model){

        if(checkbox!=null){

            for (int i=0;i<checkbox.length;i++){

                String id=checkbox[i];
                int Id=Integer.parseInt(id);
                this.productItemDelete(Id);

            }
            return "redirect:produceItemList";
        }else {
            model.addAttribute("msg","您未选中记录，无法删除");
            return "forward:produceItemList";
        }

    }
}
