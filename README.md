# tytuł i nazwa wybranego projektu:  
 Gra w wisielca


# spis treści
*katalogu .vscode : połaczenie miedzy plikami interfacu graficznego a projektem 
*katalogu openfx : Pliki JAVAFX pobrane z internetu  które służa do robienia interface graficznych
*katalogu project :
- UI.java : Interface graficzny
- Stats.java : Statystyki
- WordDataBase.java :Baza słów
- HangmanDrawing.java : Rysunek wisielca
- Game.java : Zasady gry



# listę i krótki opis zaimplementowanych w projekcie funkcjonalności

Lista funkcji projektu :

*interfejs graficzny który zawiera przyciski łatwe w obsłudze oraz pola wyswietlajace wiadomosci

*losowanie losowego słowa dla danego poziomu trudnosci

*wprowadzanie liter przez gracza ummozliwiajacych zgadniecie losowego słowa

*ustawianie trudnosci poziomu: łatwy , średni,trudny

*sprawdzanie poprawnosci wprowadzonych liter do losowego słowa

*rysowanie szubienicy przy  podaniu błednej litery

*wyswietlanie błednych liter

*wyswietlanie statystyk : liczbe wygranych i przegranych a takze ilosc prób

*ponowna mozliwosc gry 

*zakonczenie gry po wykozystaniu max ilosci prób



#  instrukcje obsługi (czyli jak uruchomić aplikację, czy potrzebne jest pobranie dodatkowych paczek, jak tak to jakich, w jaki sposób je zainstalować itp.)


Aby uruchomic aplikacje trzeba:
1. pobrac wszystkie pliki z repozytorium Gra-w-wisielca .
2. otworzyc pobrane repozytorium w programie do czytania kodu np.Visual Studio Code 
3. Prubójemy uruchomic plik z interfejsce o nazwie UI.java 
*jesli plik sie nie otwiera musimy pobrac pliki JavaFX z internetu a nastepnie połaczyc z projektem 
*jesli plik działa wyswietla sie strona główna a na niej 2 przyciski: rozpocznij gre oraz statystyki 
4. Po wcisnieciu rozpocznij gre musimy wybrac poziom trudnosci jaka chcemy grac 
5. W nastepujacej czesci zaczyna sie gra , mamy zasłoniete losowe slowo które musimy odgadnąc wciskajac litery na klawiaturze komputera.
6. Po 10 próbach(narysowaniem wisielca) gra sie konczy .
