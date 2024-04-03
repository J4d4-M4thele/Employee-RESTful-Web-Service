package net.javaguides.ems.service;

import net.javaguides.ems.dto.DepartmentDto;
import java.util.List;

public interface DepartmentService {
    DepartmentDto createDept(DepartmentDto departmentDto);

    DepartmentDto getDeptById(Long departmentId);

    List<DepartmentDto> getAllDepts();

    DepartmentDto updateDept(Long departmentId, DepartmentDto updatedDept);

    void deleteDept(Long departmentId);
}
