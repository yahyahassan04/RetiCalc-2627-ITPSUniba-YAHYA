# RetiCalc-2627-ITPSUniba-YAHYA

**Studente:** YAHYA HG NASRALLAH

## Descrizione del progetto

Implementazione di un'applicazione client/server TCP in Java per il corso di Reti di Calcolatori, a.a. 2026-2027.

L'applicazione consente al client di connettersi al server, inviare tre numeri interi e ricevere il risultato dell'operazione:

`res = n1 + n2 - n3`

Se il risultato è uguale a `100`, il server invia il messaggio `QUIT` e il client termina la connessione. Altrimenti, il server invia il risultato e il client può continuare a inviare nuovi numeri.

## Struttura del progetto

- `client-TCP_YAHYA/` — codice sorgente del client TCP.
- `serverTCP_YAHYA/` — codice sorgente del server TCP.

## Tecnologie utilizzate

- Linguaggio: Java
- Versione Java: JDK 17
- Protocollo di comunicazione: TCP
- Ambiente di sviluppo: Eclipse IDE
- Sistema operativo: Windows 11

## Esecuzione

1. Avviare `ServerTCP.java` e attendere che il server sia in ascolto sulla porta `5000`.
2. Avviare `ClientTCP.java`.
3. Inserire l'indirizzo IP del server (`127.0.0.1` per i test sullo stesso computer) e la porta `5000`.
4. Inserire i tre numeri interi richiesti dal client.

Il server rimane in ascolto per accettare nuove connessioni.
