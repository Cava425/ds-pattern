package com.ds.pattern.create.builder.pattern;

import lombok.Data;

@Data
public class BuilderImpl implements Builder{

    private Product product = new Product();

    @Override
    public Product builder() {
        return product;
    }

    public Builder setFirstName(String firstName){
        product.setFirstName(firstName);
        return this;
    }

    public Builder setLastName(String lastName){
        product.setLastName(lastName);
        return this;
    }
}
