class OrderedStream {
    String[] str;
    int ptr = 1;

    public OrderedStream(int n) {
        str = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        str[idKey] = value;
        List<String> result = new ArrayList<>();

        while(ptr < str.length && str[ptr] != null){
            result.add(str[ptr++]);
        }

        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */