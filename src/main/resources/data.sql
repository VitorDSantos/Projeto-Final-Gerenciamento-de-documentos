INSERT INTO USUARIO(nome, numeroOAB, login, nroProcesso, senha) VALUES('adm', 324156, 'adm@gmail.com', 3, '12345');
INSERT INTO USUARIO(nome, numeroOAB, login, nroProcesso, senha) VALUES('adm2', 645213, 'adm2@gmail.com', 3, '54321');

INSERT INTO DOCUMENTO(
nome, tipoDocumento, pathArquivo,
 dataUpload, usuarioProprietario,
 processos) 
 VALUES(' copia de identidade', 'pdf', 'desktop', 
 '24-11-2021', 'adm','principal');
