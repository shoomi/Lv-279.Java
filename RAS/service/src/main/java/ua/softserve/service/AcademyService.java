package ua.softserve.service;


import ua.softserve.persistence.dto.AcademyDTO;
import ua.softserve.persistence.entity.Academy;

import java.util.List;

public interface AcademyService {
    Academy getById(Integer id);

    List<Academy> getAllAcademys();

    List<Academy> findAllByName(String name);

    void save(Academy user);

    void saveDTO(AcademyDTO academyDTO);

    void saveCustom(int id,String role,int[] arr, EmployeeService employeeService);

    Academy findOne(int id);

    Academy findWithEmployeeTeacher(int id);

    Academy findWithEmployeeExperts(int id);

    Academy findWithEmployeeInterviewers(int id);

    List<Academy> findWithEmployeeExperts();

}
