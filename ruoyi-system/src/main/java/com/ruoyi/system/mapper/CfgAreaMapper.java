package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CfgArea;

/**
 * 省市区Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public interface CfgAreaMapper 
{
    /**
     * 查询省市区
     * 
     * @param caId 省市区主键
     * @return 省市区
     */
    public CfgArea selectCfgAreaByCaId(Long caId);

    /**
     * 查询省市区列表
     * 
     * @param cfgArea 省市区
     * @return 省市区集合
     */
    public List<CfgArea> selectCfgAreaList(CfgArea cfgArea);

    /**
     * 新增省市区
     * 
     * @param cfgArea 省市区
     * @return 结果
     */
    public int insertCfgArea(CfgArea cfgArea);

    /**
     * 修改省市区
     * 
     * @param cfgArea 省市区
     * @return 结果
     */
    public int updateCfgArea(CfgArea cfgArea);

    /**
     * 删除省市区
     * 
     * @param caId 省市区主键
     * @return 结果
     */
    public int deleteCfgAreaByCaId(Long caId);

    /**
     * 批量删除省市区
     * 
     * @param caIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCfgAreaByCaIds(Long[] caIds);
}
