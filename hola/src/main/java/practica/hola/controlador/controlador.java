package practica.hola.controlador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class controlador {

@GetMapping("/miprimerapagina")
public String hola() {
    return "Hola soy una pagina 2";
}



}
