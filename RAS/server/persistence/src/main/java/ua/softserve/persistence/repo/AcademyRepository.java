package ua.softserve.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.softserve.persistence.entity.Academy;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface AcademyRepository extends JpaRepository<Academy, Integer> {

    @Query("select a.academyId from Academy a order by a.academyId")
    List<Integer> findAllAcademyId();
}
