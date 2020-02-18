package persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Business.checkMate;

@Repository
public interface checkMateRepository  extends JpaRepository<checkMate, Long> {

}