# Lutemon

Lutemon on yksin toteuttamani yksinkertainen Android-studiolla ja Javalla toteutettu mobiilipeli jossa treenataan ja taistellaan erivärisillä Lutemon-olennoilla.
Video: https://youtu.be/vbLpx3TT5yU

Ominaisuudet:
Voit luoda haluamasi nimisen lutemonin, joka saa satunnaisen värin. Eri värisillä lutemoneilla on eri vahvuudet.
Voit tarkastella ja siirtää lutemoneja Home-näkymässä, jossa ne on listattu RecyclerViewillä. Lutemonit on visualisoitu kuvin.
Home-näkymässä voit siirtää lutemoneja harjoittelualueelle, jossa ne voivat treenata hyökkäystä ja puolustusta
Home-näkymästä voit lähettää lutemonin taisteluun, jolloin sille luodaan satunnainen vihollinen, 
jonka kokemus on sama, hieman vähemmän tai hieman enemmän kuin lutemonilla.
Taistelun eteneminen ja tulokset tulostetaan tekstinä Battle-näkymään.
Taistelussa hyökkäyksen vahinko joko jaetaan tai siitä vähennetään puolustus, hyökkääjän eduksi.
Voittaessa lutemon saa yhden maksimielämän lisää, hävitessä se kuolee.

Luokkakaavioon on lisätty tavallisten luokkien lisäksi void:it Activityistä ja Holdereista logiikan selventämiseksi
![Lutemon drawio (1)](https://github.com/SamuliSaarine/Lutemon/assets/59774773/4a888151-a69e-43eb-8009-b3e72ed14ef5)
