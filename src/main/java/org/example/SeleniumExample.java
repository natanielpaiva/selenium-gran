package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    public static void main(String[] args) {

        // Instancia um novo objeto WebDriver usando ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Abre uma página web
            driver.get("https://task-manager-gran.vercel.app/");

            // Encontra o campo de entrada pelo seu atributo 'name' (ou outro seletor que preferir)
            WebElement inputField = driver.findElement(By.id("taskInput"));

            // Escreve texto no campo de entrada
            inputField.sendKeys("Texto para escrever no campo");

            // Encontra o botão pelo seu texto visível (ou outro seletor que preferir)
            WebElement submitButton = driver.findElement(By.id("addTaskBtn"));

            // Clica no botão
            submitButton.click();

            // Adicione uma espera ou qualquer outra operação necessária aqui

        } finally {
            // Fecha o navegador
            //driver.quit();
        }
    }
}

