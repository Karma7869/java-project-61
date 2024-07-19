### Hexlet tests and linter status:
[![Actions Status](https://github.com/Karma7869/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Karma7869/java-project-61/actions)

[![Maintainability](https://api.codeclimate.com/v1/badges/56ac5edd21ee9bb694d6/maintainability)](https://codeclimate.com/github/Karma7869/java-project-61/maintainability)

[![hexlet-check](https://github.com/Karma7869/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Karma7869/java-project-61/actions/workflows/hexlet-check.yml)

## Проект "Игры разума" ("Brain Games")
Выполнен в рамках обучения в компании "Хекслет" ("Hexlet Ltd.") на курсе java-программирования.

Проект представлен пятью играми: "Проверка на чётность", "Калькулятор", "НОД", "Арифметическая прогрессия", "Простое ли число?"

При старте проекта выводится текстовое меню выбора игр, которое, помимо пяти игр, включает два дополнительных пункта: первый - это "Приветсвие" и последний - "Выход".
```java
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice:
```
Необходимый пункт меню нужно выбрать вводом соответсвующего номера с клавиатуры.

В случае выбора "Приветствия" программа завершается после ввода имени игрока, поприветствовав его.
```java
Welcome to the Brain Games!
May I have your name?

Hello, Bill!
```
При старте каждая из игр также предлагает ввести имя игрока с клавиатуры и, после его приветствия, выводит вопрос и три случайных варианта условий для решения.

Числовые ответы вводятся игроком с клавиатуры.

В случае трех верных ответов выводится поздравление игрока.
```java
Correct!
Congratulations, Bill! 
```
В слачае ошибки - игра прерывается сообщением о "неверном ответе" и завершением программы.
```java
'72' is wrong answer ;(. Correct answer was '70'
Let's try again, Bill!
```

[![asciicast](https://asciinema.org/a/DWX3y5rEgWX2qJmYTrLrf6B0y.svg)](https://asciinema.org/a/DWX3y5rEgWX2qJmYTrLrf6B0y)
