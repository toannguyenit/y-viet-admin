package com.yviet.app.admin.y_viet_admin.mapper.clinic;


import com.yviet.app.admin.y_viet_admin.dto.request.clinic.ClinicCreateRequest;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicDetailEntity;
import com.yviet.app.admin.y_viet_admin.entity.clinic.ClinicEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClinicMapper {
    ClinicMapper INSTANCE = Mappers.getMapper(ClinicMapper.class);

    ClinicEntity toClinicEntity(ClinicCreateRequest clinicCreateRequest);

    ClinicDetailEntity toClinicDetailEntity(ClinicCreateRequest clinicCreateRequest);
}
