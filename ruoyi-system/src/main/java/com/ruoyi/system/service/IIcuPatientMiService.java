package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.IcuPatientMi;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-08-27
 */
public interface IIcuPatientMiService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param rid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public IcuPatientMi selectIcuPatientMiByRid(Long rid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<IcuPatientMi> selectIcuPatientMiList(IcuPatientMi icuPatientMi);

    /**
     * 新增【请填写功能名称】
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 结果
     */
    public int insertIcuPatientMi(IcuPatientMi icuPatientMi);

    /**
     * 修改【请填写功能名称】
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 结果
     */
    public int updateIcuPatientMi(IcuPatientMi icuPatientMi);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param rids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteIcuPatientMiByRids(Long[] rids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param rid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIcuPatientMiByRid(Long rid);

    /**
     * 查询窗口是不是被占用
     * @param bedNo
     * @return
     */
    IcuPatientMi selectIcuPatientBed(String bedNo);
}
