package cn.enjoy.mapper;
import cn.enjoy.vo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(@Param(value = "id") Long id);
    public List<Product> findAll();
}