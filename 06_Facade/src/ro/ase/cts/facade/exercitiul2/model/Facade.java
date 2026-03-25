package ro.ase.cts.facade.exercitiul2.model;

public class Facade implements IRezervarePachet {

    @Override
    public void rezervaPachet(String orasPlecare, String orasDestinatie) {

        CompanieAeriana companie = new CompanieAeriana("AirLines Paris");

        Zbor dus = companie.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor intors = companie.rezervaBiletAvion(orasDestinatie, orasPlecare);

        Hotel hotel = new Hotel("Hotel 2D");

        System.out.println(dus);
        System.out.println(intors);
        hotel.rezervaCamera(orasDestinatie);
    }
}