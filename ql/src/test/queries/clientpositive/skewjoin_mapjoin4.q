set hive.mapred.mode=nonstrict;
set hive.optimize.skewjoin.compiletime = true;
set hive.auto.convert.join=true;

CREATE TABLE T1_n124(key STRING, val STRING)
SKEWED BY (key) ON ((2), (8)) STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH '../../data/files/T1.txt' INTO TABLE T1_n124;

CREATE TABLE T2_n73(key STRING, val STRING)
SKEWED BY (key) ON ((3), (8)) STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH '../../data/files/T2.txt' INTO TABLE T2_n73;

CREATE TABLE T3_n27(key STRING, val STRING) STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH '../../data/files/T3.txt' INTO TABLE T3_n27;

-- copy from skewjoinopt7
-- test compile time skew join and auto map join
-- This test is for validating skewed join compile time optimization for more than
-- 2 tables. The join key is the same, and so a 3-way join would be performed.
-- 2 of the 3 tables are skewed on the join key
-- adding a order by at the end to make the results deterministic

EXPLAIN
SELECT a.*, b.*, c.* FROM T1_n124 a JOIN T2_n73 b ON a.key = b.key JOIN T3_n27 c on a.key = c.key;

SELECT a.*, b.*, c.* FROM T1_n124 a JOIN T2_n73 b ON a.key = b.key JOIN T3_n27 c on a.key = c.key
ORDER BY a.key, b.key, c.key, a.val, b.val, c.val;
