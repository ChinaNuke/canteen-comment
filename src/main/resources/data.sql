INSERT INTO user(id, username, password, gender, email) VALUES
    (1, 'test', '$2a$10$LflDGZut1QHoxvCfXF/oDuJgbIK1TKp7SYm5QslhyVE6IY9qE4LY6', '1', 'test@test.com'),
    (2, 'another_peng', '654321', '1', null);

INSERT INTO role(id, name) VALUES
    (1, 'ROLE_USER');

INSERT INTO canteen(name) VALUES
    ('黄山KK（北区一楼）'),
    ('大佳一（北区二楼）'),
    ('双凤老鹅汤（北区三楼）'),
    ('民族餐厅（北区二楼半）');

INSERT INTO comment(created_by_id, canteen_id, which_window, food_name, approvals, score_for_price, score_for_taste, title, content, comment_time) VALUES
    (1, 3, 22, '西红柿炒韭菜', 6, 5, 5, '简直是太好吃了', '太好吃了太好吃了太好吃了太好吃了太好吃了太好吃了太好吃了', '2020-10-21'),
    (2, 3, 22, '西红柿炒韭菜', 3, 1, 1, '白瞎一点都不好吃', '不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃不好吃', '2020-10-20'),
    (2, 2, 20, '韭菜炒西红柿', 2, 3, 4, '也还行吧', '还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧还行吧也就那么回事吧', '2020-9-01'),
    (2, 2, null, '韭菜炒西红柿', 2, 3, 4, '也不知道哪个窗口', '不知道哪个窗口不知道哪个窗口不知道哪个窗口不知道哪个窗口不知道哪个窗口不知道哪个窗口不知道哪个窗口不知道哪个窗口', '2020-10-02');
