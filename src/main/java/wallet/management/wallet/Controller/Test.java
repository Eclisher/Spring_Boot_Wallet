package wallet.management.wallet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("")
    public String Welcome(){
        return "Votre serveur est  bien été demarrer";
    }

    @GetMapping("/ping")
    public  String Ping(){
        return "pong";
    }
}
