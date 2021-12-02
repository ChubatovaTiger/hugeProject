package subProj_1285

import subProj_1285.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1285")
    name = "subProj 1285"

    buildType(subProj_bt_1285_4)
    buildType(subProj_bt_1285_5)
    buildType(subProj_bt_1285_2)
    buildType(subProj_bt_1285_3)
    buildType(subProj_bt_1285_0)
    buildType(subProj_bt_1285_1)
})
