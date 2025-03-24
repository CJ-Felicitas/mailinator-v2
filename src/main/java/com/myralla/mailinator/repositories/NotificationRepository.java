package com.myralla.mailinator.repositories;

import com.myralla.mailinator.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findTop10ByUserIdOrderByCreatedAtDesc(String userId);
}
