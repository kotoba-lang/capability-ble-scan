(ns kotoba.capability.ble.scan
  "Importable contract for ble/scan.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:ble-scan}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-ble-scan", :capability/id "ble/scan", :capability/effects #{:personal-data :network-read :sensor-read}, :capability/provider-status :contract-only})
