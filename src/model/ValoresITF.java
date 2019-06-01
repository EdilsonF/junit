package model;

public interface ValoresITF {
	Boolean ins(int v); // insere um valor
	int del(int i); // remove o valor armazenado no �ndice i e retorna o valor removido
	int size(); // retorna quantidade de valores armazenados
	double mean(); // retorna a m�dia dos valores armazenados
	int greater(); // retorna o maior valor armazenado
	int lower(); //retorna o menor valor armazenado
}
