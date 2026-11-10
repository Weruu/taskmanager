package com.example.taskmanager.repository;

import com.example.taskmanager.entity.Task; // <-- обрати внимание: здесь должен быть пакет entity, а не model
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}