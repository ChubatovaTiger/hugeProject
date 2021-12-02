package subProj_1453

import subProj_1453.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1453")
    name = "subProj 1453"

    buildType(subProj_bt_1453_0)
    buildType(subProj_bt_1453_5)
    buildType(subProj_bt_1453_2)
    buildType(subProj_bt_1453_1)
    buildType(subProj_bt_1453_4)
    buildType(subProj_bt_1453_3)
})
