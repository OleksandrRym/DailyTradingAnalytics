CREATE TABLE product (
    id          UUID PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    price       NUMERIC(19, 2) NOT NULL,
    description TEXT,
    created_at  TIMESTAMP WITH TIME ZONE NOT NULL,
    updated_at  TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE INDEX idx_product_name ON product(name);
