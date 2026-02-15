# 🤝 Contributing to VaultSync

Thank you for considering contributing to VaultSync.

This project exists to promote interoperability, user autonomy, and Free Software principles. Contributing here is not just about writing code — it's about participating in a movement that values freedom, transparency, and technical responsibility.

---

## 🧭 Our Philosophy

VaultSync follows the principles advocated by the **GNU Project** and the **Free Software Foundation**:

* Users should have control over their data.
* Software should be able to be studied and modified.
* Collaboration strengthens the ecosystem.
* Security should be verifiable, not presumed.

Every contribution must respect these principles.

---

## 🧱 Architecture and Technical Guidelines

The project adopts a modular architecture inspired by Unix philosophy:

> Each component does just one thing — and does it well.

When contributing:

* Don't introduce unnecessary dependencies.
* Avoid coupling between modules.
* Prefer simplicity over excessive abstractions.
* Maintain single responsibility per module.
* Write readable code before "clever" code.

If a module starts doing more than one thing, it probably needs to be split.

---

## 🔐 Security is Priority

This project deals with sensitive data.

Fundamental rules:

* Never expose sensitive data in logs.
* Don't introduce telemetry.
* Don't send data to external services without explicit necessity.
* Prefer local processing.
* Use modern and well-established cryptography.
* Justify any cryptographic choice in the PR.

Contributions that affect security must include:

* Clear technical explanation
* Justification of decisions
* Possible impact analysis

---

## 🛠 How to Contribute

### 1️⃣ Open an Issue

Before major changes:

* Describe the problem
* Explain the use case
* Propose approach

Discussions are welcome.

---

### 2️⃣ Fork and Pull Request

1. Fork the repository
2. Create a clear branch:

   ```
   feature/vault-adapter-linux
   fix/conflict-resolution-bug
   ```
3. Write tests when applicable
4. Submit the Pull Request

Explain:

* What was changed
* Why it was changed
* Impact on architecture
* Possible risks

---

## 🧪 Tests

* All synchronization logic must be testable in isolation.
* Adapters must have read/write tests.
* Cryptographic code must have deterministic tests when possible.

If automatic testing is not possible, explain why.

---

## 🧼 Code Style

* Clear code > complex code
* Comments explain decisions, not the obvious
* Descriptive names
* Avoid "magic"
* Avoid heavy dependencies without justification

---

## 🧩 New Vault Adapters

If you are adding support for a new format:

* Clearly separate reading and writing
* Don't mix synchronization logic with parsing
* Document the format
* Explain limitations
* Don't break existing compatibility

---

## 🚫 What We Don't Accept

* Incorporated proprietary code
* Mandatory dependency on commercial services
* Hidden telemetry
* Features that compromise user autonomy
* Functionality that hinders auditing

---

## 📜 Licensing

By contributing, you agree that your code will be distributed under the same Free Software license adopted by the project.

Make sure that:

* You are the author of the submitted code
* Or you have the right to contribute
* Or the code is compatible with the project's license

---

## ✊ Ethics Before Convenience

VaultSync is not a product to imprison users.

It's a tool to free data from digital silos.

If your contribution increases:

* Transparency
* Modularity
* Security
* Autonomy

It will be very welcome.

---

## 💬 Communication

Respect is mandatory.

* Technical disagreements are natural.
* Personal attacks are not.
* Argue on technical grounds.
* Be clear and objective.

---

## 🙌 Thank You

Contributing to Free Software is a political, technical, and community act.

If you believe that users should have control over their data and tools, you are already part of this project.

Welcome.
