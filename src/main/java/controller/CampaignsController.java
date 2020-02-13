package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Campaigns;

import repository.CampaignsRepository;

@RestController
@RequestMapping("/api")
public class CampaignsController {
	
	@Autowired
	public CampaignsRepository campaignsRepository;


	@GetMapping("/campaigns")
    public ResponseEntity<?> getAllCampaigns() {
	 
	List<Campaigns> campaigns;
	
	 try {
     	campaigns = campaignsRepository.findAll();
     	return ResponseEntity.ok(campaigns);
     } catch (Exception ex) {
    	 return ResponseEntity.ok(null);
     }
		
    }
	
	@PostMapping("/campaigns")
    public ResponseEntity<?> createCampaign(@Valid @RequestBody Campaigns campaigns) {

//		return ResponseEntity.ok(campaigns);
		Campaigns campaigns1 = null;
        try {
        	campaigns1 = campaignsRepository.save(campaigns);
        } catch (Exception ex) {
            
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
       
       
        map.put("message", "Successfully data saved.");
        map.put("data", campaigns1);
   
        return ResponseEntity.ok(map);
    }
	
	@PutMapping("/campaigns")
    public ResponseEntity<?> updateCampaign(@Valid @RequestBody Campaigns campaigns) {

//		return ResponseEntity.ok(campaigns);
		Campaigns campaigns1 = null;
        try {
        	campaigns1 = campaignsRepository.save(campaigns);
        } catch (Exception ex) {
            
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
       
       
        map.put("message", "Successfully data saved.");
        map.put("data", campaigns1);
   
        return ResponseEntity.ok(map);
    }
	
	@GetMapping("/campaigns/{id}")
    public ResponseEntity<?> getAllCampaignById(@PathVariable Long id) {
	 
	Optional<Campaigns> campaigns;
	
	 try {
     	campaigns = campaignsRepository.findById(id);
     	
     } catch (Exception ex) {
    	 return ResponseEntity.ok(null);
     }
	 
	 return ResponseEntity.ok(campaigns);
	}
	 
	 @DeleteMapping("/campaigns/{id}")
	    public ResponseEntity<?> getAllCampaignByDelete(@PathVariable Long id) {
		
		
		 try {
	     	 campaignsRepository.deleteById(id);

	     } catch (Exception ex) {
	    	 return ResponseEntity.ok(null);
	     }
		 
	     	return ResponseEntity.ok("Successfully data deleted.");
	 }
}
