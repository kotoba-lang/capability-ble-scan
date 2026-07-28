# capability-ble-scan

Atomic authority package for `ble/scan`.

- imports: `#{:ble-scan}`
- effects: `#{:personal-data :network-read :sensor-read}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
