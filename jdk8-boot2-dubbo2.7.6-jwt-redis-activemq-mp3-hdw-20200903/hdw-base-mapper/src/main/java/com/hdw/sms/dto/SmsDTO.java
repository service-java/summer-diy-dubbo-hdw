package com.hdw.sms.dto;

import com.hdw.common.mybatis.base.dto.CommonDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description com.hdw.sms.param
 * @Author TuMingLong
 * @Date 2019/11/7 10:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("查询消息参数对象")
public class SmsDTO extends CommonDTO {

    @ApiModelProperty("消息标题")
    private String title;
    @ApiModelProperty("消息类型ID")
    private String smsTypeId;
    @ApiModelProperty("消息类型名称")
    private String typeName;
}
