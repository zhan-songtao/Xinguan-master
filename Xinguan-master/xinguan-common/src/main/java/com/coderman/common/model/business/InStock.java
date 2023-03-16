package com.coderman.common.model.business;

import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Excel(value = "物资入库清单")
@Data
@Table(name = "biz_in_stock")
public class InStock {

    @Id
    @ExcelField(value = "编号",width = 50)
    private Long id;
    @ExcelField(value = "物资单号",width = 200)
    private String inNum;
    @ExcelField(value = "物资类型",width = 50)
    private Integer type;
    @ExcelField(value = "操作员",width = 80)
    private String operator;
    @ExcelField(value = "供应商编号",width = 100)
    private Long supplierId;
    @ExcelField(value = "创建时间", dateFormat = "yyyy年MM月dd日 HH:mm:ss", width = 180)
    private Date createTime;
    @ExcelField(value = "修改时间", dateFormat = "yyyy年MM月dd日 HH:mm:ss", width = 180)
    private Date modified;
    @ExcelField(value = "产品数量",width = 50)
    private Integer productNumber;
    @ExcelField(value = "备注",width = 200)
    private String remark;
    @ExcelField(value = "状态",width = 50)
    private Integer status;
}
