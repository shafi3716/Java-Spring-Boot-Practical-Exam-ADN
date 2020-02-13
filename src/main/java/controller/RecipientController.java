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

import com.example.demo.model.Recipients;

import repository.RecipientRepository;

@RestController
@RequestMapping("/api")
public class RecipientController {

	@Autowired
	public RecipientRepository recipientRepository;


	@GetMapping("/recipients")
    public ResponseEntity<?> getAllRecipient() {
	 
	List<Recipients> ricipient;
	
	 try {
		 ricipient = recipientRepository.findAll();
     	return ResponseEntity.ok(ricipient);
     } catch (Exception ex) {
    	 return ResponseEntity.ok(null);
     }
		
    }
	
	@PostMapping("/ricipients")
    public ResponseEntity<?> createCampaign(@Valid @RequestBody Recipients ricipient) {

		Recipients ricipient1 = null;
        try {
        	ricipient1 = recipientRepository.save(ricipient);
        } catch (Exception ex) {
            
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
       
       
        map.put("message", "Successfully data saved.");
        map.put("data", ricipient1);
   
        return ResponseEntity.ok(map);
    }
	
	@PutMapping("/ricipients")
    public ResponseEntity<?> updateCampaign(@Valid @RequestBody Recipients ricipient) {

		Recipients ricipient1 = null;
        try {
        	ricipient1 = recipientRepository.save(ricipient);
        } catch (Exception ex) {
            
        }

        HashMap<String, Object> map = new HashMap<String, Object>();
       
       
        map.put("message", "Successfully data saved.");
        map.put("data", ricipient1);
   
        return ResponseEntity.ok(map);
    }
	
	@GetMapping("/ricipients/{id}")
    public ResponseEntity<?> getAllCampaignById(@PathVariable Long id) {
	 
	Optional<Recipients> ricipient;
	
	 try {
		 ricipient = recipientRepository.findById(id);
     	
     } catch (Exception ex) {
    	 return ResponseEntity.ok(null);
     }
	 
	 return ResponseEntity.ok(ricipient);
	}
	 
	 @DeleteMapping("/ricipients/{id}")
	    public ResponseEntity<?> getAllCampaignByDelete(@PathVariable Long id) {
		
		
		 try {
			 recipientRepository.deleteById(id);

	     } catch (Exception ex) {
	    	 return ResponseEntity.ok(null);
	     }
		 
	     	return ResponseEntity.ok("Successfully data deleted.");
	 }
}
