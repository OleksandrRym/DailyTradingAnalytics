package com.orymar.shopik.service;

import com.orymar.shopik.http.request.ProductCreateRequest;
import com.orymar.shopik.http.request.ProductUpdateRequest;
import com.orymar.shopik.entity.ProductEntity;

import java.util.UUID;

public interface ProductService {
  ProductEntity update(UUID id, ProductUpdateRequest productUpdateRequest);

  ProductEntity getById(UUID id);

  void delete(UUID id);

  ProductEntity create(ProductCreateRequest productCreateRequest);
}
