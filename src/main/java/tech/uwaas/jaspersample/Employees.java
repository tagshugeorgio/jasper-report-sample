package tech.uwaas.jaspersample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Employees extends JpaRepository<Employee, UUID> {
}
