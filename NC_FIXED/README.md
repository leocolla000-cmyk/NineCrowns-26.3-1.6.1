# Nine Crowns 1.6.0 — Minecraft 26.3 / Fabric

## Regole principali
- 9 giocatori registrati.
- Alla morte di un partecipante cade sempre la sua testa.
- Le 3 ricette leggendarie richiedono le 8 teste DIVERSE degli altri 8 giocatori.
- La propria testa non può essere usata.
- Ogni leggendario può essere craftato UNA SOLA VOLTA nel mondo.

## Ricette leggendarie
Spada OP:
H H H
H S H
H H H
S = Netherite Sword

Spear OP:
H H H
H L H
H H H
L = Netherite Spear

Emperor Crown:
H H H
H C H
H H H
C = Empty Crown

H = testa di uno degli altri 8 partecipanti.

## Spada OP
- Sharpness V
- indistruttibile
- 14 danni raw totali con Sharpness V, cioè +3 danni (+1,5 cuori) rispetto a Netherite Sword + Sharpness V
- 20% Poison I per 3 s
- 10% Slowness I per 3 s

## Spear OP
- Sharpness V
- Lunge III
- indistruttibile
- Shift + tasto destro su un bersaglio entro 24 blocchi
- 3 fulmini visuali
- un solo evento di danno da 12 punti = 6 cuori prima di armatura/protezioni
- cooldown 30 secondi
- i fulmini visuali non incendiano

## Emperor Crown
- Protection X
- Speed II
- Strength II
- Fire Resistance I
- indistruttibile

## JEI / controllo ricette
Le 3 ricette leggendarie sono presenti come normali recipe JSON, quindi JEI le può mostrare.
JEI visualizza teste generiche; la mod server-side controlla comunque che siano esattamente
le 8 teste diverse degli altri 8 giocatori.

Comandi utili:
- /ninecrowns
- /ninecrowns recipes
- /ninecrowns status

## Versioni
- Minecraft 26.3
- Fabric Loader 0.19.5
- Fabric API 0.161.0+26.3
- Java 25
