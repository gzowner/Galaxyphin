# Galaxyphin — Galaxy Media

Galaxyphin is the **Galaxy Media** branded Android TV, Google TV, and Fire TV client built from the open-source Wholphin Jellyfin client.

![Galaxy Media banner](docs/galaxy-media-banner.jpg)

## Galaxy Media changes

- Galaxy Media launcher icon and television banner
- Dark navy, electric blue, cyan, and violet interface palette
- Application display name changed to `Galaxy Media`
- Independent Android application ID: `com.galaxymedia.galaxyphin`
- APK filenames begin with `GalaxyMedia-`
- Release update checks point to `gzowner/Galaxyphin`
- Playback engine and underlying Wholphin source structure remain intact

## Build

```bash
./gradlew :app:assembleDefaultDebug
```

The generated debug APK is placed under `app/build/outputs/apk/default/debug/`.

## Open-source attribution

Galaxyphin is based on [Wholphin](https://github.com/damontecres/Wholphin), an open-source Android TV client for Jellyfin. The original project documentation is retained in [README-UPSTREAM.md](README-UPSTREAM.md).

This repository retains the upstream **GNU General Public License version 2**. Distributions must continue to comply with that license and provide the corresponding source code.
