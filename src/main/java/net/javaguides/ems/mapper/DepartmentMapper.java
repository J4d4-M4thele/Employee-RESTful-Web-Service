package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.entity.Department;

public class DepartmentMapper {
    public static DepartmentDto mapToEmployeeDto(Department department) {
        return new DepartmentDto(

                department.getId(),
                department.getDeptName(),
                department.getDeptDesc()
        );
    }

    public static Department mapToEmployee(DepartmentDto departmentDto) {
        return new Department(
                departmentDto.getId(),
                departmentDto.getDeptName(),
                departmentDto.getDeptDesc()
        );
    }
}
