package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	
	boolean isVisited;
	T data;
	List<Vertex> neighbours = new ArrayList<Vertex>();
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<Vertex> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<Vertex> neighbours) {
		this.neighbours = neighbours;
	}
	public Vertex(T data) {
		this.data = data;
	}

}
