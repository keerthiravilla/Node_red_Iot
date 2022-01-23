
package com.SPMProject.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SPMProject.backend.dto.UserDTO;
import com.SPMProject.backend.jwt.JwtUserDetailsService;
import com.SPMProject.backend.repository.UserDao;
import com.SPMProject.backend.entityModel.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    public UserController(UserDao userDaoRepository) {
        this.userDaoRepository = userDaoRepository;
    }

    @Autowired
    private JwtUserDetailsService userRepository;


    private UserDao userDaoRepository;

 
    
    @PostMapping("/user")
    void addUser(@RequestBody UserDTO user) {
        userRepository.save(user);
    }

    @PostMapping("/updateUser")
    void updateUser(@RequestBody UserDTO user) {
        System.out.println("PASSWORD " + user.getPassword());
        System.out.println("EMAIL " + user.getEmail());
        System.out.println("ID " + user.getId());

        userRepository.updateUser(user);
    }

    @GetMapping("/users")
    public List<DAOUser> getUsers(){
        return (List<DAOUser>) userDaoRepository.findAll();
    }

    @GetMapping("/getUser")
    public DAOUser getUser(@RequestParam Long id){
        return (DAOUser) userDaoRepository.findById(id).orElse(new DAOUser());
    }

   // @Autowired
	//private SmtpMailSender smtpMailSender;
/*
    @GetMapping("/users")
    public void emergenza(UserDTO donazione) throws MessagingException
    {
        smtpMailSender.send("lorenzo.brancaleoni@studenti.unicam.it", "DONAZIONE EMERGENZA", "Raggiungere l'ospedale più vicino per effettuare una donazione!!");        
      
    }
*/
   @GetMapping("/existUser/{email}")
    public boolean existUser(@PathVariable String email){
        if(userRepository.findByEmail(email)==null){
            return false;
        }else{
            return true;
        }
    }
}




/*TEST
@RestController
public class UserController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
*/

