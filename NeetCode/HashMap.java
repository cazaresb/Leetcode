class MyHashMap {

    private final List<Integer> keys;
    private final List<Integer> values;

    public MyHashMap() {
        this.keys   = new ArrayList<Integer>();
        this.values = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        // check if we already have an entry for the key
        int idx = this.keys.indexOf(key);

        if (idx != -1)
        {
            // Key is in list, update the current entry with value
            values.set(idx, value);
        }
        else
        {
            // Key not in list
            values.add(value);
            keys.add(key);
        }
    }
    
    public int get(int key) {
        int idx = keys.indexOf(key);
        if (idx == -1) return idx;

        return values.get(idx);
    }
    
        public void remove(int key) {
        int idx = keys.indexOf(key);
        if (idx == -1)
        {
            return;
        }
        
        this.keys.remove(idx);
        this.values.remove(idx);
    }
}
