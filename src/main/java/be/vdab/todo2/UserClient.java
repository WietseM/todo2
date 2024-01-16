package be.vdab.todo2;

import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
class UserClient {
    private final Requests requests;
    UserClient(Requests requests) {
        this.requests = requests;
    }
    Optional<User> findTodosById(long id) {
        try {
            var response = requests.findTodosById(id);
            var user = new User(Arrays.stream(response.todos()).sorted((p1, p2) -> p1.prioriteit() - p2.prioriteit()).toList());
            return Optional.of(user);
        } catch (HttpClientErrorException.NotFound ex) {
            return Optional.empty();
        }
    }
}
