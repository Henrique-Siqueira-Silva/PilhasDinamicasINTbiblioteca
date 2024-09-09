package br.edu.fateczl.pilhasINT;

public class PilhasINT {

	No topo;

	public PilhasINT() {
		topo = null;
	}

	public boolean Empy() {
		if (topo == null) {
			return true;
		}
		return false;
	}

	public void Push(int dado) {
		No elemento = new No();
		elemento.dado = dado;
		elemento.proximo = topo;
		topo = elemento;

	}

	public int Pop() {
		if (Empy()) {
			System.err.println("Não ha elementos para empilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;

	}

	public int top() {
		if (Empy()) {
			System.err.println("Pilha vazia");
		}
		int valor = topo.dado;
		return valor;
	}

	public int Size() {
		int cta = 0;
		if (!Empy()) {
			No aux = topo;
			cta = 1;
			while (aux.proximo != null) {
				cta++;
				aux = aux.proximo;
			}
		}
		return cta;
	}

	public void max() {
		int max = topo.dado;
		if (!Empy()) {
			No aux = topo;
			int paux = aux.dado;
			while (aux.proximo != null) {
				if ( max < paux) {
					max = paux;
				}
				aux = aux.proximo;
				paux = aux.dado;
			}
		}
			System.out.println(max);
	}

}
