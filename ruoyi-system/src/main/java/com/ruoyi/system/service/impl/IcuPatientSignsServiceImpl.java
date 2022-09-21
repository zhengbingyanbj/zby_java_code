package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IcuPatientSignsMapper;
import com.ruoyi.system.domain.IcuPatientSigns;
import com.ruoyi.system.service.IIcuPatientSignsService;

/**
 * 健康监护Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-01
 */
@Service
public class IcuPatientSignsServiceImpl implements IIcuPatientSignsService 
{
    @Autowired
    private IcuPatientSignsMapper icuPatientSignsMapper;

    /**
     * 查询健康监护
     * 
     * @param rid 健康监护主键
     * @return 健康监护
     */
    @Override
    public IcuPatientSigns selectIcuPatientSignsByRid(Long rid)
    {
        return icuPatientSignsMapper.selectIcuPatientSignsByRid(rid);
    }

    /**
     * 查询健康监护列表
     * 
     * @param icuPatientSigns 健康监护
     * @return 健康监护
     */
    @Override
    public List<IcuPatientSigns> selectIcuPatientSignsList(IcuPatientSigns icuPatientSigns)
    {
        return icuPatientSignsMapper.selectIcuPatientSignsList(icuPatientSigns);
    }

    /**
     * 新增健康监护
     * 
     * @param icuPatientSigns 健康监护
     * @return 结果
     */
    @Override
    public int insertIcuPatientSigns(IcuPatientSigns icuPatientSigns)
    {
        icuPatientSigns.setCreateTime(DateUtils.getNowDate());
        return icuPatientSignsMapper.insertIcuPatientSigns(icuPatientSigns);
    }

    /**
     * 修改健康监护
     * 
     * @param icuPatientSigns 健康监护
     * @return 结果
     */
    @Override
    public int updateIcuPatientSigns(IcuPatientSigns icuPatientSigns)
    {
        return icuPatientSignsMapper.updateIcuPatientSigns(icuPatientSigns);
    }

    /**
     * 批量删除健康监护
     * 
     * @param rids 需要删除的健康监护主键
     * @return 结果
     */
    @Override
    public int deleteIcuPatientSignsByRids(Long[] rids)
    {
        return icuPatientSignsMapper.deleteIcuPatientSignsByRids(rids);
    }

    /**
     * 删除健康监护信息
     * 
     * @param rid 健康监护主键
     * @return 结果
     */
    @Override
    public int deleteIcuPatientSignsByRid(Long rid)
    {
        return icuPatientSignsMapper.deleteIcuPatientSignsByRid(rid);
    }
}
