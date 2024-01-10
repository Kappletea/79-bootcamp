package parents;


    public abstract class Shape{
        private String color;

        public Shape(){
        }
        
        public String getColor(){
            return this.color;
        }
        public void setColor(String color){
            this.color = color;
        }

        //abstract method getArea
        public abstract double getArea();
    }

