package com.example.accessingdatamysql.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/users") // This means URL's start with /demo (after Application path)
public class UserController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private UsersRepository usersRepository;

  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (
		  @RequestParam String admin,
		  @RequestParam String name,
		  @RequestParam String password,
		  @RequestParam String lang_id		  
		  ) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Users n = new Users();
    n.setAdmin(admin);
    n.setName(name);
    n.setPassword(password);
    n.setLang_id(lang_id);
    usersRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Users> getAllUsers() {
    // This returns a JSON or XML with the users
    return usersRepository.findAll();
  }
}