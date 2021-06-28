package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.LoginService;

public class LoginController extends Controller {

	public Result authenticateUser(Http.Request request) {
		JsonNode jn = request.body().asJson();
		if(jn == null) {
			return badRequest("Wrong format data");
		}
		String username = jn.get("username").asText();
		String password = jn.get("password").asText();
		LoginService ls = new LoginService();
		boolean isValid = ls.authenticateUser(username, password);
		if (isValid) {
			return ok("Login successfully");
		} else {
			return badRequest("Wrong username or password");
		}
	}
}
