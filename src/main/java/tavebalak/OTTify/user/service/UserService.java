package tavebalak.OTTify.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tavebalak.OTTify.error.ErrorCode;
import tavebalak.OTTify.error.exception.NotFoundException;
import tavebalak.OTTify.user.entity.LikedProgram;
import tavebalak.OTTify.user.repository.LikedProgramRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final LikedProgramRepository likedProgramRepository;

    @Transactional
    public Long deleteLikedProgram(Long userId, Long programId) throws NotFoundException {
        LikedProgram likedProgram = likedProgramRepository.findByUserIdAndProgramId(userId, programId)
                .orElseThrow(() -> new NotFoundException(ErrorCode.ENTITY_NOT_FOUND));
        likedProgramRepository.delete(likedProgram);

        return likedProgram.getId();
    }
}
