package subProj_1544

import subProj_1544.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1544")
    name = "subProj 1544"

    buildType(subProj_bt_1544_1)
    buildType(subProj_bt_1544_0)
    buildType(subProj_bt_1544_5)
    buildType(subProj_bt_1544_4)
    buildType(subProj_bt_1544_3)
    buildType(subProj_bt_1544_2)
})
