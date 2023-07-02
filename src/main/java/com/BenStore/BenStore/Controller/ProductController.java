package com.BenStore.BenStore.Controller;
import com.BenStore.BenStore.Categories.Jackets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    @GetMapping("/product/{id}")
    public String getProductDetails(@PathVariable("id") Long productId, Model model) {
        // Aquí puedes obtener los detalles del producto desde tu base de datos o cualquier otra fuente de datos
        Jackets product = productService.getProductById(productId);

        // Agrega el objeto product al modelo para pasarlo a la plantilla
        model.addAttribute("product", product);

        // Retorna el nombre de la plantilla para mostrarla
        return "product";
    }


}
