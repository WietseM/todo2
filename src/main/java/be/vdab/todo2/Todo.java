package be.vdab.todo2;

import java.time.LocalDateTime;

record Todo(String tekst, int prioriteit, LocalDateTime gemaakt) {
}
