package Efleure.Repository;

import Efleure.Entity.Fleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleurRepo extends JpaRepository<Fleur, Integer> {
}
