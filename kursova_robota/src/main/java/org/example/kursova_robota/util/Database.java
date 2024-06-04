package org.example.kursova_robota.util;

import org.example.kursova_robota.dao.CurrencyDao;
import org.example.kursova_robota.model.Currency;

import java.time.LocalDate;

public class Database {
    public static void createDatabase(CurrencyDao currencyDao) {
        currencyDao.create(new Currency("USD", 40.52, LocalDate.now()));
        currencyDao.create(new Currency("EUR", 43.99, LocalDate.now()));
        currencyDao.create(new Currency("JPY", 0.25, LocalDate.now()));
        currencyDao.create(new Currency("GBP", 51.61, LocalDate.now()));
        currencyDao.create(new Currency("CAD", 29.68, LocalDate.now()));
        currencyDao.create(new Currency("NZD", 24.95, LocalDate.now()));


        currencyDao.create(new Currency("USD", 40.54, LocalDate.of(2024, 5, 31)));
        currencyDao.create(new Currency("EUR", 44.0, LocalDate.of(2024, 5, 31)));
        currencyDao.create(new Currency("JPY", 0.26, LocalDate.of(2024, 5, 31)));
        currencyDao.create(new Currency("GBP", 51.58, LocalDate.of(2024, 5, 31)));
        currencyDao.create(new Currency("CAD", 29.69, LocalDate.of(2024, 5, 31)));
        currencyDao.create(new Currency("NZD", 24.95, LocalDate.of(2024, 5, 31)));

        currencyDao.create(new Currency("USD", 40.53, LocalDate.of(2024, 5, 30)));
        currencyDao.create(new Currency("EUR", 43.82, LocalDate.of(2024, 5, 30)));
        currencyDao.create(new Currency("JPY", 0.25, LocalDate.of(2024, 5, 30)));
        currencyDao.create(new Currency("GBP", 51.51, LocalDate.of(2024, 5, 30)));
        currencyDao.create(new Currency("CAD", 29.61, LocalDate.of(2024, 5, 30)));
        currencyDao.create(new Currency("NZD", 24.79, LocalDate.of(2024, 5, 30)));

        currencyDao.create(new Currency("USD", 40.53, LocalDate.of(2024, 5, 29)));
        currencyDao.create(new Currency("EUR", 43.92, LocalDate.of(2024, 5, 29)));
        currencyDao.create(new Currency("JPY", 0.26, LocalDate.of(2024, 5, 29)));
        currencyDao.create(new Currency("GBP", 51.62, LocalDate.of(2024, 5, 29)));
        currencyDao.create(new Currency("CAD", 29.55, LocalDate.of(2024, 5, 29)));
        currencyDao.create(new Currency("NZD", 24.78, LocalDate.of(2024, 5, 29)));
    }
}
