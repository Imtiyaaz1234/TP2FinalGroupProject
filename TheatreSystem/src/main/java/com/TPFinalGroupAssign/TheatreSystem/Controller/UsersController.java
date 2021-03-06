import TheatreSystem.Domain.Admin;
import TheatreSystem.Services.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/user")
public class UsersController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Users> getAllAdmin()
    {
        return userService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addUsers(@RequestBody Users user){
        userService.create(user);
    }

    @RequestMapping(value="/find{userID}")
    public @ResponseBody Users findAudioClip(@PathVariable Long userID){
        return userService.readById(userID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateUsers(@RequestBody Users user){
        userService.update(user);
    }

    @RequestMapping(value="/delete/{userID}",  method = RequestMethod.DELETE)
    public void deleteUsers(@PathVariable Users userID){

        userService.delete(userID);
    }

}


