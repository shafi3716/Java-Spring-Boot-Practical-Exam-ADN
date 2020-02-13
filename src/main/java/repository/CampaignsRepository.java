package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Campaigns;

@Repository
public interface CampaignsRepository extends JpaRepository<Campaigns, Long> {
	
}
