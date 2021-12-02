package subProj_1852

import subProj_1852.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1852")
    name = "subProj 1852"

    buildType(subProj_bt_1852_3)
    buildType(subProj_bt_1852_2)
    buildType(subProj_bt_1852_5)
    buildType(subProj_bt_1852_4)
    buildType(subProj_bt_1852_1)
    buildType(subProj_bt_1852_0)
})
