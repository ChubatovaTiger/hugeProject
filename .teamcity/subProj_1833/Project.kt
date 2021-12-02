package subProj_1833

import subProj_1833.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1833")
    name = "subProj 1833"

    buildType(subProj_bt_1833_0)
    buildType(subProj_bt_1833_2)
    buildType(subProj_bt_1833_1)
    buildType(subProj_bt_1833_4)
    buildType(subProj_bt_1833_3)
    buildType(subProj_bt_1833_5)
})
