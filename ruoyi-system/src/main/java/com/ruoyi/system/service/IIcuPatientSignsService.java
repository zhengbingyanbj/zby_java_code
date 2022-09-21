package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.IcuPatientSigns;

/**
 * 健康监护Service接口
 * 
 * @author ruoyi
 * @date 2022-09-01
 */
public interface IIcuPatientSignsService 
{
    /**
     * 查询健康监护
     * 
     * @param rid 健康监护主键
     * @return 健康监护
     */
    public IcuPatientSigns selectIcuPatientSignsByRid(Long rid);

    /**
     * 查询健康监护列表
     * 
     * @param icuPatientSigns 健康监护
     * @return 健康监护集合
     */
    public List<IcuPatientSigns> selectIcuPatientSignsList(IcuPatientSigns icuPatientSigns);

    /**
     * 新增健康监护
     * 
     * @param icuPatientSigns 健康监护
     * @return 结果
     */
    public int insertIcuPatientSigns(IcuPatientSigns icuPatientSigns);

    /**
     * 修改健康监护
     * 
     * @param icuPatientSigns 健康监护
     * @return 结果
     */
    public int updateIcuPatientSigns(IcuPatientSigns icuPatientSigns);

    /**
     * 批量删除健康监护
     * 
     * @param rids 需要删除的健康监护主键集合
     * @return 结果
     */
    public int deleteIcuPatientSignsByRids(Long[] rids);

    /**
     * 删除健康监护信息
     * 
     * @param rid 健康监护主键
     * @return 结果
     */
    public int deleteIcuPatientSignsByRid(Long rid);
}
