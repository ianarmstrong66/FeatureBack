package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Business.IcheckMate;
import Constants.Constants;


@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class checkMateController {

	@Autowired
	private IcheckMate  checkMate;

	@GetMapping(path = Constants.CHECKMATE)
	public ResponseEntity<Boolean>  
		getCheckMate(@PathVariable("id") String id, @PathVariable("access") String access) {
		return ResponseEntity.ok(checkMate.getCheckMate(id,access));
	}
	@RequestMapping (
			value = Constants.CHECKMATE,
			headers = { "key1=id", "key2=access"}, method = RequestMethod.GET)
	@ResponseBody
	public Boolean getCheckMate() {
	return true;
			}
	
}