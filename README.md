# Мой сайт и резюме:

- [Мой сайт:](https://technocom.site123.me/)
- [Мое резюме инженер программист microcontrollers, PLC:](https://innopolis.hh.ru/resume/782d86d5ff0e9487200039ed1f6f3373384b30)
- [Мое резюме инженер программист Java backend developer (Spring):](https://innopolis.hh.ru/resume/9e3b451aff03fd23830039ed1f496e79587649)

# JavaSpringSecurity

## Описание проекта
java_spring_security - это проект на базе Spring Boot, который представляет собой систему управления пользователями с полноценной аутентификацией и авторизацией. Система обеспечивает безопасное хранение данных пользователей, включая личную информацию и учетные записи.

## Функциональные возможности
- Управление учетными записями пользователей
- Ролевая модель доступа (разные уровни прав)
- Безопасное хранение паролей
- Отслеживание активности пользователей
- Хранение персональных данных

## Технологии
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

## Структура проекта
Проект следует стандартной архитектуре Spring MVC:
- `model` - сущности базы данных
- `repository` - слой доступа к данным
- `service` - бизнес-логика приложения
- `controller` - REST API контроллеры
- `config` - конфигурационные классы
- `enums` - перечисления

## Запуск проекта
```bash
git clone https://github.com/your-username/java_spring_security.git
cd java_spring_security
mvn clean install
mvn spring-boot:run
```

## База данных
Для работы приложения требуется PostgreSQL. Настройки подключения можно изменить в файле `application.properties`.

## Автор
- Имя и Фамилия
- Email timur.sultanov1972@gmail.com
- GitHub: [Тимур](https://github.com/timurtm72/)
