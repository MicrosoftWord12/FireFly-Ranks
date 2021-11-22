## FireFly-Ranks

### Checklist
- [ ] Add functionality for roles to be changed within game
  - Commands?
    - AddRoleToPeople 
      - 1 per person
    - RemoveRoleFromPeople
    - CheckRole
    - UpdateRole
    - ChangeRole
  - Events
    - OnPlayerJoin
      - HasBeenOnServerBefore?
      - Are They new?
    - OnPlayerKick/Leave etc
      - If I am using arrays
    - OnAsyncChatEvent
      - use for people to get their nicknames
- Ext
  - [ ] Find out a way for people to create their own roles
  - Array of who is in what role? JSON? YML?
    - Methods
      - CreateRoleCommand(String RoleName, String color)
        - roles.yml file
        - On start up read all roles from their and use the hardcoded enum roles as defaults
      - removeRoleCommand(String RoleName)
        - roles.yml file
        - Check for people in role and if true then remove