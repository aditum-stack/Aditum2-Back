package com.ten.aditum2.back.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 社区信息表
 */
@Data
@Accessors(chain = true)
public class Community {
    /**
     * 主键ID Auto
     */
    private Integer id;
    /**
     * 社区ID Unique
     */
    private String communityId;
    /**
     * 社区名称
     */
    private String communityName;
    /**
     * 社区城市
     */
    private String communityCity;
    /**
     * 社区地址
     */
    private String communityAddress;
    /**
     * 社区设备总数
     */
    private Integer deviceCount;
    /**
     * 社区在线设备数
     */
    private Integer deviceOnlineCount;
    /**
     * 社区用户总数
     */
    private Integer personCount;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 删除标记
     */
    private Integer isDeleted;
}
