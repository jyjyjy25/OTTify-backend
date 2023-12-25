package tavebalak.OTTify.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tavebalak.OTTify.common.BaseResponse;
import tavebalak.OTTify.user.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {

    private final UserService userService;

    @DeleteMapping("/{uid}/likedPrograms/{pid}")
    @ResponseStatus(HttpStatus.OK)
    public BaseResponse<Long> deleteLikedProgram(@PathVariable("uid") Long userId, @PathVariable("pid") Long programId) {
        return BaseResponse.success(userService.deleteLikedProgram(userId, programId));
    }

    @DeleteMapping("/{uid}/uninterestedPrograms/{pid}")
    @ResponseStatus(HttpStatus.OK)
    public BaseResponse<Long> deleteUninterestedProgram(@PathVariable("uid") Long userId, @PathVariable("pid") Long programId) {
        return BaseResponse.success(userService.deleteUninterestedProgram(userId, programId));
    }

}
