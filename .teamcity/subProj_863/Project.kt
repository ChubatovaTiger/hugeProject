package subProj_863

import subProj_863.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_863")
    name = "subProj 863"

    buildType(subProj_bt_863_2)
    buildType(subProj_bt_863_1)
    buildType(subProj_bt_863_0)
    buildType(subProj_bt_863_5)
    buildType(subProj_bt_863_4)
    buildType(subProj_bt_863_3)
})
