package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Cart;

public interface ICartRepository {

	Cart create(Cart cart);
	Cart read(String cartId);
	void update(String cartId, Cart cart);
	void delete (String cartId);
}
