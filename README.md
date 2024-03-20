# Game Service

## How to launch service
1. Make sure you have [Docker Desktop](https://www.docker.com/products/docker-desktop/) or Docker on your computer
   - To check if you have docker, open your terminal and write `docker --version`
     
2. Make sure you have [Git](https://git-scm.com/) installed on your computer
   - To check if you have git installed, open your terminal and write `git --version`
     
3. Clone the repository
   - Open your **terminal** of choice.
   - Navigate to the folder, where you want to clone repository `etc: cd D:\Service`, through the terminal.
   - Open the repository and press the green button `<> Code` and copy the HTTPS URL for the repository.
   - Open back up the terminal and invoke the command `git clone *URL_OF_THE_REPOSITORY*`
     
4. Navigate into the repository `cd games_service`
   
5. While in terminal run the command `docker compose -f docker-compose.yml up`
   
6. Wait for the command to finish

# Testing data

To send HTTPS requests use [Postman](https://www.postman.com/)

The requests are accepted through `localhost:5000` on *Postman*

## Create:
### Game
> In postman use the template `https://localhost:5000/api/games`
- Change the request type to *Post*
- Add the template address
- Choose *Body -> raw -> JSON type*
- In the new text field, provide the data you want to create in JSON format:
  
  ```
  {
        "id": 2,
        "gameName": "Valorant",
        "releaseYear": "2020",
        "companyId": 1
  }
  ```

### Company
> In postman use the template `https://localhost:5000/api/company`
- Change the request type to *Post*
- Add the template address
- Choose *Body -> raw -> JSON type*
- In the new text field, provide the data you want to create in JSON format:
  
  ```
  {
    "id": 1,
    "company_name": "Riot Games",
    "estb_year": "2006"
  }
  ```

## Get:
### Game
*All*
> In postman use the template `https://localhost:5000/api/games`
- Change the request type to *Get*
- Add the template address

*By Id*
> In postman use the template `https://localhost:5000/api/games/{id}`
- Change the request type to *Get*
- Add the template address
- Instead of `{id}` write a number of your choice `ex: https://localhost:5000/api/games/1`

### Company
*All*
> In postman use the template `https://localhost:5000/api/company`
- Change the request type to *Get*
- Add the template address

*By Id*
> In postman use the template `https://localhost:5000/api/company/{id}`
- Change the request type to *Get*
- Add the template address
- Instead of `{id}` write a number of your choice `ex: https://localhost:5000/api/company/1`

## Update:
### Game
> In postman use the template `https://localhost:5000/api/games`
- Change the request type to *Patch*
- Add the template address
- Choose *Body -> raw -> JSON type*
- In the new text field, provide the data you want to update in JSON format, whole structure needs to be used, but **only** the fields **you want** to update can be changed:


  *From*
  
  ```
  {
        "id": 2,
        "gameName": "American Horder",
        "releaseYear": "3000",
        "companyId": 1
  }
  ```

    *To*
  ```
  {
        "id": 2,
        "gameName": "Valorant",
        "releaseYear": "2020",
        "companyId": 1
  }
  ```
  
  ### Company
  > In postman use the template `https://localhost:5000/api/company`
- Change the request type to *Patch*
- Add the template address
- Choose *Body -> raw -> JSON type*
- In the new text field, provide the data you want to update in JSON format, whole structure needs to be used, but **only** the fields **you want** to update can be changed:

  *From*
  
  ```
  {
      "id": 1,
      "company_name": "Riot Games", 
      "estb_year": "2006"
  }
  ```

  *To*

  ```
  {
      "id": 1,
      "company_name": "Baba Games", 
      "estb_year": "2006"
  }
  ```

## Delete:
### Game
*All*
> In postman use the template `https://localhost:5000/api/game`
- Change the request type to *Delete*
- Add the template address
- Send the request
- You shouldn't see records no more

*By Id*
> In postman use the template `https://localhost:5000/api/game/{id}`
- Change the request type to *Delete*
- Add the template address
- Instead of `{id}` write a number of your choice `ex: https://localhost:5000/api/game/1`
- Send the request
- The record by that `id` shouldn't exist

### Company
*All*
> In postman use the template `https://localhost:5000/api/company`
- Change the request type to *Delete*
- Add the template address
- Send the request
- You shouldn't see records no more


*By Id*
> In postman use the template `https://localhost:5000/api/company/{id}`
- Change the request type to *Delete*
- Add the template address
- Instead of `{id}` write a number of your choice `ex: https://localhost:5000/api/company/1`
- Send the request
- The record by that `id` shouldn't exist





### ---
>Made by *Titas* and *Dinas* *Majauskai*
