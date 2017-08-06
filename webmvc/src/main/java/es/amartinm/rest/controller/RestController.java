package es.amartinm.rest.controller;

import es.amartinm.rest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class RestController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    User getUser(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new User("Alvaro",name,"amartinm@mail.es","empresa");
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody
    User postUser(@RequestBody User user) {
        user.setLastname(user.getLastname()+"2");
        return user;
    }
}
