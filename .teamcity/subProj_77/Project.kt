package subProj_77

import subProj_77.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_77")
    name = "subProj 77"

    buildType(subProj_bt_77_0)
    buildType(subProj_bt_77_1)
    buildType(subProj_bt_77_4)
    buildType(subProj_bt_77_5)
    buildType(subProj_bt_77_2)
    buildType(subProj_bt_77_3)
})
