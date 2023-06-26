package com.BenStore.BenStore.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ViewsController {

    @GetMapping("/index")
    public RedirectView RedirectIn() {
        return new RedirectView("index.html");
    }

    @GetMapping("/cart")
    public RedirectView RedirectCart() {
        return new RedirectView("cart.html");
    }

    @GetMapping("/checkout")
    public RedirectView RedirectCheckout() {
        return new RedirectView("checkout.html");
    }

    @GetMapping("/detail")
    public RedirectView RedirectDetail() {
        return new RedirectView("detail.html");
    }

    @GetMapping("/contact")
    public RedirectView RedirectContact() {
        return new RedirectView("contact.html");
    }

    @GetMapping("/shop")
    public RedirectView RedirctShop() {
        return new RedirectView("shop.html");
    }
}
