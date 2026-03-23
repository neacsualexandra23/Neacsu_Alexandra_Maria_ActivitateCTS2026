package ro.ase.cts.facade.exercitiul2.model;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie) {

        CompanieAeriana companieAeriana=new CompanieAeriana("AirLines Paris");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);

        Hotel hotel = new Hotel("Hotel 2D");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}