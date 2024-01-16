package be.vdab.todo2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNietGevondenException extends RuntimeException {
    UserNietGevondenException() {
        super("User niet gevonden");
    }
}
