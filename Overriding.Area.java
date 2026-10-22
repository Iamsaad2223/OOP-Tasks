class main1 {
    int area (int side){
        return side * side;
    }
    int area (int length, int width){
        return length * width;
    }
}

class main {
    public static void main(String[] args) {
        main1 obj = new main1();
        System.out.println(obj.area(3));
        System.out.println(obj.area(3, 5));
    }
}