# 🤝 Contributing to VaultSync

Obrigado por considerar contribuir com o VaultSync.

Este projeto existe para promover interoperabilidade, autonomia do usuário e os princípios do Software Livre. Contribuir aqui não é apenas escrever código — é participar de um movimento que valoriza liberdade, transparência e responsabilidade técnica.

---

## 🧭 Nossa Filosofia

VaultSync segue os princípios defendidos pelo **GNU Project** e pela **Free Software Foundation**:

* O usuário deve ter controle sobre seus dados.
* O software deve poder ser estudado e modificado.
* A colaboração fortalece o ecossistema.
* Segurança deve ser verificável, não presumida.

Toda contribuição deve respeitar esses princípios.

---

## 🧱 Arquitetura e Diretrizes Técnicas

O projeto adota uma arquitetura modular inspirada na filosofia Unix:

> Cada componente faz apenas uma coisa — e a faz bem.

Ao contribuir:

* Não introduza dependências desnecessárias.
* Evite acoplamento entre módulos.
* Prefira simplicidade a abstrações excessivas.
* Mantenha responsabilidade única por módulo.
* Escreva código legível antes de código “inteligente”.

Se um módulo começa a fazer mais de uma coisa, provavelmente precisa ser dividido.

---

## 🔐 Segurança é Prioridade

Este projeto lida com dados sensíveis.

Regras fundamentais:

* Nunca exponha dados sensíveis em logs.
* Não introduza telemetria.
* Não envie dados para serviços externos sem necessidade explícita.
* Prefira processamento local.
* Use criptografia moderna e bem estabelecida.
* Justifique qualquer escolha criptográfica no PR.

Contribuições que afetem segurança devem incluir:

* Explicação técnica clara
* Justificativa das decisões
* Possível análise de impacto

---

## 🛠 Como Contribuir

### 1️⃣ Abrir uma Issue

Antes de grandes mudanças:

* Descreva o problema
* Explique o caso de uso
* Proponha abordagem

Discussões são bem-vindas.

---

### 2️⃣ Fork e Pull Request

1. Faça um fork do repositório
2. Crie uma branch clara:

   ```
   feature/vault-adapter-linux
   fix/conflict-resolution-bug
   ```
3. Escreva testes quando aplicável
4. Envie o Pull Request

Explique:

* O que foi alterado
* Por que foi alterado
* Impacto na arquitetura
* Possíveis riscos

---

## 🧪 Testes

* Toda lógica de sincronização deve ser testável isoladamente.
* Adaptadores devem ter testes de leitura/escrita.
* Código criptográfico deve ter testes determinísticos quando possível.

Se não for possível testar automaticamente, explique o motivo.

---

## 🧼 Estilo de Código

* Código claro > código complexo
* Comentários explicam decisões, não o óbvio
* Nomes descritivos
* Evite “magia”
* Evite dependências pesadas sem justificativa

---

## 🧩 Novos Adaptadores de Cofre

Se você estiver adicionando suporte a um novo formato:

* Separe claramente leitura e escrita
* Não misture lógica de sincronização com parsing
* Documente o formato
* Explique limitações
* Não quebre compatibilidade existente

---

## 🚫 O Que Não Aceitamos

* Código proprietário incorporado
* Dependência obrigatória de serviços comerciais
* Telemetria oculta
* Recursos que comprometam a autonomia do usuário
* Funcionalidades que dificultem auditoria

---

## 📜 Licenciamento

Ao contribuir, você concorda que seu código será distribuído sob a mesma licença de Software Livre adotada pelo projeto.

Certifique-se de que:

* Você é autor do código enviado
* Ou possui direito de contribuição
* Ou o código é compatível com a licença do projeto

---

## ✊ Ética Antes de Conveniência

VaultSync não é um produto para aprisionar usuários.

É uma ferramenta para libertar dados de silos digitais.

Se sua contribuição aumenta:

* Transparência
* Modularidade
* Segurança
* Autonomia

Ela será muito bem-vinda.

---

## 💬 Comunicação

Respeito é obrigatório.

* Discordâncias técnicas são naturais.
* Ataques pessoais não são.
* Argumente com base técnica.
* Seja claro e objetivo.

---

## 🙌 Obrigado

Contribuir com Software Livre é um ato político, técnico e comunitário.

Se você acredita que usuários devem ter controle sobre seus dados e ferramentas, você já faz parte deste projeto.

Seja bem-vindo.
