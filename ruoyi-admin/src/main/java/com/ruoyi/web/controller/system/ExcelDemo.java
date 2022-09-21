package com.ruoyi.web.controller.system;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.CfgArea;
import com.ruoyi.system.service.ICfgAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/excelDemo")
public class ExcelDemo {

    @Autowired
    private ICfgAreaService cfgAreaService;

    @GetMapping("/readAreaCode")
    public AjaxResult readAreaCode() throws Exception {
        FileInputStream in = new FileInputStream(new File("./456.xlsx"));
        // 2.应用HUtool ExcelUtil获取ExcelReader指定输入流和sheet
        ExcelReader excelReader = ExcelUtil.getReader(in, "工作表1");
        // 可以加上表头验证
        // 3.读取第二行到最后一行数据
        List<List<Object>> read = excelReader.read(2, excelReader.getRowCount());
        List<Map<String,Object>> strings = new ArrayList<>();

        for (List<Object> objects : read) {
            CfgArea cfgAreaDto = new CfgArea();
            cfgAreaDto.setAreaCode(objects.get(0).toString());
//            cfgArea.setAreaLevel(3);
            List<CfgArea> cfgAreas = cfgAreaService.selectCfgAreaList(cfgAreaDto);
            if (CollectionUtil.isNotEmpty(cfgAreas)) {
                Object o = objects.get(2);

                CfgArea cfgArea = cfgAreas.get(0);
                cfgArea.setHisAreaName(objects.get(4).toString());
                cfgArea.setHisRowId(o.toString());
                cfgArea.setHisAreaCode(objects.get(3).toString());
                cfgAreaService.updateCfgArea(cfgArea);
            }
        }

        return AjaxResult.success();
    }





    @GetMapping("/readExcel")
    public AjaxResult readExcel() throws Exception {
        FileInputStream in = new FileInputStream(new File("./123.xlsx"));
        // 2.应用HUtool ExcelUtil获取ExcelReader指定输入流和sheet
        ExcelReader excelReader = ExcelUtil.getReader(in, "区县");
        // 可以加上表头验证
        // 3.读取第二行到最后一行数据
        List<List<Object>> read = excelReader.read(2, excelReader.getRowCount());
        List<Map<String,Object>> strings = new ArrayList<>();

        for (List<Object> objects : read) {
            CfgArea cfgArea = new CfgArea();
            cfgArea.setAreaCode(objects.get(1).toString());
//            cfgArea.setAreaLevel(3);
            List<CfgArea> cfgAreas = cfgAreaService.selectCfgAreaList(cfgArea);
            if (CollectionUtil.isNotEmpty(cfgAreas)) {
                CfgArea cfgArea1 = cfgAreas.get(0);
//                if(StringUtils.isNotEmpty(cfgArea1.getPostCode())){
//                    continue;
//                }

//                cfgArea1.setHisAreaCode(objects.get(1).toString());
//                cfgArea1.setHisAreaName(objects.get(2).toString());
//                cfgArea1.setHisRowId(Long.valueOf(String.valueOf(objects.get(0))));
                cfgArea1.setPostCode(objects.get(3).toString());
                cfgAreaService.updateCfgArea(cfgArea1);
            } else {
                Map<String, Object> stringObjectHashMap = new HashMap<>();
                if(objects.get(2).equals("市辖区")){
                    continue;
                }
                stringObjectHashMap.put("code",objects.get(1));
                stringObjectHashMap.put("name",objects.get(2));
                stringObjectHashMap.put("postCode",objects.get(3));
                strings.add(stringObjectHashMap);
            }
        }
        return AjaxResult.success(JSONObject.toJSONString(strings));
    }

    public static void main(String[] args) throws Exception {


    }
}
