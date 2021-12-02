package subProj_1392

import subProj_1392.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1392")
    name = "subProj 1392"

    buildType(subProj_bt_1392_0)
    buildType(subProj_bt_1392_2)
    buildType(subProj_bt_1392_1)
    buildType(subProj_bt_1392_4)
    buildType(subProj_bt_1392_3)
    buildType(subProj_bt_1392_5)
})
