package be.vdab.todo2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface Requests {
    @GetExchange("{id}/todos")
    UserResponse findTodosById(@PathVariable long id);
}
