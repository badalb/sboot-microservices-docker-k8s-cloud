package org.product.service.restapi;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResourceApi {

	@RequestMapping(method = RequestMethod.GET, value = "/me")
	public Map<String, Object> me(Authentication authentication) {
		Map<String, Object> result = new HashMap<>();
		result.put("authentication", authentication);
		return result;
	}
}
