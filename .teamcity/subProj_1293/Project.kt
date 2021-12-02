package subProj_1293

import subProj_1293.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1293")
    name = "subProj 1293"

    buildType(subProj_bt_1293_2)
    buildType(subProj_bt_1293_1)
    buildType(subProj_bt_1293_0)
    buildType(subProj_bt_1293_5)
    buildType(subProj_bt_1293_4)
    buildType(subProj_bt_1293_3)
})
