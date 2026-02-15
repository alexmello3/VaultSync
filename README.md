# 🔐 VaultSync

**Cross-Platform Password Vault Synchronizer**

VaultSync is a modular password vault synchronizer that allows keeping data consistent across different ecosystems — such as **macOS, Linux, and mobile devices** — without forcing users to abandon native solutions for each platform.

The goal is to enable interoperability without sacrificing local integration quality, such as automatic form detection, browser integration, or system features.

---

## 🎯 Motivation

Many users work across multiple systems:

* 💻 macOS
* 🐧 Linux
* 📱 iPhone / mobile devices
* 🖥 Hybrid environments or homelab

Native solutions for each platform often offer better integration with the operating system. However, they don't always communicate with each other.

VaultSync emerges as an ethical and transparent bridge between these worlds.

---

## 🧭 Project Philosophy

This project follows the methodology and principles advocated by the **GNU Project**, founded by **Richard Stallman**:

* 🔓 Users should have full control over their software
* 📖 Code should be auditable
* 🛠 Systems should be modifiable
* 🤝 Collaboration is an essential part of development

VaultSync is Free Software and adopts a clear ethical stance:

> User freedom comes before commercial convenience.

---

## 🧱 Modular Architecture

Inspired by Unix philosophy and the GNU ecosystem:

> Each component does just one thing — and does it well.

The project is divided into independent modules:

| Component        | Responsibility                                  |
| ---------------- | ----------------------------------------------- |
| `vault-reader-*` | Reading a specific vault format                 |
| `vault-writer-*` | Writing to a specific format                    |
| `sync-engine`    | Synchronization engine and conflict resolution  |
| `crypto-core`    | Cryptography and validation                     |
| `cli`            | Command-line interface                          |

### 🔄 Architecture Advantages

* 🔌 Reusable components
* 🔄 Possibility of integration with other systems
* 🧪 Isolated testability
* 🧩 Flexibility to create new adapters
* 🚫 No mandatory dependency on a single backend

You can use just the `crypto-core`.
Or just the `sync-engine`.
Or integrate the project into your own system.

---

## 🔐 Security

* End-to-end encryption
* Local processing by default
* No mandatory dependency on proprietary services
* Auditable code

Security is not optional — it's a requirement.

---

## 🚀 Use Cases

* Synchronize vault between macOS and Linux
* Maintain compatibility between mobile and desktop devices
* Integrate vaults with homelab automations
* Create custom synchronization pipelines

---

## 🛠 Technologies

* Java
* CLI-first
* Module-oriented architecture
* Focus on portability

---

## 🤝 Contributions

This project is open to contributions.

You can help with:

* Implementation of new vault adapters
* Security reviews
* Improvements to the synchronization mechanism
* Testing
* Documentation
* Cryptographic audits

If you believe in Free Software ethics and user autonomy, your participation is welcome.

Open an issue.
Send a pull request.
Discuss ideas.

Collaboration builds freedom.

---

## 📜 License

This project is distributed under a Free Software license compatible with the principles of the **Free Software Foundation**.

See the `LICENSE` file for details.

---

## ✊ Declaration of Principles

VaultSync does not exist to create dependency.
It exists to return control.

In a world of digital silos, interoperability is an act of freedom.
