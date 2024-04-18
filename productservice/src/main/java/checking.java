import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checking
{
    @GetMapping("/home1")
    public String check(){
        return "Welcome to home 1";
    }
}
