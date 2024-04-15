Feature: Login
    As como usuario do sistema desejo logar.

@wip
    Scenario: Deve realizar login com sucesso
        Given que eu tenha acesso ao sistema
        When informar meu usuario "student"
        And informar minha senha "Password123"
        And clicar no botao entre
        Then deve abrir a pagina de sucesso de login
@negative
    Scenario: Login com a usuario errada
        Given que eu tenha acesso ao sistema
        When informar meu usuario "estudentt"
        And informar minha senha "Password123"
        And clicar no botao entre
        Then o sistema retonara uma mensagem "Your username is invalid!"
@wip        
    Scenario: Login com a senha errada
        Given que eu tenha acesso ao sistema
        When informar meu usuario "student"
        And informar minha senha "Password12345"
        And clicar no botao entre
        Then o sistema retonara uma mensagem "Your password is invalid!"