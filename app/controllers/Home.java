package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Home extends Controller {

	public Result pooja() {
		return ok("Pooja");
	}
}
