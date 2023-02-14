package com.ds.pattern.create.builder.pattern;

import lombok.Data;

@Data
public class Product {
    private String firstName;
    private String lastName;

    public static class BuilderImpl implements Builder{

        private Product product = new Product();

        @Override
        public Product builder() {
            return product;
        }

        public BuilderImpl setFirstName(String firstName){
            product.setFirstName(firstName);
            return this;
        }

        public BuilderImpl setLastName(String lastName){
            product.setLastName(lastName);
            return this;
        }
    }

}
