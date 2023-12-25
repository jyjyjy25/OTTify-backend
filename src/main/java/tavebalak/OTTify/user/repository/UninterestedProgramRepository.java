package tavebalak.OTTify.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import tavebalak.OTTify.user.entity.UninterestedProgram;

import java.util.Optional;

public interface UninterestedProgramRepository extends JpaRepository<UninterestedProgram, Long> {
    Optional<UninterestedProgram> findByUserIdAndProgramId(@Param("userId") Long userId, @Param("programId") Long programId);
}
