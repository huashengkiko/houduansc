DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,tenant_id varchar(32),created_by varchar(32),updated_by varchar(32),created_at date,updated_at date, dr int(1));

INSERT INTO product(id, name, price, tenant_id, created_by, updated_by, created_at, updated_at, dr) VALUES ('1', '苹果', 20, null, null, null, null, null, 0),
('2', '梨', 10, null, null ,null, null, null, 0),
('3', '桃子', 123, null, null ,null, null, null, 0),
('4', '香蕉', 11, null, null ,null, null, null, 0),
('5', '猕猴桃', 50, null, null ,null, null, null, 0),
('6', '桔子', 33, null, null ,null, null, null, 0),
('7', '菠萝', 90, null, null ,null, null, null, 0),
('8', '芒果', 766, null, null ,null, null, null, 0),
('9', '红枣', 29, null, null ,null, null, null, 0),
('10', '榴莲', 990, null, null ,null, null, null, 0),
('11', '柚子', 291, null, null ,null, null, null, 0),
('12', '小番茄', 200, null, null ,null, null, null, 0);
CREATE TABLE IF NOT EXISTS spc_financing_public_attribute(
    id varcahr(32) not null primary key,    created_by varchar(255)  ,    created_at datetime  ,    updated_by varchar(255)  ,    updated_at datetime  ,    tenant_id varchar(255) not null ,    product_id varchar(255) not null ,    dr tinyint not null ,    is_exchange tinyint not null ,    is_joining_trader_visible tinyint not null ,    is_calculate_sales_performance tinyint not null ,    is_sales_performance_distribution tinyint not null ,    is_calculate_manual_performance tinyint not null ,    is_distribution_secondary_performance tinyint not null ,    showyu__distribution_proportion int   ,    chunyu__distribution_proportion int   ,    is_vendibility tinyint not null ,    ext1 varchar(255)  ,    ext2 varchar(255)  ,    ext3 varchar(255)  ,    ext4 varchar(255)  ,    ext_json varchar(255)  );
CREATE TABLE IF NOT EXISTS spc_product_pre_category(
    id varcahr(32) not null primary key,    created_by varchar(255)  ,    created_at datetime  ,    updated_by varchar(255)  ,    updated_at datetime  ,    tenant_id varchar(255) not null ,    product_id varchar(255) not null ,    category_id varchar(255) not null ,    dr tinyint not null ,    ext1 varchar(255)  ,    ext2 varchar(255)  ,    ext3 varchar(255)  ,    ext4 varchar(255)  ,    ext_json varchar(255)  );
CREATE TABLE IF NOT EXISTS spc_images(
    id varcahr(32) not null primary key,    created_by varchar(255)  ,    created_at datetime  ,    updated_by varchar(255)  ,    updated_at datetime  ,    tenant_id varchar(255) not null ,    dr tinyint not null ,    target_id varchar(255) not null ,    images_url varchar(255) not null ,    type varchar(255) not null ,    ext1 varchar(255)  ,    ext2 varchar(255)  ,    ext3 varchar(255)  ,    ext4 varchar(255)  ,    ext_json varchar(255)  );
CREATE TABLE IF NOT EXISTS hsp_order_summary(
    id varcahr(32) not null primary key,    tenant_code varchar(255) not null ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    version int   ,    dr tinyint  ,    platform_discount_money int   ,    shop_discount_money int   ,    sku_discount_money int   ,    freight_money int   ,    item_money int   ,    pay_money int   ,    member_id varchar(255)  ,    member_name varchar(255)  ,    member_code varchar(255)  ,    pay_type varchar(255)  ,    pay_channel varchar(255)  ,    pay_deadline datetime  ,    pay_order_no varchar(255)  ,    pay_status varchar(255)  ,    paid_at datetime  ,    member_phone varchar(255)  ,    remark1 varchar(255)  ,    remark2 varchar(255)  ,    remark3 varchar(255)  ,    remark4 varchar(255)  );
CREATE TABLE IF NOT EXISTS hsp_active_product(
    id varcahr(32) not null primary key,    tenant_code varchar(255)  ,    created_at datetime  ,    created_by varchar(255)  ,    updated_at datetime  ,    updated_by varchar(255)  ,    version int   ,    dr tinyint  ,    remark1 varchar(255)  ,    remark2 varchar(255)  ,    remark3 varchar(255)  ,    remark4 varchar(255)  ,    name varchar(255)  ,    type varchar(255)  ,    sale_price int   ,    image_url varchar(255)  ,    description varchar(255)  ,    jion_activity int   );
