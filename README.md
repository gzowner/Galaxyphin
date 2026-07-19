# Galaxyphin — Galaxy Media

Galaxyphin is the **Galaxy Media** Android TV, Google TV, and Fire TV client for Jellyfin.

The project began as a one-time source import from the open-source Wholphin client. Galaxyphin is now maintained independently in this repository. Future features, fixes, versions, APK builds, and releases will be developed here without automatically synchronizing from Wholphin.

![Galaxy Media banner](app/src/main/res/mipmap-xxxhdpi/galaxy_media_banner.webp)

## Galaxy Media identity

- Galaxy Media launcher icon and television banner
- Dark navy, electric blue, cyan, and violet interface palette
- Application display name: `Galaxy Media`
- Independent Android application ID: `com.galaxymedia.galaxyphin`
- APK filenames begin with `GalaxyMedia-`
- Release update checks point to `gzowner/Galaxyphin`
- Independent version history beginning with `VERSION`

## Build

```bash
./gradlew :app:assembleDefaultDebug
```

The generated debug APK is placed under `app/build/outputs/apk/default/debug/`.

GitHub Actions also builds downloadable debug APK artifacts after relevant changes are pushed to `main`, or when the build workflow is started manually.

## Versioning

The current Galaxyphin version is stored in the repository's `VERSION` file. Version tags and APK releases belong to this repository only.

## Open-source attribution

Galaxyphin was originally based on [Wholphin](https://github.com/damontecres/Wholphin), an open-source Android TV client for Jellyfin. The original project documentation is retained in [README-UPSTREAM.md](README-UPSTREAM.md) for attribution and reference.

This repository retains the upstream **GNU General Public License version 2**. Distributions must continue to comply with that license and provide the corresponding source code.
