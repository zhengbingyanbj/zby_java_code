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
import com.ruoyi.system.domain.IcuPatientSigns;
import com.ruoyi.system.service.IIcuPatientSignsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 健康监护Controller
 * 
 * @author ruoyi
 * @date 2022-09-01
 */
@RestController
@RequestMapping("/icu/signs")
public class IcuPatientSignsController extends BaseController
{
    @Autowired
    private IIcuPatientSignsService icuPatientSignsService;

    /**
     * 查询健康监护列表
     */
    @PreAuthorize("@ss.hasPermi('system:signs:list')")
    @GetMapping("/list")
    public TableDataInfo list(IcuPatientSigns icuPatientSigns)
    {
        startPage();
        List<IcuPatientSigns> list = icuPatientSignsService.selectIcuPatientSignsList(icuPatientSigns);
        return getDataTable(list);
    }

    /**
     * 导出健康监护列表
     */
    @PreAuthorize("@ss.hasPermi('system:signs:export')")
    @Log(title = "健康监护", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IcuPatientSigns icuPatientSigns)
    {
        List<IcuPatientSigns> list = icuPatientSignsService.selectIcuPatientSignsList(icuPatientSigns);
        ExcelUtil<IcuPatientSigns> util = new ExcelUtil<IcuPatientSigns>(IcuPatientSigns.class);
        util.exportExcel(response, list, "健康监护数据");
    }

    /**
     * 获取健康监护详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:signs:query')")
    @GetMapping(value = "/{rid}")
    public AjaxResult getInfo(@PathVariable("rid") Long rid)
    {
        return AjaxResult.success(icuPatientSignsService.selectIcuPatientSignsByRid(rid));
    }

    /**
     * 新增健康监护
     */
    @PreAuthorize("@ss.hasPermi('system:signs:add')")
    @Log(title = "健康监护", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IcuPatientSigns icuPatientSigns)
    {
        return toAjax(icuPatientSignsService.insertIcuPatientSigns(icuPatientSigns));
    }

    /**
     * 修改健康监护
     */
    @PreAuthorize("@ss.hasPermi('system:signs:edit')")
    @Log(title = "健康监护", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IcuPatientSigns icuPatientSigns)
    {
        return toAjax(icuPatientSignsService.updateIcuPatientSigns(icuPatientSigns));
    }

    /**
     * 删除健康监护
     */
    @PreAuthorize("@ss.hasPermi('system:signs:remove')")
    @Log(title = "健康监护", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rids}")
    public AjaxResult remove(@PathVariable Long[] rids)
    {
        return toAjax(icuPatientSignsService.deleteIcuPatientSignsByRids(rids));
    }
}
