package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.IcuPatientSigns;

/**
 * 健康监护Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-01
 */
public interface IcuPatientSignsMapper 
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
     * 删除健康监护
     * 
     * @param rid 健康监护主键
     * @return 结果
     */
    public int deleteIcuPatientSignsByRid(Long rid);

    /**
     * 批量删除健康监护
     * 
     * @param rids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIcuPatientSignsByRids(Long[] rids);
}
