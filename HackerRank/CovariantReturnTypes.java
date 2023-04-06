

//Complete the classes below
class Flower {
    public String whatsYourName(){
        return "I have my names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lotus extends Flower{
    @Override
    public String whatsYourName(){
        return "Lotus";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    @Override
    Flower yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    Flower yourNationalFlower(){
        return new Lily();
    }
}

