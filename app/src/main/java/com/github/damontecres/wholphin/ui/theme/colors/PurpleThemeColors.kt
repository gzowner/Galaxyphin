package com.github.damontecres.wholphin.ui.theme.colors

import androidx.compose.ui.graphics.Color
import androidx.tv.material3.darkColorScheme
import androidx.tv.material3.lightColorScheme
import com.github.damontecres.wholphin.ui.theme.ThemeColors

val PurpleThemeColors =
    object : ThemeColors {
        val primaryLight = Color(0xFF315FD6)
        val onPrimaryLight = Color(0xFFFFFFFF)
        val primaryContainerLight = Color(0xFF5B8CFF)
        val onPrimaryContainerLight = Color(0xFFFFFFFF)
        val secondaryLight = Color(0xFF4C63B6)
        val onSecondaryLight = Color(0xFFFFFFFF)
        val secondaryContainerLight = Color(0xFFA9BEFF)
        val onSecondaryContainerLight = Color(0xFF10204F)
        val tertiaryLight = Color(0xFF007A99)
        val onTertiaryLight = Color(0xFFFFFFFF)
        val tertiaryContainerLight = Color(0xFF27D3FF)
        val onTertiaryContainerLight = Color(0xFF001F29)
        val errorLight = Color(0xFFBA1A1A)
        val onErrorLight = Color(0xFFFFFFFF)
        val errorContainerLight = Color(0xFFFFDAD6)
        val onErrorContainerLight = Color(0xFF93000A)
        val backgroundLight = Color(0xFFF6F8FF)
        val onBackgroundLight = Color(0xFF111521)
        val surfaceLight = Color(0xFFF6F8FF)
        val onSurfaceLight = Color(0xFF111521)
        val surfaceVariantLight = Color(0xFFDDE4F5)
        val onSurfaceVariantLight = Color(0xFF232833)
        val scrimLight = Color(0xFF000000)
        val inverseSurfaceLight = Color(0xFF20232B)
        val inverseOnSurfaceLight = Color(0xFFF5F7FF)
        val inversePrimaryLight = Color(0xFF9DB7FF)

        val primaryDark = Color(0xFF9DB7FF)
        val onPrimaryDark = Color(0xFF08245C)
        val primaryContainerDark = Color(0xFF5B8CFF)
        val onPrimaryContainerDark = Color(0xFFFFFFFF)
        val secondaryDark = Color(0xFF9DB7FF)
        val onSecondaryDark = Color(0xFF10204F)
        val secondaryContainerDark = Color(0xFF27304A)
        val onSecondaryContainerDark = Color(0xFFDDE5FF)
        val tertiaryDark = Color(0xFF27D3FF)
        val onTertiaryDark = Color(0xFF002B38)
        val tertiaryContainerDark = Color(0xFF27D3FF)
        val onTertiaryContainerDark = Color(0xFF001F29)
        val errorDark = Color(0xFFFFB4AB)
        val onErrorDark = Color(0xFF690005)
        val errorContainerDark = Color(0xFF93000A)
        val onErrorContainerDark = Color(0xFFFFDAD6)
        val backgroundDark = Color(0xFF090B14)
        val onBackgroundDark = Color(0xFFF5F7FF)
        val surfaceDark = Color(0xFF090B14)
        val onSurfaceDark = Color(0xFFF5F7FF)
        val surfaceVariantDark = Color(0xFF232833)
        val onSurfaceVariantDark = Color(0xFFB8C3E1)
        val scrimDark = Color(0xFF000000)
        val inverseSurfaceDark = Color(0xFFF5F7FF)
        val inverseOnSurfaceDark = Color(0xFF20232B)
        val inversePrimaryDark = Color(0xFF5B8CFF)

        override val lightSchemeMaterial: androidx.compose.material3.ColorScheme =
            androidx.compose.material3.lightColorScheme(
                primary = primaryLight,
                onPrimary = onPrimaryLight,
                primaryContainer = primaryContainerLight,
                onPrimaryContainer = onPrimaryContainerLight,
                secondary = secondaryLight,
                onSecondary = onSecondaryLight,
                secondaryContainer = secondaryContainerLight,
                onSecondaryContainer = onSecondaryContainerLight,
                tertiary = tertiaryLight,
                onTertiary = onTertiaryLight,
                tertiaryContainer = tertiaryContainerLight,
                onTertiaryContainer = onTertiaryContainerLight,
                error = errorLight,
                onError = onErrorLight,
                errorContainer = errorContainerLight,
                onErrorContainer = onErrorContainerLight,
                background = backgroundLight,
                onBackground = onBackgroundLight,
                surface = surfaceLight,
                onSurface = onSurfaceLight,
                surfaceVariant = surfaceVariantLight,
                onSurfaceVariant = onSurfaceVariantLight,
                scrim = scrimLight,
                inverseSurface = inverseSurfaceLight,
                inverseOnSurface = inverseOnSurfaceLight,
                inversePrimary = inversePrimaryLight,
            )

        override val lightScheme =
            lightColorScheme(
                primary = primaryLight,
                onPrimary = onPrimaryLight,
                primaryContainer = primaryContainerLight,
                onPrimaryContainer = onPrimaryContainerLight,
                secondary = secondaryLight,
                onSecondary = onSecondaryLight,
                secondaryContainer = secondaryContainerLight,
                onSecondaryContainer = onSecondaryContainerLight,
                tertiary = tertiaryLight,
                onTertiary = onTertiaryLight,
                tertiaryContainer = tertiaryContainerLight,
                onTertiaryContainer = onTertiaryContainerLight,
                error = errorLight,
                onError = onErrorLight,
                errorContainer = errorContainerLight,
                onErrorContainer = onErrorContainerLight,
                background = backgroundLight,
                onBackground = onBackgroundLight,
                surface = surfaceLight,
                onSurface = onSurfaceLight,
                surfaceVariant = surfaceVariantLight,
                onSurfaceVariant = onSurfaceVariantLight,
                scrim = scrimLight,
                inverseSurface = inverseSurfaceLight,
                inverseOnSurface = inverseOnSurfaceLight,
                inversePrimary = inversePrimaryLight,
                border = inversePrimaryLight,
            )

        override val darkSchemeMaterial =
            androidx.compose.material3.darkColorScheme(
                primary = primaryDark,
                onPrimary = onPrimaryDark,
                primaryContainer = primaryContainerDark,
                onPrimaryContainer = onPrimaryContainerDark,
                secondary = secondaryDark,
                onSecondary = onSecondaryDark,
                secondaryContainer = secondaryContainerDark,
                onSecondaryContainer = onSecondaryContainerDark,
                tertiary = tertiaryDark,
                onTertiary = onTertiaryDark,
                tertiaryContainer = tertiaryContainerDark,
                onTertiaryContainer = onTertiaryContainerDark,
                error = errorDark,
                onError = onErrorDark,
                errorContainer = errorContainerDark,
                onErrorContainer = onErrorContainerDark,
                background = backgroundDark,
                onBackground = onBackgroundDark,
                surface = surfaceDark,
                onSurface = onSurfaceDark,
                surfaceVariant = surfaceVariantDark,
                onSurfaceVariant = onSurfaceVariantDark,
                scrim = scrimDark,
                inverseSurface = inverseSurfaceDark,
                inverseOnSurface = inverseOnSurfaceDark,
                inversePrimary = inversePrimaryDark,
            )

        override val darkScheme =
            darkColorScheme(
                primary = primaryDark,
                onPrimary = onPrimaryDark,
                primaryContainer = primaryContainerDark,
                onPrimaryContainer = onPrimaryContainerDark,
                secondary = secondaryDark,
                onSecondary = onSecondaryDark,
                secondaryContainer = secondaryContainerDark,
                onSecondaryContainer = onSecondaryContainerDark,
                tertiary = tertiaryDark,
                onTertiary = onTertiaryDark,
                tertiaryContainer = tertiaryContainerDark,
                onTertiaryContainer = onTertiaryContainerDark,
                error = errorDark,
                onError = onErrorDark,
                errorContainer = errorContainerDark,
                onErrorContainer = onErrorContainerDark,
                background = backgroundDark,
                onBackground = onBackgroundDark,
                surface = surfaceDark,
                onSurface = onSurfaceDark,
                surfaceVariant = surfaceVariantDark,
                onSurfaceVariant = onSurfaceVariantDark,
                scrim = scrimDark,
                inverseSurface = inverseSurfaceDark,
                inverseOnSurface = inverseOnSurfaceDark,
                inversePrimary = inversePrimaryDark,
                border = inversePrimaryDark.copy(alpha = .75f),
            )
    }
