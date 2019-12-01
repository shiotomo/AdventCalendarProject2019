package work.tomosse.AdventCalendarProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import work.tomosse.AdventCalendarProject.entity.Memo;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long>{

}
