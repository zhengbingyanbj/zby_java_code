package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CfgAreaMapper;
import com.ruoyi.system.domain.CfgArea;
import com.ruoyi.system.service.ICfgAreaService;

/**
 * 省市区Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
@Service
public class CfgAreaServiceImpl implements ICfgAreaService 
{
    @Autowired
    private CfgAreaMapper cfgAreaMapper;

    /**
     * 查询省市区
     * 
     * @param caId 省市区主键
     * @return 省市区
     */
    @Override
    public CfgArea selectCfgAreaByCaId(Long caId)
    {
        return cfgAreaMapper.selectCfgAreaByCaId(caId);
    }

    /**
     * 查询省市区列表
     * 
     * @param cfgArea 省市区
     * @return 省市区
     */
    @Override
    public List<CfgArea> selectCfgAreaList(CfgArea cfgArea)
    {
        return cfgAreaMapper.selectCfgAreaList(cfgArea);
    }

    /**
     * 新增省市区
     * 
     * @param cfgArea 省市区
     * @return 结果
     */
    @Override
    public int insertCfgArea(CfgArea cfgArea)
    {
        cfgArea.setCreateTime(DateUtils.getNowDate());
        return cfgAreaMapper.insertCfgArea(cfgArea);
    }

    /**
     * 修改省市区
     * 
     * @param cfgArea 省市区
     * @return 结果
     */
    @Override
    public int updateCfgArea(CfgArea cfgArea)
    {
        cfgArea.setUpdateTime(DateUtils.getNowDate());
        return cfgAreaMapper.updateCfgArea(cfgArea);
    }

    /**
     * 批量删除省市区
     * 
     * @param caIds 需要删除的省市区主键
     * @return 结果
     */
    @Override
    public int deleteCfgAreaByCaIds(Long[] caIds)
    {
        return cfgAreaMapper.deleteCfgAreaByCaIds(caIds);
    }

    /**
     * 删除省市区信息
     * 
     * @param caId 省市区主键
     * @return 结果
     */
    @Override
    public int deleteCfgAreaByCaId(Long caId)
    {
        return cfgAreaMapper.deleteCfgAreaByCaId(caId);
    }
}
