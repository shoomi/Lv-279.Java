package ua.softserve.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.softserve.persistence.entity.Academy;
import ua.softserve.persistence.entity.GroupInfoTeachers;
import ua.softserve.persistence.entity.TeacherTypes;

import java.util.List;
import java.util.Optional;

public interface GroupInfoTeachersRepository extends JpaRepository<GroupInfoTeachers, Integer> {
    List<GroupInfoTeachers> findAllByAcademyAndTeacherType(Academy academy, TeacherTypes teacherType);

    List<GroupInfoTeachers> findAllByTeacherType(TeacherTypes teacherType);

    List<GroupInfoTeachers> findAllByAcademyAcademyId(Integer academyAcademyId);

    void deleteGroupInfoTeachersById(Integer id);

}
