package com.geektcp.garden.spring.model.po;

import com.alibaba.excel.annotation.ExcelIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author Mr.Tang on 2020/9/19 11:54.
 */
@Data
public class SysBasePo {

    @Column(name = "is_enable")
    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    private String isEnable;

    @Column(name = "create_by")
    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    private String createBy;

    @Column(name = "create_date")
    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    private Date createDate;

    @Column(name = "update_by")
    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    private String updateBy;

    @Column(name = "update_date")
    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    private Date updateDate;

}
