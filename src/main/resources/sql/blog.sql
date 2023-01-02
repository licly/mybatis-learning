CREATE TABLE `blog` (
                        `ID` int(11) NOT NULL,
                        `NAME` varchar(255) DEFAULT NULL,
                        `CONTENT` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO BLOG VALUES(1, 'desc', 'Mybatis Description');
INSERT INTO BLOG VALUES(2, 'help', 'Mapper Help Doc');