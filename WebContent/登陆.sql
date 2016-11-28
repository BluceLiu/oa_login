CREATE SCHEMA `yangsheng` ;


INSERT INTO `yangsheng`.`user` (`userId`, `userName`, `userTypeId`, `bumenId`, `gongzijibie`) VALUES ('1', '1', '1', '1', '1');
INSERT INTO `yangsheng`.`user` (`userId`, `userName`, `userTypeId`, `bumenId`, `gongzijibie`) VALUES ('2', '2', '2', '2', '2');
INSERT INTO `yangsheng`.`user` (`userId`, `userName`, `userTypeId`, `bumenId`, `gongzijibie`) VALUES ('3', '3', '3', '3', '3');
INSERT INTO `yangsheng`.`user` (`userId`, `userName`, `userTypeId`, `bumenId`, `gongzijibie`) VALUES ('4', '4', '4', '4', '4');
INSERT INTO `yangsheng`.`user` (`userId`, `userName`, `userTypeId`, `bumenId`, `gongzijibie`) VALUES ('5', '5', '5', '5', '5');

INSERT INTO `yangsheng`.`logininfo` (`loginInfoId`, `userId`, `loginInfoPwd`) VALUES ('1', '1', '1');
INSERT INTO `yangsheng`.`logininfo` (`loginInfoId`, `userId`, `loginInfoPwd`) VALUES ('2', '2', '2');
INSERT INTO `yangsheng`.`logininfo` (`loginInfoId`, `userId`, `loginInfoPwd`) VALUES ('3', '3', '3');
INSERT INTO `yangsheng`.`logininfo` (`loginInfoId`, `userId`, `loginInfoPwd`) VALUES ('4', '4', '4');
INSERT INTO `yangsheng`.`logininfo` (`loginInfoId`, `userId`, `loginInfoPwd`) VALUES ('5', '5', '5');


INSERT INTO `yangsheng`.`huibaokuai` (`huibaoKuaiId`, `kuaijiId`, `huibaoTitle`, `huibaoNeirong`) VALUES ('2', '2', '2', '2');
INSERT INTO `yangsheng`.`huibaokuai` (`huibaoKuaiId`, `kuaijiId`, `huibaoTitle`, `huibaoNeirong`) VALUES ('3', '4', '3', '3');

INSERT INTO `yangsheng`.`gongzi` (`gongziId`, `userId`, `chuqinQue`, `jiaban`, `gongziJiBie`, `gongziYing`) VALUES ('1', '1', '1', '1', '1', '1');
INSERT INTO `yangsheng`.`gongzi` (`gongziId`, `userId`, `chuqinQue`, `jiaban`, `gongziJiBie`, `gongziYing`) VALUES ('2', '2', '2', '2', '2', '2');