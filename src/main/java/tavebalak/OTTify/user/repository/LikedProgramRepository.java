package tavebalak.OTTify.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import tavebalak.OTTify.user.entity.LikedProgram;

import java.util.Optional;

public interface LikedProgramRepository extends JpaRepository<LikedProgram, Long> {
    Optional<LikedProgram> findByUserIdAndProgramId(@Param("userId") Long userId, @Param("programId") Long programId);
}
