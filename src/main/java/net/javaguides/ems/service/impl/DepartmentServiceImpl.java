package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.entity.Department;
import net.javaguides.ems.mapper.DepartmentMapper;
import net.javaguides.ems.repository.DepartmentRepository;
import net.javaguides.ems.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    //create department
    @Override
    public DepartmentDto createDept(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDept(departmentDto);
        Department savedDept = departmentRepository.save(department);
        return DepartmentMapper.mapToDeptDto(savedDept);
    }

    @Override
    public DepartmentDto getDeptById(Long departmentId) {
        return null;
    }

    @Override
    public List<DepartmentDto> getAllDepts() {
        return null;
    }

    @Override
    public DepartmentDto updateDept(Long departmentId, DepartmentDto updatedDept) {
        return null;
    }

    @Override
    public void deleteDept(Long departmentId) {

    }
}
