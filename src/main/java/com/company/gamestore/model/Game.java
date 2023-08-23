package com.company.gamestore.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "game")

public class Game {
    @Id
    private Long game_id;
    private String title;
    private String esrb_rating;
    private String descrition;
    private Float price;
    private String studio;
    private int quantity;

    public Long getGame_id() {
        return game_id;
    }

    public void setGame_id(Long game_id) {
        this.game_id = game_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsrb_rating() {
        return esrb_rating;
    }

    public void setEsrb_rating(String esrb_rating) {
        this.esrb_rating = esrb_rating;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return quantity == game.quantity && Objects.equals(game_id, game.game_id) && Objects.equals(title, game.title) && Objects.equals(esrb_rating, game.esrb_rating) && Objects.equals(descrition, game.descrition) && Objects.equals(price, game.price) && Objects.equals(studio, game.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game_id, title, esrb_rating, descrition, price, studio, quantity);
    }

    @Override
    public String toString() {
        return "Game{" +
                "game_id=" + game_id +
                ", title='" + title + '\'' +
                ", esrb_rating='" + esrb_rating + '\'' +
                ", descrition='" + descrition + '\'' +
                ", price=" + price +
                ", studio='" + studio + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}