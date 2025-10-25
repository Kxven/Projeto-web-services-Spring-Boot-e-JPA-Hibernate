package com.webproject.course.entities;

import com.webproject.course.entities.pk.OrderItemPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable{
    private static final long  serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPk id;
    private Integer quentity;
    private Double price;

    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quentity,Double price ){
        super();
        id.setOrder(order);
        id.setProduct(product);
        this.quentity = quentity;
        this.price = price;
    }

    public Order getOrder(){
        return id.getOrder();
    }
    public void setOrder(Order order){
        id.setOrder(order);
    }
    public Order getProduct(){
        return id.getOrder();
    }
    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuentity(){
        return quentity;
    }

    public void setQuentity( Integer quentity ){
        this.quentity = quentity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice( Double price ){
        this.price = price;
    }

    @Override
    public boolean equals( Object o ){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id,orderItem.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }
}

