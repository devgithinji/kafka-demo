package com.densoft.kafkademo.payload;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime createdAt) {
}
