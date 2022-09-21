package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IcuPatientMiMapper;
import com.ruoyi.system.domain.IcuPatientMi;
import com.ruoyi.system.service.IIcuPatientMiService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-27
 */
@Service
public class IcuPatientMiServiceImpl implements IIcuPatientMiService 
{
    @Autowired
    private IcuPatientMiMapper icuPatientMiMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param rid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public IcuPatientMi selectIcuPatientMiByRid(Long rid)
    {
        return icuPatientMiMapper.selectIcuPatientMiByRid(rid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<IcuPatientMi> selectIcuPatientMiList(IcuPatientMi icuPatientMi)
    {
        return icuPatientMiMapper.selectIcuPatientMiList(icuPatientMi);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertIcuPatientMi(IcuPatientMi icuPatientMi)
    {

        return icuPatientMiMapper.insertIcuPatientMi(icuPatientMi);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param icuPatientMi 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateIcuPatientMi(IcuPatientMi icuPatientMi)
    {
        return icuPatientMiMapper.updateIcuPatientMi(icuPatientMi);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param rids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIcuPatientMiByRids(Long[] rids)
    {
        return icuPatientMiMapper.deleteIcuPatientMiByRids(rids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param rid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIcuPatientMiByRid(Long rid)
    {
        return icuPatientMiMapper.deleteIcuPatientMiByRid(rid);
    }

    @Override
    public IcuPatientMi selectIcuPatientBed(String bedNo) {
        return icuPatientMiMapper.selectIcuPatientBed(bedNo);
    }
}
