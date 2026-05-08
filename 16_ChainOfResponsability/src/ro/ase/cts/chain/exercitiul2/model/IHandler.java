package ro.ase.cts.chain.exercitiul2.model;

public interface IHandler {

        void setUrmatorul(IHandler notificator);
        void notifica(Client client, String mesaj);

}
