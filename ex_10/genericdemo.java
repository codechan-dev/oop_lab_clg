class MyClass<T extends Comparable<T>> {
    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }
}

class genericdemo {
    public static void main(String args[]) {
        int i;
        Integer inums[] = { 10, 2, 5, 4, 6, 1 };
        Character chs[] = { 'v', 'p', 's', 'a', 'n', 'h' };
        Double d[] = { 20.2, 45.4, 71.6, 88.3, 54.6, 10.4 };
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        MyClass<Double> dob = new MyClass<Double>(d);
        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums: " + iob.min());
        System.out.println("Max value in chs: " + cob.max());
        System.out.println("Min value in chs: " + cob.min());
        System.out.println("Max value in chs: " + dob.max());
        System.out.println("Min value in chs: " + dob.min());
    }
}