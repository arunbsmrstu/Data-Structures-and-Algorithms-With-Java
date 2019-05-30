/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms.graph;

import com.algorithoms.bag.Bag;

/**
 *
 * @author Arun
 */
public class Graph {

    private int V; // number of vertices
    private int E; // number of edges
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Integer>[]) new Bag[V]; // Create array of lists.
        for (int v = 0; v < V; v++) // Initialize all lists
        {
            adj[v] = new Bag<Integer>(); // to empty.
        }
    }

    

    public void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v’s list.
        adj[w].add(v); // Add v to w’s list.
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int getV() {
        return V;
    }

    public void setV(int V) {
        this.V = V;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }

    public Bag<Integer>[] getAdj() {
        return adj;
    }

    public void setAdj(Bag<Integer>[] adj) {
        this.adj = adj;
    }

}
