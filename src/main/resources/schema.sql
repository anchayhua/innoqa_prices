CREATE TABLE IF NOT EXISTS price (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand_id INT,
    start_date DATE,
    end_date DATE,
    price_list INT,
    product_id INT,
    priority INT,
    price DECIMAL(10, 2),
    curr VARCHAR(3)
);
