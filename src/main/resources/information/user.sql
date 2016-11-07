create table user(
  id char(36) primary key, -- id主键 使用uuid()生成
  username varchar(18) not null unique, -- 用户名,至多18位英文输入模式下的符号
  password varchar(22) not null. -- 密码,至多22位英文输入模式下的符号
  nickname nvarchar(16), -- 用户昵称
  realm tinyint(4) -- 用户角色
);