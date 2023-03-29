public class Main {
    public static void main(String[] args) {

        Perpustakaan perpusat = new Perpustakaan();

        perpusat.tambahBuku("1001", "Naruto : The Last", 5);
        perpusat.tambahBuku("1002", "Naruto : The Hidden Village", 2);
        perpusat.tambahBuku("1003", "Naruto : Ultimate Ninja Strom", 1);
        perpusat.tambahBuku("1004", "Harry Potter : The Chamber of Secret", 10);
        perpusat.tambahBuku("1005", "Harry potter : Goblet of fire", 5);
        perpusat.tambahBuku("1006", "Harry Potter : and The prisoner of Askaban", 0);
        perpusat.tambahBuku("1007", "The Hulk", 2);
        perpusat.tambahBuku("1008", "Captain America : The First Avenger", 66);
        perpusat.tambahBuku("1010", "A Cristmas Carol", 8);
        perpusat.tambahBuku("1009", "Romeo and Juliet", 3);

        perpusat.caribuku("Naruto");
        perpusat.caribuku("The Hulk");

        perpusat.cekBuku("1005");

        perpusat.cekKetersediaan("1004");

    }
}