package be.vdab.todo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
class UserController {
    private final UserClient userClient;
    UserController(UserClient userClient) {
        this.userClient = userClient;
    }
    @GetMapping("{id}")
    User findTodosById(@PathVariable long id) {
        return userClient.findTodosById(id).orElseThrow(UserNietGevondenException::new);
    }
}
