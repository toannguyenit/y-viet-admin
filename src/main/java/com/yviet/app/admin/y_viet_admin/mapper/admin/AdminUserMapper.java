package com.yviet.app.admin.y_viet_admin.mapper.admin;

import com.yviet.app.admin.y_viet_admin.dto.request.admin_user.AdminUserRequest;
import com.yviet.app.admin.y_viet_admin.entity.admin_user.AdminUserEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AdminUserMapper {
    AdminUserMapper INSTANCE = Mappers.getMapper(AdminUserMapper.class);

    AdminUserEntity toAdminUserEntity(AdminUserRequest adminUserRequest);
}
