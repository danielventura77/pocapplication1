CREATE TABLE `contato` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_cod_operadora` bigint(20) DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8

CREATE TABLE `operadora` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `preco` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8