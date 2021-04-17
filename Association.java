/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejia
 */
class Association<K, V> {
    private K key;
    private V value;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getkey() {
        return key;
    }

    public K setkey(K key) {
        this.key = key;
        return key;
    }

    public V getvalue() {
        return value;
    }

    public V setvalue(V value) {
        this.value = value;
        return value;
    }
    
    
}
