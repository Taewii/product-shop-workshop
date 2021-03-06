package productshop.services;

import productshop.domain.models.binding.order.OrderProductBindingModel;
import productshop.domain.models.view.order.ListOrdersViewModel;
import productshop.domain.models.view.order.OrderDetailsViewModel;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    void addToCart(OrderProductBindingModel model);

    OrderDetailsViewModel findById(UUID id);

    List<ListOrdersViewModel> findAllOrdersWithUsers();

    List<ListOrdersViewModel> findAllFinalizedByUsername(String username);

    <T> List<T> findAllNotFinalizedByUsername(String username, Class<T> targetClass);

    void remove(UUID id, String username);

    void checkout(String username);
}
