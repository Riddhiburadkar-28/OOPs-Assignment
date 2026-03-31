class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println("Modified String: " + sb);
    }
}

/*
Difference:
StringBuffer → Thread-safe (synchronized), slower
StringBuilder → Not thread-safe, faster
*/