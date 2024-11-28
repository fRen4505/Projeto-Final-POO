package ruahma.renan.ecommerceapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruahma.renan.ecommerceapplication.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

}
