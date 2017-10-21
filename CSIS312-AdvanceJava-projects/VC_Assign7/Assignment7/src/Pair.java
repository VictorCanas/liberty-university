/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vscanas
 */

//Write a generic class Pair which has two type parameters—F and S
//The class header should be public class Pair<F, S>.)
public class Pair<F, S> {
	
	private F first;
	private S second;
	
	public Pair() {
		
	}
	
        //get
	public F getFirst() {
		return first;
	}

        //set
	public void setFirst(F first) {
		this.first = first;
	}

         //get
	public S getSecond() {
		return second;
	}

        //set
	public void setSecond(S second) {
		this.second = second;
	}
	
}
