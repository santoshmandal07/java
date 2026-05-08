class Box_Demo{
    //declare variables
    double width;
    double height;  
    double depth;

    //volume method
    double volume(){
        double vol = width * height * depth;
        return vol;
    }

    void set_dim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

//volume method

class box{
    public static void main(String args[]){
        //1st box
        Box_Demo mybox1 = new Box_Demo();
        mybox1.set_dim(10, 20, 30);
        double vol1 = mybox1.volume();
        System.out.println("Volume of box 1 is " + vol1);   

        //2nd box
        Box_Demo mybox2 = new Box_Demo();
        mybox2.set_dim(40, 50, 60);
        double vol2 = mybox2.volume();
        System.out.println("Volume of box 2 is " + vol2);
    }
}
