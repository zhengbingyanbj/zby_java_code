package com.ruoyi.web.controller.icu;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.IcuPatientMi;
import com.ruoyi.system.service.IIcuPatientMiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-08-27
 */
@RestController
@RequestMapping("/icu/mi")
public class IcuPatientMiController extends BaseController
{
    @Autowired
    private IIcuPatientMiService icuPatientMiService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:list')")
    @GetMapping("/list")
    public TableDataInfo list(IcuPatientMi icuPatientMi)
    {
        startPage();
        List<IcuPatientMi> list = icuPatientMiService.selectIcuPatientMiList(icuPatientMi);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IcuPatientMi icuPatientMi)
    {
        List<IcuPatientMi> list = icuPatientMiService.selectIcuPatientMiList(icuPatientMi);
        ExcelUtil<IcuPatientMi> util = new ExcelUtil<IcuPatientMi>(IcuPatientMi.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:query')")
    @GetMapping(value = "/{rid}")
    public AjaxResult getInfo(@PathVariable("rid") Long rid)
    {
        return AjaxResult.success(icuPatientMiService.selectIcuPatientMiByRid(rid));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IcuPatientMi icuPatientMi)
    {
        String bedNo = icuPatientMi.getBedNo();
        IcuPatientMi icuPatientMi1 =  icuPatientMiService.selectIcuPatientBed(bedNo);
        if(icuPatientMi1 != null){
            return AjaxResult.error("床号已被"+ icuPatientMi1.getName() + "绑定");
        }
        return toAjax(icuPatientMiService.insertIcuPatientMi(icuPatientMi));
    }


    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IcuPatientMi icuPatientMi)
    {
        return toAjax(icuPatientMiService.updateIcuPatientMi(icuPatientMi));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('icu:mi:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rids}")
    public AjaxResult remove(@PathVariable Long[] rids)
    {
        return toAjax(icuPatientMiService.deleteIcuPatientMiByRids(rids));
    }
}
