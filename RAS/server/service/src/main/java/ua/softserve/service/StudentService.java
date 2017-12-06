package ua.softserve.service;

import ua.softserve.service.dto.StudentsShortViewDto;
import ua.softserve.service.dto.StudentsViewDto;
import ua.softserve.persistence.entity.Students;

import java.util.List;

public interface StudentService {

    // /**
    // * Returns accepted students by academy id
    // *
    // * @param academyId - academy/group id
    // * @return list of students
    // */
    // List<StudentsViewDto> getAcceptedStudentsOfAcademy(Integer academyId);
    //
    // /**
    // * Returns all non-accepted students by academy id
    // *
    // * @param academyId - academy/group id
    // * @return list of students
    // */
    // List<StudentsShortViewDto> getStudentsOfAcademy(Integer academyId);
    //
    // void deleteStudentsFromAcademy(Integer academyId, List<Integer> userIds);
    //
    // void addStudentsToAcademy(Integer academyId, List<Integer> userIds);
    //
    // void saveResults(StudentsViewDto studentsViewDto);
    //
    // void saveAllStudents(List<StudentsViewDto> studentsViewDto);
    //
    // Students findById(Integer studentId);
    //
    // List<Students> getStudentFromGroup(Integer groupId);
    //
    // Students save(Students student);
}
