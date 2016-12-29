CREATE TABLE if not exists post ( zipcode CHAR(5)     NULL, sido VARCHAR(20) NULL, sigungu VARCHAR(20) NULL, doro VARCHAR(80) NULL, building1 int(5)     NULL, building2 int(5)     NULL );
select * from post;
delete from post;

LOAD data LOCAL INFILE 'D:/workspace/workspace_mybatis/post/DataFiles/post.txt' INTO table post   character set 'euckr' fields TERMINATED by '|' IGNORE 1 lines (@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;
