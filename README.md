JavaSpringSecurity
Описание проекта
JavaSpringSecurity - это проект на базе Spring Boot, который представляет собой систему управления пользователями с полноценной аутентификацией и авторизацией. Система обеспечивает безопасное хранение данных пользователей, включая личную информацию и учетные записи.
Функциональные возможности
Управление учетными записями пользователей
Ролевая модель доступа (разные уровни прав)
Безопасное хранение паролей
Отслеживание активности пользователей
Хранение персональных данных
Технологии
Java 17
Spring Boot
Spring Security
Spring Data JPA
Hibernate
PostgreSQL
Maven
Структура проекта
Проект следует стандартной архитектуре Spring MVC:
model - сущности базы данных
repository - слой доступа к данным
service - бизнес-логика приложения
controller - REST API контроллеры
config - конфигурационные классы
enums - перечисления
