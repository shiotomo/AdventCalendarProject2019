CREATE TABLE IF NOT EXISTS `memo` (
    `id` BIGINT AUTO_INCREMENT,
    `body` VARCHAR(256),
    `created_at` TIMESTAMP,
    `updated_at` TIMESTAMP,
    PRIMARY KEY (`id`)
);