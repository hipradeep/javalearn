package basicjava.abstrection.abstrectclass;

public class SolarSystem {

}


class PlanetBeta extends PlanetAlpha {

    @Override
    protected void density() {
    }
}

abstract class PlanetAlpha extends Universe {

    @Override
    protected void planets() {
    }

    //@Override
    //void density() {      }
}


abstract class Universe {
    abstract void planets();

    abstract void density();
}