package com.wss.templateproject.mapper;

import com.wss.templateproject.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsPermissionMapper extends Mapper<UmsPermission> {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}