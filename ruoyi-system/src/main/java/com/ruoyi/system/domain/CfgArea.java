package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 省市区对象 cfg_area
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public class CfgArea extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long caId;

    /** 父区域编码 */
    @Excel(name = "父区域编码")
    private String parentAreaCode;

    /** 区域级别 1省/直辖市 2市 3区/县 */
    @Excel(name = "区域级别 1省/直辖市 2市 3区/县")
    private Integer areaLevel;

    /** 区域编码 */
    @Excel(name = "区域编码")
    private String areaCode;

    /** 区域名称 */
    @Excel(name = "区域名称")
    private String areaName;

    /** 城市拼音首字母 */
    @Excel(name = "城市拼音首字母")
    private String firstLetter;

    /** 地区编码 */
    @Excel(name = "地区编码")
    private String territoryCode;

    /** 地区名称 */
    @Excel(name = "地区名称")
    private String territoryName;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 删除状态： Y已删除  N未删除 */
    @Excel(name = "删除状态： Y已删除  N未删除")
    private String isDeleted;

    /** 邮编 */
    @Excel(name = "邮编")
    private String postCode;

    /** hiscode */
    @Excel(name = "hiscode")
    private String hisAreaCode;

    /** his name */
    @Excel(name = "his name")
    private String hisAreaName;

    /** his rou id */
    @Excel(name = "his rou id")
    private String hisRowId;

    public void setCaId(Long caId) 
    {
        this.caId = caId;
    }

    public Long getCaId() 
    {
        return caId;
    }
    public void setParentAreaCode(String parentAreaCode) 
    {
        this.parentAreaCode = parentAreaCode;
    }

    public String getParentAreaCode() 
    {
        return parentAreaCode;
    }
    public void setAreaLevel(Integer areaLevel) 
    {
        this.areaLevel = areaLevel;
    }

    public Integer getAreaLevel() 
    {
        return areaLevel;
    }
    public void setAreaCode(String areaCode) 
    {
        this.areaCode = areaCode;
    }

    public String getAreaCode() 
    {
        return areaCode;
    }
    public void setAreaName(String areaName) 
    {
        this.areaName = areaName;
    }

    public String getAreaName() 
    {
        return areaName;
    }
    public void setFirstLetter(String firstLetter) 
    {
        this.firstLetter = firstLetter;
    }

    public String getFirstLetter() 
    {
        return firstLetter;
    }
    public void setTerritoryCode(String territoryCode) 
    {
        this.territoryCode = territoryCode;
    }

    public String getTerritoryCode() 
    {
        return territoryCode;
    }
    public void setTerritoryName(String territoryName) 
    {
        this.territoryName = territoryName;
    }

    public String getTerritoryName() 
    {
        return territoryName;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setIsDeleted(String isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() 
    {
        return isDeleted;
    }
    public void setPostCode(String postCode) 
    {
        this.postCode = postCode;
    }

    public String getPostCode() 
    {
        return postCode;
    }
    public void setHisAreaCode(String hisAreaCode) 
    {
        this.hisAreaCode = hisAreaCode;
    }

    public String getHisAreaCode() 
    {
        return hisAreaCode;
    }
    public void setHisAreaName(String hisAreaName) 
    {
        this.hisAreaName = hisAreaName;
    }

    public String getHisAreaName() 
    {
        return hisAreaName;
    }

    public String getHisRowId() {
        return hisRowId;
    }

    public void setHisRowId(String hisRowId) {
        this.hisRowId = hisRowId;
    }
}
