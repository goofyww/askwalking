package com.cloud.askwalking.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 添加api请求对象
 *
 * @author niuzhiwei
 */
@ApiModel(value = "修改API请求对象")
@Getter
@Setter
@ToString
public class ModifyConfigureApiDTO implements Serializable {

    @NotBlank(message = "添加API,主键不能空")
    @ApiModelProperty(value = "主键", required = true)
    private String id;

    @ApiModelProperty(value = "应用名称，调用服务注册名")
    private String applicationName;

    @ApiModelProperty(value = "协议", allowableValues = "RPC,FEIGN")
    private String protocol;

    @ApiModelProperty(value = "API类型", allowableValues = "API,ADMIN,SAAS")
    private String apiType;

    @ApiModelProperty(value = "请求方式，默认为GET，", allowableValues = "GET,POST")
    private String requestMethod;

    @ApiModelProperty(value = "接口地址，全类名")
    private String apiInterface;

    @ApiModelProperty(value = "接口版本")
    private String apiVersion;

    @ApiModelProperty(value = "请求对象")
    private String apiRequestClass;

    @ApiModelProperty(value = "接口方法")
    private String apiMethod;

    @ApiModelProperty(value = "接口分组")
    private String apiGroup;

    @ApiModelProperty(value = "接口名称")
    private String apiName;

    @ApiModelProperty(value = "异步支持,默认为0， 0：同步 1：异步", allowableValues = "0,1")
    private Boolean apiAsync;

    @ApiModelProperty(value = "重载支持,默认为1， 0：不支持 1：支持,对参数qps 、avgTt、maxThread生效", allowableValues = "1,0")
    private Boolean apiReload;

    @ApiModelProperty(value = "响应mock数据,此数据必须为json格式,,否则网关报错：json序列化失败")
    private String mockResponse;

    @ApiModelProperty(value = "系统保护,默认为1，开启系统保护后限流规则生效,参数 0：开启 1：不开启", allowableValues = "1,0")
    private Integer systemGuard;

    @ApiModelProperty(value = "限流类型,默认为2，1：系统限流目前不支持 2：api限流", allowableValues = "2,1")
    private Integer flowControlRuleType;

    @ApiModelProperty(value = "每秒请求数，默认-1不限制")
    private Float qps;

    @ApiModelProperty(value = "平均响应时间，默认-1不限制")
    private Long avgRt;

    @ApiModelProperty(value = "最大并发数，默认-1不限制")
    private Long maxThread;

    @ApiModelProperty(value = "签名校验，默认为1，0：不校验，1：校验", allowableValues = "1,0")
    private Integer signCheck;

}
