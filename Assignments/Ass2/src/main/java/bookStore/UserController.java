package bookStore;

import bookStore.dto.UserDTO;
import bookStore.entity.User;
import bookStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping(path = "/all_users")
//    public @ResponseBody Iterable<User> getAllUsers(){
//        return userService.findAll();
//    }
//
//    @GetMapping(path = "/add_user")
//    public String addUserForm(Model model){
//        model.addAttribute("user", new UserDTO());
//        return "add_user";
//
//    }
//
//    @PostMapping(path = "/add_user")
//    public String addUserSubmit(@ModelAttribute("user") @Valid UserDTO userDTO,
//                                BindingResult bindingResult){
//
//        if (bindingResult.hasErrors()) {
//            return "add_user";
//        }
//        userService.create(userDTO);
//        return "add_user_result";
//        //userService.create(userDTO);
//
//      //  return "/add_user_result";
//    }
//
//    @GetMapping(path = "/delete_user")
//    public String deleteUserForm(Model model){
//        model.addAttribute("user", new UserDTO());
//        return "delete_user";
//    }
//
//    @PostMapping(path = "/delete_user")
//    public String deleteUserSubmit(@ModelAttribute("user") @Valid UserDTO userDTO,
//                                   BindingResult bindingResult){
//        if (bindingResult.hasFieldErrors("username")) {
//            return "delete_user";
//        }
//        userService.deleteByUsername(userDTO.getUsername());
//        return "delete_user_result";
//    }
//
//    @GetMapping(path = "/update_user")
//    public String updateUserForm(Model model){
//        model.addAttribute("user",new UserDTO());
//        return "/update_user";
//    }
//
//    @PostMapping(path = "/update_user")
//    public String updateUserSubmit(@ModelAttribute("user") @Valid UserDTO userDTO,
//                                   BindingResult bindingResult){
//        if (bindingResult.hasFieldErrors("address") && bindingResult.hasFieldErrors("username")) {
//            return "update_user";
//        }
//        userService.updateUser(userDTO.getAddress(), userDTO.getUsername());
//        return "/update_user_result";
//    }
//
//    @GetMapping(path = "/list_all_users")
//    public ModelAndView ListAllUsers(){
//        List<User> users = new ArrayList<>();
//        userService.findAll().forEach(users::add);
//        ModelAndView mav = new ModelAndView("list_all_users");
//        mav.addObject(users);
//        return mav;
//    }
}
