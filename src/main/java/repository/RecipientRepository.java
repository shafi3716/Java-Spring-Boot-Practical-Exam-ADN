package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Campaigns;
import com.example.demo.model.Recipients;

@Repository
public interface RecipientRepository extends JpaRepository<Recipients, Long> {
	
}
