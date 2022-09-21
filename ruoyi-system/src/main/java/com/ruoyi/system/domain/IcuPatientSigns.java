package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 健康监护对象 icu_patient_signs
 * 
 * @author ruoyi
 * @date 2022-09-01
 */
public class IcuPatientSigns extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long rid;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long patientId;

    /** 心率 */
    @Excel(name = "心率")
    private String heartRate;

    /** 血压 */
    @Excel(name = "血压")
    private String mmhg;

    /** 血氧 */
    @Excel(name = "血氧")
    private String oximeter;

    /** 舒张压 */
    @Excel(name = "舒张压")
    private String dbp;

    /** 收缩压 */
    @Excel(name = "收缩压")
    private String sbp;

    /** 呼吸 */
    @Excel(name = "呼吸")
    private String abel;

    /** 体温 */
    @Excel(name = "体温")
    private String temperature;

    /** 脉搏 */
    @Excel(name = "脉搏")
    private String  pulse;

    public void setRid(Long rid) 
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }
    public void setPatientId(Long patientId) 
    {
        this.patientId = patientId;
    }

    public Long getPatientId() 
    {
        return patientId;
    }
    public void setHeartRate(String heartRate) 
    {
        this.heartRate = heartRate;
    }

    public String getHeartRate() 
    {
        return heartRate;
    }
    public void setMmhg(String mmhg) 
    {
        this.mmhg = mmhg;
    }

    public String getMmhg() 
    {
        return mmhg;
    }
    public void setOximeter(String oximeter) 
    {
        this.oximeter = oximeter;
    }

    public String getOximeter() 
    {
        return oximeter;
    }
    public void setDbp(String dbp) 
    {
        this.dbp = dbp;
    }

    public String getDbp() 
    {
        return dbp;
    }
    public void setSbp(String sbp) 
    {
        this.sbp = sbp;
    }

    public String getSbp() 
    {
        return sbp;
    }
    public void setAbel(String abel) 
    {
        this.abel = abel;
    }

    public String getAbel() 
    {
        return abel;
    }
    public void setTemperature(String temperature) 
    {
        this.temperature = temperature;
    }

    public String getTemperature() 
    {
        return temperature;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }
}
