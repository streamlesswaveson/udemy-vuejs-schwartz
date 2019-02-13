package udemy.fifteenbackend.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udemy.fifteenbackend.domain.UserEntity;
import udemy.fifteenbackend.domain.UserRepository;


@CrossOrigin("*")
@Slf4j
@RestController
@RequestMapping("/api")
public class FifteenApi {

    private final UserRepository userRepository;

    public FifteenApi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestBody UserCommand user) {
        UserEntity entity = UserEntity.builder()
                .email(user.getEmail())
                .username(user.getUsername())
                .build();
        entity = userRepository.save(entity);
        return ResponseEntity.ok(entity);
    }

    @RequestMapping(value = "/user/{num}", method = RequestMethod.GET)
    public ResponseEntity getUser( @PathVariable("num") Long num) {

        return ResponseEntity.ok(userRepository.findById(num));
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    static class UserCommand {
        String email;
        String username;
    }

}
