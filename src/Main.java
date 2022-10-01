public class Main {


    public static void main(String[] args) {
        Book annaKarenina = new Book("Анна Каренина", 1873);
        Author levTolstoi = new Author("Лев", "Толстой");
        // System.out.println("levTolstoi.authorName = " + levTolstoi.getAuthorName());
        //System.out.println("levTolstoi.authorSurName = " + levTolstoi.getAuthorSurName());
        //System.out.println("annaKarenina.publisherName = " + annaKarenina.getPublisherName());
        //System.out.println("annaKarenina.yearOfPublication = " + annaKarenina.getYearOfPublication());

        annaKarenina.setYearOfPublication(1874);
        System.out.println("annaKarenina.getYearOfPublication() = " + annaKarenina.getYearOfPublication());
        System.out.println(levTolstoi);
        System.out.println(annaKarenina);

        Book pikovaiDama = new Book("Пиковая Дама",1833);
        Author pushkin = new Author("Александр", "Пушкин");


        System.out.println(pushkin.equals(levTolstoi));
        System.out.println(pikovaiDama.equals(annaKarenina));

    }





}