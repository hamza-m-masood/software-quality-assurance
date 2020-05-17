<h1 align="center">software-quality-assurance</h1>

# [Contents](#contents)

- [Product Backlog](#backlog)
- [Sprint](#sprint1)
- [Task Estimation](#taskEst)
- [Test Driven Development](#tdd)
- [Test Coverage Metric](#tcm)
- [Team Version Control](#tvc)
- [Code-review Checklist](#coderev)

# Product Backlog<a name = "backlog"></a>

the Product Backlog is an ordered list of everything that is known to be needed in the product. It is the single source of requirements for any changes to be made to the product. The Product Owner is responsible for the Product Backlog, including its content, availability, and ordering. The Epics/Themes column are designed to split the entire program up into very high level sections. These sections are then split into user stories which is located on the next column. The user stories are all the actions that specific users can do on the particular platform. These actions are then prioritised on the next column and are estimated on the next column. Task estimation is discussed further down the article.

| EPICS/Themes  | User story No. | User Stories : As a user I want to be able to x                                                                                             | Priority | Estimates (story points) | Sprint Iteration |
| ------------- | -------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | -------- | ------------------------ | ---------------- |
| main menu     | 1              | As a user of the Survey program, I want to be able to access the main menu to create a survey, answer a survey and view results of a survey | 1        | 2                        | Sprint 1         |
| create survey | 2              | As a user of the Survey program, I want to be able to create a question (max 10)                                                            | 2        | 3                        | sprint 1         |
| create survey | 3              | As a user of the Survey program, I want to be able to create an answer for a question (answers only in 1-5)                                 | 3        | 2                        | sprint 1         |
| answer survey | 4              | As a user of the Survey program, I want to be able to view a list of surveys that I can answer.                                             | 4        | 2                        | sprint 2         |
| answer survey | 5              | As a user of the Survey program, I want to be able to select a survey by name                                                               | 5        | 2                        | sprint 2         |
| answer survey | 6              | As a user of the Survey program, I want to be able to answer a specific survey                                                              | 6        | 4                        | sprint 2         |
| result screen | 7              | As a user of the Survey program, I want to be able to view all of the answers for a specific survey                                         | 7        | 2                        | sprint 3         |
| result screen | 8              | As a user of the Survey program, I want to be able to view all of the analytics for a specific survey                                       | 8        | 3                        | sprint 3         |
| result screen | 9              | As a user of the Survey program, I want to be able to view analytics for specific questions                                                 | 9        | 3                        | sprint 3         |

# Task Estimation<a name = "taskEst"></a>

The task estimation is used by using the "Fist of five" technique. This technique allows participants to quickly place a vote ranging from zero to five. The decision in question is presented and participants raise their hands, showing their vote by way of the number of fingers that they hold up. Often Fist of Five is used to indicate the difficulty of a particular user story.</br>

A fist would indicate zero, a vote completely against whatever issue was being raised. A one (one story point) would denote that the user story is very easy to develop and would not take much time at all. A five (five story points) would indicate extreme difficulty and a lot of road blocks in order to develop the particular user story. Raising three fingers (three story points) would indicate that although there is some difficulty, the team member would be comfortable enough in developing the user story. </br>

The story points are always located in the product backlog, as you can see above.

The total story points in the product backlog is noted down. There are 3 sprints in total. For each sprint, the team has a capacity of 8 story points. So we must reach as close as possible to capacity with user stories.</br></br>
Total points: 23</br>
Team capacity: 8

# Sprints<a name = "sprint1"></a>

Sprint is one timeboxed iteration of a continuous development cycle. Within a Sprint, planned amount of work has to be completed by the team and made ready for review. The term is mainly used in Scrum Agile methodology but somewhat basic idea of Kanban continuous delivery is also essence of Sprint Scrum.

Sprint literal meaning is a short race at full speed. Accordingly, teams usually define a short duration of a Sprint up to 2-4 weeks. Team collaboratively sets their target with Product Owner as “Sprint Goal” and plan their work in “Sprint backlog”. As soon race starts after planning session, team work together to complete planned work effectively and make it ready for review by the end of that period.

High level User Stories readiness in Product backlog is the prerequisite of starting a Sprint Cycle. Sprint Analytics help Scrum Master and Product Owner to know the progress of Sprint in a glance. It is the place to define Sprint Goal and Definition of Done for each Sprint.

When the sprint is started the team member is assigned a user story number and the row is placed in the "In progress" state. Once the assignment is finished, the row is placed in the "Done" state and the actual time taken is recorded for a burn down chart.

### Sprint 1

| User Story No. | Task Estimation | Priority | To Do | In progress | Done | Hours remaining | Actual Time taken |
| -------------- | --------------- | -------- | ----- | ----------- | ---- | --------------- | ----------------- |
| 1              | 2               | 1        | 🗹     | 𐄂           | 𐄂    | 1               | -                 |
| 2              | 3               | 2        | 🗹     | 𐄂           | 𐄂    | 3               | -                 |
| 3              | 4               | 3        | 🗹     | 𐄂           | 𐄂    | 4               | -                 |

### Sprint 2

| User Story No. | Task Estimation | Priority | To Do | In progress | Done | Hours remaining | Actual Time taken |
| -------------- | --------------- | -------- | ----- | ----------- | ---- | --------------- | ----------------- |
| 4              | 2               | 1        | 🗹     | 𐄂           | 𐄂    | 1               | -                 |
| 5              | 2               | 2        | 🗹     | 𐄂           | 𐄂    | 1               | -                 |
| 6              | 4               | 3        | 🗹     | 𐄂           | 𐄂    | 4               | -                 |

### Sprint 3

| User Story No. | Task Estimation | Priority | To Do | In progress | Done | Hours remaining | Actual Time taken |
| -------------- | --------------- | -------- | ----- | ----------- | ---- | --------------- | ----------------- |
| 7              | 2               | 1        | 🗹     | 𐄂           | 𐄂    | 1               | -                 |
| 8              | 3               | 2        | 🗹     | 𐄂           | 𐄂    | 3               | -                 |
| 9              | 3               | 3        | 🗹     | 𐄂           | 𐄂    | 3               | -                 |

# Test Driven Development<a name = "tdd"></a>
Test-driven development (TDD) is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the code is improved so that the tests pass. This is opposed to software development that allows code to be added that is not proven to meet requirements. 

Since we are coding out the application in Java we will be using JUnit testing.
# Test Coverage Metric<a name = "tcm"></a>

# Team Version Control<a name = "tvc"></a>

# Code-review Checklist<a name = "coderev"></a>

Reviews allow collaborators to comment on the changes proposed in pull requests, approve the changes, or request further changes before the pull request is merged. Repository administrators can require that all pull requests are approved before being merged.

### 1. Code formatting

a) Ensure that proper naming conventions (CamelCase) have been followed.

b) Remove the commented code as this is always a blocker, while going through the code. Commented code can be obtained from Source Control (like SVN), if required.

### 2. Architecture

a) The code should follow the defined architecture.

1.Separation of Concerns followed
Split into multiple layers and tiers as per requirements (Presentation, Business and Data layers).
Split into respective files (HTML, JavaScript and CSS).
2.Code is in sync with existing code patterns/technologies.
3.Design patterns: Use appropriate design pattern (if it helps), after completely understanding the problem and context.

### 3. Coding best practices

1.No hard coding, use constants/configuration values.</br>
2.Group similar values under an enumeration (enum).</br>
3.Avoid multiple if/else blocks.</br>
4.Use framework features, wherever possible instead of writing custom code.

### 4. Non Functional requirements

a) Maintainability (Supportability) – The application should require the least amount of effort to support in near future. It should be easy to identify and fix a defect.</br></br>
1.Readability: Code should be self-explanatory. Get a feel of story reading, while going through the code. Use appropriate name for variables, functions and classes. If you are taking more time to understand the code, then either code needs refactoring or at least comments have to be written to make it clear.
2.Code is in sync with existing code patterns/technologies.</br>
3.Design patterns: Use appropriate design pattern (if it helps), after </br>completely understanding the problem and context.

### 5. Object-Oriented Analysis and Design (OOAD) Principles

[Top](#contents)
