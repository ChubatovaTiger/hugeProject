package subProj_1042

import subProj_1042.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1042")
    name = "subProj 1042"

    buildType(subProj_bt_1042_5)
    buildType(subProj_bt_1042_1)
    buildType(subProj_bt_1042_2)
    buildType(subProj_bt_1042_3)
    buildType(subProj_bt_1042_4)
    buildType(subProj_bt_1042_0)
})
