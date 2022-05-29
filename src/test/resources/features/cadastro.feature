# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro-sucesso
    Cenario: Registrar usuário
      Dado que acessei a página de autenticacao
      Quando informar o e-mail
      E clicar em registrar
      E preencher todos os campos obrigatórios
      Então ao confirmar o cadastro serei direcionado para o menu do usuário