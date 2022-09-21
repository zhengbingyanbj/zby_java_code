package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 icu_patient_mi
 * 
 * @author ruoyi
 * @date 2022-08-27
 */
public class IcuPatientMi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long rid;

        /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 住院号 */
    @Excel(name = "住院号")
    private String zyNo;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 病历号 */
    @Excel(name = "病历号")
    private String recordNo;

    /** 护理级别 */
    @Excel(name = "护理级别")
    private String level;

    /** 体重 */
    @Excel(name = "体重")
    private Long weight;

    /** 克数 */
    @Excel(name = "克数")
    private String kg;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 床号 */
    @Excel(name = "床号")
    private String bedNo;

    /** 血型 */
    @Excel(name = "血型")
    private String bloodType;

    /** 身高 */
    @Excel(name = "身高")
    private Long height;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String birthday;

    /** 责任医生 */
    @Excel(name = "责任医生")
    private String doctor;

    /** 科室 */
    @Excel(name = "科室")
    private String dept;

    /** 护士 */
    @Excel(name = "护士")
    private String nurse;

    /** 病区 */
    @Excel(name = "病区")
    private String ward;

    /** 血压部位 */
    @Excel(name = "血压部位")
    private String mmhgPart;

    /** 入icu时间 */
    @Excel(name = "入icu时间")
    private String inTime;

    /** 出icu时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出icu时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outTime;

    /** 手术名称 */
    @Excel(name = "手术名称")
    private String surgeryName;

    /** 诊断信息 */
    @Excel(name = "诊断信息")
    private String diagnose;

    /** 过敏史 */
    @Excel(name = "过敏史")
    private String allergy;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String hr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nbp;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pr;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String spo2;


    private String mzDoc;

    public String getMzDoc() {
        return mzDoc;
    }

    public void setMzDoc(String mzDoc) {
        this.mzDoc = mzDoc;
    }

    public void setRid(Long rid)
    {
        this.rid = rid;
    }

    public Long getRid() 
    {
        return rid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setZyNo(String zyNo) 
    {
        this.zyNo = zyNo;
    }

    public String getZyNo() 
    {
        return zyNo;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setRecordNo(String recordNo) 
    {
        this.recordNo = recordNo;
    }

    public String getRecordNo() 
    {
        return recordNo;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setWeight(Long weight) 
    {
        this.weight = weight;
    }

    public Long getWeight() 
    {
        return weight;
    }
    public void setKg(String kg) 
    {
        this.kg = kg;
    }

    public String getKg() 
    {
        return kg;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setBedNo(String bedNo) 
    {
        this.bedNo = bedNo;
    }

    public String getBedNo() 
    {
        return bedNo;
    }
    public void setBloodType(String bloodType) 
    {
        this.bloodType = bloodType;
    }

    public String getBloodType() 
    {
        return bloodType;
    }
    public void setHeight(Long height) 
    {
        this.height = height;
    }

    public Long getHeight() 
    {
        return height;
    }
    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    public String getBirthday() 
    {
        return birthday;
    }
    public void setDoctor(String doctor) 
    {
        this.doctor = doctor;
    }

    public String getDoctor() 
    {
        return doctor;
    }
    public void setDept(String dept) 
    {
        this.dept = dept;
    }

    public String getDept() 
    {
        return dept;
    }
    public void setNurse(String nurse) 
    {
        this.nurse = nurse;
    }

    public String getNurse() 
    {
        return nurse;
    }
    public void setWard(String ward) 
    {
        this.ward = ward;
    }

    public String getWard() 
    {
        return ward;
    }
    public void setMmhgPart(String mmhgPart) 
    {
        this.mmhgPart = mmhgPart;
    }

    public String getMmhgPart() 
    {
        return mmhgPart;
    }
    public void setInTime(String inTime) 
    {
        this.inTime = inTime;
    }

    public String getInTime() 
    {
        return inTime;
    }
    public void setOutTime(Date outTime) 
    {
        this.outTime = outTime;
    }

    public Date getOutTime() 
    {
        return outTime;
    }
    public void setSurgeryName(String surgeryName) 
    {
        this.surgeryName = surgeryName;
    }

    public String getSurgeryName() 
    {
        return surgeryName;
    }
    public void setDiagnose(String diagnose) 
    {
        this.diagnose = diagnose;
    }

    public String getDiagnose() 
    {
        return diagnose;
    }
    public void setAllergy(String allergy) 
    {
        this.allergy = allergy;
    }

    public String getAllergy() 
    {
        return allergy;
    }
    public void setHr(String hr) 
    {
        this.hr = hr;
    }

    public String getHr() 
    {
        return hr;
    }
    public void setNbp(String nbp) 
    {
        this.nbp = nbp;
    }

    public String getNbp() 
    {
        return nbp;
    }
    public void setPr(String pr) 
    {
        this.pr = pr;
    }

    public String getPr() 
    {
        return pr;
    }
    public void setSpo2(String spo2) 
    {
        this.spo2 = spo2;
    }

    public String getSpo2() 
    {
        return spo2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rid", getRid())
            .append("name", getName())
            .append("zyNo", getZyNo())
            .append("age", getAge())
            .append("recordNo", getRecordNo())
            .append("level", getLevel())
            .append("weight", getWeight())
            .append("kg", getKg())
            .append("gender", getGender())
            .append("bedNo", getBedNo())
            .append("bloodType", getBloodType())
            .append("height", getHeight())
            .append("birthday", getBirthday())
            .append("doctor", getDoctor())
            .append("dept", getDept())
            .append("nurse", getNurse())
            .append("ward", getWard())
            .append("mmhgPart", getMmhgPart())
            .append("inTime", getInTime())
            .append("outTime", getOutTime())
            .append("surgeryName", getSurgeryName())
            .append("diagnose", getDiagnose())
            .append("allergy", getAllergy())
            .append("hr", getHr())
            .append("nbp", getNbp())
            .append("pr", getPr())
            .append("spo2", getSpo2())
            .toString();
    }
}
